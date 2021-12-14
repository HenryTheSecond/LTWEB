package vn.banhang.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import vn.banhang.Model.Shop;
import vn.banhang.service.ShopService;
import vn.banhang.service.impl.ShopServiceImpl;
import vn.banhang.utils.Constant;

@WebServlet(urlPatterns = {"/admin/shop/add"})
public class ShopAddController extends HttpServlet{
	ShopService shopService = new ShopServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/admin/shop/add-shop.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Shop shop = new Shop();
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
		servletFileUpload.setHeaderEncoding("UTF-8");
		try {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
			List<FileItem> items = servletFileUpload.parseRequest(req);
			for (FileItem item : items) {
				if (item.getFieldName().equals("id")) {
					shop.setId(Integer.parseInt(item.getString()));
				} else if (item.getFieldName().equals("location")) {
					shop.setLocation(item.getString("UTF-8"));
				} else if (item.getFieldName().equals("name")) {
					shop.setName(item.getString("UTF-8"));
				} else if (item.getFieldName().equals("avatar")) {
					String originalFileName = item.getName();
					int index = originalFileName.lastIndexOf(".");
					String ext = originalFileName.substring(index + 1);
					String fileName = System.currentTimeMillis() + "." + ext;
					File file = new File(Constant.DIR + "/shop/" + fileName);
					item.write(file);
					shop.setAvatar("shop/" + fileName);
				}
			}
			shopService.insert(shop);
			resp.sendRedirect(req.getContextPath() + "/admin/shop/manage");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
