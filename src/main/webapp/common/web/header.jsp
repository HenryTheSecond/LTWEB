<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
  <a class="navbar-brand" href="#">Simple Ecommerce</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarScroll">
    <ul class="navbar-nav mr-auto my-2 my-lg-0 navbar-nav-scroll" style="max-height: 100px;">
      <li class="nav-item active">
        <a class="nav-link" href="home">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" aria-haspopup="true" href="#" id="navbarScrollingDropdown" role="button" data-toggle="dropdown" aria-expanded="false">
          Categories
        </a>
        <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown">
          <c:forEach items="${listcate}" var="o">
          <li><a class="dropdown-item ${tagactive == o.cate_id? "active": ""}" href="product?cid=${o.cate_id}">${o.icons} ${o.cname}</a></li>
         </c:forEach>
        </ul>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="product">Sản phẩm</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Sản phẩm nổi bật</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="views/cart.html">Giỏ hàng</a>
      </li>
      
      <c:choose >
      <c:when test="${acc == null}">  
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath }/login">Đăng nhập</a>
      </li>
      </c:when>
      <c:otherwise>
       <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath }/myaccount">${sessionScope.acc.user}</a>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath }/logout">Đăng xuất</a>
      </c:otherwise>
      </c:choose>
      
    </ul>
    <form action="search" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input name="txt" value="${txtS}" type="text" class="form-control" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary btn-number">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
                <a class="btn btn-success btn-sm ml-3" href="cart.html">
                    <i class="fa fa-shopping-cart"></i> Cart
                    <span class="badge badge-light">3</span>
                </a>
            </form>
   
  </div>
</nav>


<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">E-COMMERCE BOOTSTRAP THEME</h1>
        <p class="lead text-muted mb-0">Simple theme for e-commerce buid with Bootstrap 4.0.0. Pages available : home, category, product, cart & contact</p>
    </div>
</section>