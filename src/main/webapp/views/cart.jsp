<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:url value="/templates/assets" var="url"></c:url>


<!-- Body BEGIN -->
<body class="ecommerce">
    <!-- BEGIN STYLE CUSTOMIZER -->
    <div class="color-panel hidden-sm">
      <div class="color-mode-icons icon-color"></div>
      <div class="color-mode-icons icon-color-close"></div>
      <div class="color-mode">
        <p>THEME COLOR</p>
        <ul class="inline">
          <li class="color-red current color-default" data-style="red"></li>
          <li class="color-blue" data-style="blue"></li>
          <li class="color-green" data-style="green"></li>
          <li class="color-orange" data-style="orange"></li>
          <li class="color-gray" data-style="gray"></li>
          <li class="color-turquoise" data-style="turquoise"></li>
        </ul>
      </div>
    </div>
    <!-- END BEGIN STYLE CUSTOMIZER --> 

    <!-- BEGIN TOP BAR -->
    <div class="pre-header">
        <div class="container">
            <div class="row">
                <!-- BEGIN TOP BAR LEFT PART -->
                <div class="col-md-6 col-sm-6 additional-shop-info">
                    <ul class="list-unstyled list-inline">
                        <li><i class="fa fa-phone"></i><span>+1 456 6717</span></li>
                        <!-- BEGIN CURRENCIES -->
                        <li class="shop-currencies">
                            <a href="javascript:void(0);">€</a>
                            <a href="javascript:void(0);">£</a>
                            <a href="javascript:void(0);" class="current">$</a>
                        </li>
                        <!-- END CURRENCIES -->
                        <!-- BEGIN LANGS -->
                        <li class="langs-block">
                            <a href="javascript:void(0);" class="current">English </a>
                            <div class="langs-block-others-wrapper"><div class="langs-block-others">
                              <a href="javascript:void(0);">French</a>
                              <a href="javascript:void(0);">Germany</a>
                              <a href="javascript:void(0);">Turkish</a>
                            </div></div>
                        </li>
                        <!-- END LANGS -->
                    </ul>
                </div>
                <!-- END TOP BAR LEFT PART -->
                <!-- BEGIN TOP BAR MENU -->
                <div class="col-md-6 col-sm-6 additional-nav">
                    <ul class="list-unstyled list-inline pull-right">
                        <li><a href="shop-account.html">My Account</a></li>
                        <li><a href="shop-wishlist.html">My Wishlist</a></li>
                        <li><a href="shop-checkout.html">Checkout</a></li>
                        <li><a href="page-login.html">Log In</a></li>
                    </ul>
                </div>
                <!-- END TOP BAR MENU -->
            </div>
        </div>        
    </div>
    <!-- END TOP BAR -->

    <!-- BEGIN HEADER -->
    <div class="header">
      <div class="container">
        <a class="site-logo" href="shop-index.html"><img src="${url}/frontend/layout/img/logos/logo-shop-red.png" alt="Metronic Shop UI"></a>

        <a href="javascript:void(0);" class="mobi-toggler"><i class="fa fa-bars"></i></a>

        <!-- BEGIN CART -->
        <div class="top-cart-block">
          <div class="top-cart-info">
            <a id="cartQuantity"  class="top-cart-info-count">${cartQuantity } items</a>
            <a id="cartCharge"  class="top-cart-info-value">${cartCharge }</a>
          </div>
          <i class="fa fa-shopping-cart"></i>
                        
          <div class="top-cart-content-wrapper">
            <div class="top-cart-content">
              <ul class="scroller" style="height: 250px;">
                <li>
                  <a href="shop-item.html"><img src="${url}/frontend/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
                  <span class="cart-content-count">x 1</span>
                  <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
                  <em>$1230</em>
                  <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
                </li>
                <li>
                  <a href="shop-item.html"><img src="${url}/frontend/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
                  <span class="cart-content-count">x 1</span>
                  <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
                  <em>$1230</em>
                  <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
                </li>
                <li>
                  <a href="shop-item.html"><img src="${url}/frontend/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
                  <span class="cart-content-count">x 1</span>
                  <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
                  <em>$1230</em>
                  <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
                </li>
                <li>
                  <a href="shop-item.html"><img src="${url}/frontend/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
                  <span class="cart-content-count">x 1</span>
                  <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
                  <em>$1230</em>
                  <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
                </li>
                <li>
                  <a href="shop-item.html"><img src="${url}/frontend/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
                  <span class="cart-content-count">x 1</span>
                  <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
                  <em>$1230</em>
                  <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
                </li>
                <li>
                  <a href="shop-item.html"><img src="${url}/frontend/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
                  <span class="cart-content-count">x 1</span>
                  <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
                  <em>$1230</em>
                  <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
                </li>
                <li>
                  <a href="shop-item.html"><img src="${url}/frontend/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
                  <span class="cart-content-count">x 1</span>
                  <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
                  <em>$1230</em>
                  <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
                </li>
                <li>
                  <a href="shop-item.html"><img src="${url}/frontend/pages/img/cart-img.jpg" alt="Rolex Classic Watch" width="37" height="34"></a>
                  <span class="cart-content-count">x 1</span>
                  <strong><a href="shop-item.html">Rolex Classic Watch</a></strong>
                  <em>$1230</em>
                  <a href="javascript:void(0);" class="del-goods">&nbsp;</a>
                </li>
              </ul>
              <div class="text-right">
                <a href="shop-shopping-cart.html" class="btn btn-default">View Cart</a>
                <a href="shop-checkout.html" class="btn btn-primary">Checkout</a>
              </div>
            </div>
          </div>            
        </div>
        <!--END CART -->

        <!-- BEGIN NAVIGATION -->
        <div class="header-navigation">
          <ul>
            <li class="dropdown">
              <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="#">
                Woman 
                
              </a>
                
              <!-- BEGIN DROPDOWN MENU -->
              <ul class="dropdown-menu">
                <li class="dropdown-submenu">
                  <a href="shop-product-list.html">Hi Tops <i class="fa fa-angle-right"></i></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="shop-product-list.html">Second Level Link</a></li>
                    <li><a href="shop-product-list.html">Second Level Link</a></li>
                    <li class="dropdown-submenu">
                      <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="#">
                        Second Level Link 
                        <i class="fa fa-angle-right"></i>
                      </a>
                      <ul class="dropdown-menu">
                        <li><a href="shop-product-list.html">Third Level Link</a></li>
                        <li><a href="shop-product-list.html">Third Level Link</a></li>
                        <li><a href="shop-product-list.html">Third Level Link</a></li>
                      </ul>
                    </li>
                  </ul>
                </li>
                <li><a href="shop-product-list.html">Running Shoes</a></li>
                <li><a href="shop-product-list.html">Jackets and Coats</a></li>
              </ul>
              <!-- END DROPDOWN MENU -->
            </li>
            <li class="dropdown dropdown-megamenu">
              <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="#">
                Man
                
              </a>
              <ul class="dropdown-menu">
                <li>
                  <div class="header-navigation-content">
                    <div class="row">
                      <div class="col-md-4 header-navigation-col">
                        <h4>Footwear</h4>
                        <ul>
                          <li><a href="shop-product-list.html">Astro Trainers</a></li>
                          <li><a href="shop-product-list.html">Basketball Shoes</a></li>
                          <li><a href="shop-product-list.html">Boots</a></li>
                          <li><a href="shop-product-list.html">Canvas Shoes</a></li>
                          <li><a href="shop-product-list.html">Football Boots</a></li>
                          <li><a href="shop-product-list.html">Golf Shoes</a></li>
                          <li><a href="shop-product-list.html">Hi Tops</a></li>
                          <li><a href="shop-product-list.html">Indoor and Court Trainers</a></li>
                        </ul>
                      </div>
                      <div class="col-md-4 header-navigation-col">
                        <h4>Clothing</h4>
                        <ul>
                          <li><a href="shop-product-list.html">Base Layer</a></li>
                          <li><a href="shop-product-list.html">Character</a></li>
                          <li><a href="shop-product-list.html">Chinos</a></li>
                          <li><a href="shop-product-list.html">Combats</a></li>
                          <li><a href="shop-product-list.html">Cricket Clothing</a></li>
                          <li><a href="shop-product-list.html">Fleeces</a></li>
                          <li><a href="shop-product-list.html">Gilets</a></li>
                          <li><a href="shop-product-list.html">Golf Tops</a></li>
                        </ul>
                      </div>
                      <div class="col-md-4 header-navigation-col">
                        <h4>Accessories</h4>
                        <ul>
                          <li><a href="shop-product-list.html">Belts</a></li>
                          <li><a href="shop-product-list.html">Caps</a></li>
                          <li><a href="shop-product-list.html">Gloves, Hats and Scarves</a></li>
                        </ul>

                        <h4>Clearance</h4>
                        <ul>
                          <li><a href="shop-product-list.html">Jackets</a></li>
                          <li><a href="shop-product-list.html">Bottoms</a></li>
                        </ul>
                      </div>
                      <div class="col-md-12 nav-brands">
                        <ul>
                          <li><a href="shop-product-list.html"><img title="esprit" alt="esprit" src="${url}/frontend/pages/img/brands/esprit.jpg"></a></li>
                          <li><a href="shop-product-list.html"><img title="gap" alt="gap" src="${url}/frontend/pages/img/brands/gap.jpg"></a></li>
                          <li><a href="shop-product-list.html"><img title="next" alt="next" src="${url}/frontend/pages/img/brands/next.jpg"></a></li>
                          <li><a href="shop-product-list.html"><img title="puma" alt="puma" src="${url}/frontend/pages/img/brands/puma.jpg"></a></li>
                          <li><a href="shop-product-list.html"><img title="zara" alt="zara" src="${url}/frontend/pages/img/brands/zara.jpg"></a></li>
                        </ul>
                      </div>
                    </div>
                  </div>
                </li>
              </ul>
            </li>
            <li><a href="shop-item.html">Kids</a></li>
            <li class="dropdown dropdown100 nav-catalogue">
              <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="#">
                New
                
              </a>
              <ul class="dropdown-menu">
                <li>
                  <div class="header-navigation-content">
                    <div class="row">
                      <div class="col-md-3 col-sm-4 col-xs-6">
                        <div class="product-item">
                          <div class="pi-img-wrapper">
                            <a href="shop-item.html"><img src="${url}/frontend/pages/img/products/model4.jpg" class="img-responsive" alt="Berry Lace Dress"></a>
                          </div>
                          <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                          <div class="pi-price">$29.00</div>
                          <a href="#" class="btn btn-default add2cart">Add to cart</a>
                        </div>
                      </div>
                      <div class="col-md-3 col-sm-4 col-xs-6">
                        <div class="product-item">
                          <div class="pi-img-wrapper">
                            <a href="shop-item.html"><img src="${url}/frontend/pages/img/products/model3.jpg" class="img-responsive" alt="Berry Lace Dress"></a>
                          </div>
                          <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                          <div class="pi-price">$29.00</div>
                          <a href="#" class="btn btn-default add2cart">Add to cart</a>
                        </div>
                      </div>
                      <div class="col-md-3 col-sm-4 col-xs-6">
                        <div class="product-item">
                          <div class="pi-img-wrapper">
                            <a href="shop-item.html"><img src="${url}/frontend/pages/img/products/model7.jpg" class="img-responsive" alt="Berry Lace Dress"></a>
                          </div>
                          <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                          <div class="pi-price">$29.00</div>
                          <a href="#" class="btn btn-default add2cart">Add to cart</a>
                        </div>
                      </div>
                      <div class="col-md-3 col-sm-4 col-xs-6">
                        <div class="product-item">
                          <div class="pi-img-wrapper">
                            <a href="shop-item.html"><img src="${url}/frontend/pages/img/products/model4.jpg" class="img-responsive" alt="Berry Lace Dress"></a>
                          </div>
                          <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                          <div class="pi-price">$29.00</div>
                          <a href="#" class="btn btn-default add2cart">Add to cart</a>
                        </div>
                      </div>
                    </div>
                  </div>
                </li>
              </ul>
            </li>
            <li class="dropdown active">
              <a class="dropdown-toggle" data-toggle="dropdown" data-target="#" href="#">
                Pages 
                
              </a>
                
              <ul class="dropdown-menu">
                <li><a href="shop-index.html">Home Default</a></li>
                <li><a href="shop-index-header-fix.html">Home Header Fixed</a></li>
                <li><a href="shop-index-light-footer.html">Home Light Footer</a></li>
                <li><a href="shop-product-list.html">Product List</a></li>
                <li><a href="shop-search-result.html">Search Result</a></li>
                <li><a href="shop-item.html">Product Page</a></li>
                <li><a href="shop-shopping-cart-null.html">Shopping Cart (Null Cart)</a></li>
                <li class="active"><a href="shop-shopping-cart.html">Shopping Cart</a></li>
                <li><a href="shop-checkout.html">Checkout</a></li>
                <li><a href="shop-about.html">About</a></li>
                <li><a href="shop-contacts.html">Contacts</a></li>
                <li><a href="shop-account.html">My account</a></li>
                <li><a href="shop-wishlist.html">My Wish List</a></li>
                <li><a href="shop-goods-compare.html">Product Comparison</a></li>
                <li><a href="shop-standart-forms.html">Standart Forms</a></li>
                <li><a href="shop-faq.html">FAQ</a></li>
                <li><a href="shop-privacy-policy.html">Privacy Policy</a></li>
                <li><a href="shop-terms-conditions-page.html">Terms &amp; Conditions</a></li>
              </ul>
            </li>
            <li><a href="index.html" target="_blank">Corporate</a></li>
            <li><a href="onepage-index.html" target="_blank">One Page</a></li>
            <li><a href="http://keenthemes.com/preview/metronic/theme/templates/admin&amp;page=ecommerce_index.html" target="_blank">Admin theme</a></li>

            <!-- BEGIN TOP SEARCH -->
            <li class="menu-search">
              <span class="sep"></span>
              <i class="fa fa-search search-btn"></i>
              <div class="search-box">
                <form action="#">
                  <div class="input-group">
                    <input type="text" placeholder="Search" class="form-control">
                    <span class="input-group-btn">
                      <button class="btn btn-primary" type="submit">Search</button>
                    </span>
                  </div>
                </form>
              </div> 
            </li>
            <!-- END TOP SEARCH -->
          </ul>
        </div>
        <!-- END NAVIGATION -->
      </div>
    </div>
    <!-- Header END -->

    <div class="main">
      <div class="container">
        <!-- BEGIN SIDEBAR & CONTENT -->
        <div class="row margin-bottom-40">
          <!-- BEGIN CONTENT -->
          <div class="col-md-12 col-sm-12">
            <h1>Shopping cart</h1>
            <div class="goods-page">
              <div class="goods-data clearfix">
                <div class="table-wrapper-responsive">
                <table summary="Shopping cart">
                  <tr>
                    <th class="goods-page-image">Image</th>
                    <th class="goods-page-description">Product Name</th>
                    <th class="goods-page-ref-no">Cart ID</th>
                    <th class="goods-page-quantity">Quantity</th>
                    <th class="goods-page-price">Unit price</th>
                    <th class="goods-page-total" colspan="2">Total</th>
                  </tr>
                  
                  <c:forEach items="${cart.values()}" var="cart">
                  <tr>
                    <td class="goods-page-image">
                    	<c:url value="/image?fname=${cart.product.picture}" var="imgUrl"></c:url>
						<img height="100" width="150" src="${imgUrl}" />
                    </td>
                    <td class="goods-page-description">
                      <h3><a href="/BanHang/detail?pid=${cart.product.id }">${cart.product.name }</a></h3>
                    </td>
                    <td class="goods-page-ref-no">
                      ${cart.id }
                    </td>
                    <td class="goods-page-quantity">
                      <div class="product-quantity">
                          <input id="product-quantity" type="number" value="${cart.amount }" class="" onblur="updateCart(${cart.product.id}, this)">
                      </div>
                    </td>
                    <td class="goods-page-price">
                      <strong><span>$</span>${cart.price }</strong>
                    </td>
                    <td class="goods-page-total">
                      <strong><span>$</span>${cart.amount * cart.price }</strong>
                    </td>
                    <td class="del-goods-col">
                      <a class="del-goods" href="#">&nbsp;</a>
                    </td>
                  </tr>
                 </c:forEach>
                 

                </table>
                </div>

                <div class="shopping-total">
                  <ul>
                    <li class="shopping-total-price">
                      <em>Total</em>
                      <strong id="total" class="price"><span>$</span>${cartCharge }</strong>
                    </li>
                  </ul>
                </div>
              
              </div>
              <button class="btn btn-default" type="submit">Continue shopping <i class="fa fa-shopping-cart"></i></button>
              <button class="btn btn-primary" type="submit">Checkout <i class="fa fa-check"></i></button>
            </div>
          </div>
          <!-- END CONTENT -->
        </div>
        <!-- END SIDEBAR & CONTENT -->

        <!-- BEGIN SIMILAR PRODUCTS -->
        <div class="row margin-bottom-40">
          <div class="col-md-12 col-sm-12">
            <h2>Most popular products</h2>
            <div class="owl-carousel owl-carousel4">
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${url}/frontend/pages/img/products/k1.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${url}/frontend/pages/img/products/k1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                  <div class="sticker sticker-new"></div>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${url}/frontend/pages/img/products/k2.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${url}/frontend/pages/img/products/k2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress2</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${url}/frontend/pages/img/products/k3.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${url}/frontend/pages/img/products/k3.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress3</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${url}/frontend/pages/img/products/k4.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${url}/frontend/pages/img/products/k4.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress4</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                  <div class="sticker sticker-sale"></div>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${url}/frontend/pages/img/products/k1.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${url}/frontend/pages/img/products/k1.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress5</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                </div>
              </div>
              <div>
                <div class="product-item">
                  <div class="pi-img-wrapper">
                    <img src="${url}/frontend/pages/img/products/k2.jpg" class="img-responsive" alt="Berry Lace Dress">
                    <div>
                      <a href="${url}/frontend/pages/img/products/k2.jpg" class="btn btn-default fancybox-button">Zoom</a>
                      <a href="#product-pop-up" class="btn btn-default fancybox-fast-view">View</a>
                    </div>
                  </div>
                  <h3><a href="shop-item.html">Berry Lace Dress6</a></h3>
                  <div class="pi-price">$29.00</div>
                  <a href="#" class="btn btn-default add2cart">Add to cart</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- END SIMILAR PRODUCTS -->
      </div>
    </div>

    <!-- BEGIN STEPS -->
    <div class="steps-block steps-block-red">
      <div class="container">
        <div class="row">
          <div class="col-md-4 steps-block-col">
            <i class="fa fa-truck"></i>
            <div>
              <h2>Free shipping</h2>
              <em>Express delivery withing 3 days</em>
            </div>
            <span>&nbsp;</span>
          </div>
          <div class="col-md-4 steps-block-col">
            <i class="fa fa-gift"></i>
            <div>
              <h2>Daily Gifts</h2>
              <em>3 Gifts daily for lucky customers</em>
            </div>
            <span>&nbsp;</span>
          </div>
          <div class="col-md-4 steps-block-col">
            <i class="fa fa-phone"></i>
            <div>
              <h2>477 505 8877</h2>
              <em>24/7 customer care available</em>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- END STEPS -->

    <!-- BEGIN PRE-FOOTER -->
    <div class="pre-footer">
      <div class="container">
        <div class="row">
          <!-- BEGIN BOTTOM ABOUT BLOCK -->
          <div class="col-md-3 col-sm-6 pre-footer-col">
            <h2>About us</h2>
            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam sit nonummy nibh euismod tincidunt ut laoreet dolore magna aliquarm erat sit volutpat. Nostrud exerci tation ullamcorper suscipit lobortis nisl aliquip  commodo consequat. </p>
            <p>Duis autem vel eum iriure dolor vulputate velit esse molestie at dolore.</p>
          </div>
          <!-- END BOTTOM ABOUT BLOCK -->
          <!-- BEGIN BOTTOM INFO BLOCK -->
          <div class="col-md-3 col-sm-6 pre-footer-col">
            <h2>Information</h2>
            <ul class="list-unstyled">
              <li><i class="fa fa-angle-right"></i> <a href="#">Delivery Information</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="#">Customer Service</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="#">Order Tracking</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="#">Shipping & Returns</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="contacts.html">Contact Us</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="#">Careers</a></li>
              <li><i class="fa fa-angle-right"></i> <a href="#">Payment Methods</a></li>
            </ul>
          </div>
          <!-- END INFO BLOCK -->

          <!-- BEGIN TWITTER BLOCK --> 
          <div class="col-md-3 col-sm-6 pre-footer-col">
            <h2 class="margin-bottom-0">Latest Tweets</h2>
            <a class="twitter-timeline" href="https://twitter.com/twitterapi" data-tweet-limit="2" data-theme="dark" data-link-color="#57C8EB" data-widget-id="455411516829736961" data-chrome="noheader nofooter noscrollbar noborders transparent">Loading tweets by @keenthemes...</a>      
          </div>
          <!-- END TWITTER BLOCK -->
          
          <!-- BEGIN BOTTOM CONTACTS -->
          <div class="col-md-3 col-sm-6 pre-footer-col">
            <h2>Our Contacts</h2>
            <address class="margin-bottom-40">
              35, Lorem Lis Street, Park Ave<br>
              California, US<br>
              Phone: 300 323 3456<br>
              Fax: 300 323 1456<br>
              Email: <a href="mailto:info@metronic.com">info@metronic.com</a><br>
              Skype: <a href="skype:metronic">metronic</a>
            </address>
          </div>
          <!-- END BOTTOM CONTACTS -->
        </div>
        <hr>
        <div class="row">
          <!-- BEGIN SOCIAL ICONS -->
          <div class="col-md-6 col-sm-6">
            <ul class="social-icons">
              <li><a class="rss" data-original-title="rss" href="#"></a></li>
              <li><a class="facebook" data-original-title="facebook" href="#"></a></li>
              <li><a class="twitter" data-original-title="twitter" href="#"></a></li>
              <li><a class="googleplus" data-original-title="googleplus" href="#"></a></li>
              <li><a class="linkedin" data-original-title="linkedin" href="#"></a></li>
              <li><a class="youtube" data-original-title="youtube" href="#"></a></li>
              <li><a class="vimeo" data-original-title="vimeo" href="#"></a></li>
              <li><a class="skype" data-original-title="skype" href="#"></a></li>
            </ul>
          </div>
          <!-- END SOCIAL ICONS -->
          <!-- BEGIN NEWLETTER -->
          <div class="col-md-6 col-sm-6">
            <div class="pre-footer-subscribe-box pull-right">
              <h2>Newsletter</h2>
              <form action="#">
                <div class="input-group">
                  <input type="text" placeholder="youremail@mail.com" class="form-control">
                  <span class="input-group-btn">
                    <button class="btn btn-primary" type="submit">Subscribe</button>
                  </span>
                </div>
              </form>
            </div> 
          </div>
          <!-- END NEWLETTER -->
        </div>
      </div>
    </div>
    <!-- END PRE-FOOTER -->

    <!-- BEGIN FOOTER -->
    <div class="footer">
      <div class="container">
        <div class="row">
          <!-- BEGIN COPYRIGHT -->
          <div class="col-md-6 col-sm-6 padding-top-10">
            2014 © Metronic Shop UI. ALL Rights Reserved. 
          </div>
          <!-- END COPYRIGHT -->
          <!-- BEGIN PAYMENTS -->
          <div class="col-md-6 col-sm-6">
            <ul class="list-unstyled list-inline pull-right">
              <li><img src="${url}/frontend/layout/img/payments/western-union.jpg" alt="We accept Western Union" title="We accept Western Union"></li>
              <li><img src="${url}/frontend/layout/img/payments/american-express.jpg" alt="We accept American Express" title="We accept American Express"></li>
              <li><img src="${url}/frontend/layout/img/payments/MasterCard.jpg" alt="We accept MasterCard" title="We accept MasterCard"></li>
              <li><img src="${url}/frontend/layout/img/payments/PayPal.jpg" alt="We accept PayPal" title="We accept PayPal"></li>
              <li><img src="${url}/frontend/layout/img/payments/visa.jpg" alt="We accept Visa" title="We accept Visa"></li>
            </ul>
          </div>
          <!-- END PAYMENTS -->
        </div>
      </div>
    </div>
    <!-- END FOOTER -->

    <!-- BEGIN fast view of a product -->
    <div id="product-pop-up" style="display: none; width: 700px;">
            <div class="product-page product-pop-up">
              <div class="row">
                <div class="col-md-6 col-sm-6 col-xs-3">
                  <div class="product-main-image">
                    <img src="${url}/frontend/pages/img/products/model7.jpg" alt="Cool green dress with red bell" class="img-responsive">
                  </div>
                  <div class="product-other-images">
                    <a href="#" class="active"><img alt="Berry Lace Dress" src="${url}/frontend/pages/img/products/model3.jpg"></a>
                    <a href="#"><img alt="Berry Lace Dress" src="${url}/frontend/pages/img/products/model4.jpg"></a>
                    <a href="#"><img alt="Berry Lace Dress" src="${url}/frontend/pages/img/products/model5.jpg"></a>
                  </div>
                </div>
                <div class="col-md-6 col-sm-6 col-xs-9">
                  <h1>Cool green dress with red bell</h1>
                  <div class="price-availability-block clearfix">
                    <div class="price">
                      <strong><span>$</span>47.00</strong>
                      <em>$<span>62.00</span></em>
                    </div>
                    <div class="availability">
                      Availability: <strong>In Stock</strong>
                    </div>
                  </div>
                  <div class="description">
                    <p>Lorem ipsum dolor ut sit ame dolore  adipiscing elit, sed nonumy nibh sed euismod laoreet dolore magna aliquarm erat volutpat 
Nostrud duis molestie at dolore.</p>
                  </div>
                  <div class="product-page-options">
                    <div class="pull-left">
                      <label class="control-label">Size:</label>
                      <select class="form-control input-sm">
                        <option>L</option>
                        <option>M</option>
                        <option>XL</option>
                      </select>
                    </div>
                    <div class="pull-left">
                      <label class="control-label">Color:</label>
                      <select class="form-control input-sm">
                        <option>Red</option>
                        <option>Blue</option>
                        <option>Black</option>
                      </select>
                    </div>
                  </div>
                  <div class="product-page-cart">
                    <div class="product-quantity">
                        <input id="product-quantity3" type="text" value="1" readonly class="form-control input-sm">
                    </div>
                    <button class="btn btn-primary" type="submit">Add to cart</button>
                    <a href="shop-item.html" class="btn btn-default">More details</a>
                  </div>
                </div>

                <div class="sticker sticker-sale"></div>
              </div>
            </div>
    </div>
    <!-- END fast view of a product -->

    <!-- Load javascripts at bottom, this will reduce page load time -->
    <!-- BEGIN CORE PLUGINS (REQUIRED FOR ALL PAGES) -->
    <!--[if lt IE 9]>
    <script src="${url}/global/plugins/respond.min.js"></script>  
    <![endif]-->  
    <script src="${url}/global/plugins/jquery.min.js" type="text/javascript"></script>
    <script src="${url}/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
    <script src="${url}/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>      
    <script src="${url}/frontend/layout/scripts/back-to-top.js" type="text/javascript"></script>
    <script src="${url}/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->

    <!-- BEGIN PAGE LEVEL JAVASCRIPTS (REQUIRED ONLY FOR CURRENT PAGE) -->
    <script src="${url}/global/plugins/fancybox/source/jquery.fancybox.pack.js" type="text/javascript"></script><!-- pop up -->
    <script src="${url}/global/plugins/carousel-owl-carousel/owl-carousel/owl.carousel.min.js" type="text/javascript"></script><!-- slider for products -->
    <script src='${url}/global/plugins/zoom/jquery.zoom.min.js' type="text/javascript"></script><!-- product zoom -->
    <script src="${url}/global/plugins/bootstrap-touchspin/bootstrap.touchspin.js" type="text/javascript"></script><!-- Quantity -->
    <script src="${url}/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
    <script src="${url}/global/plugins/rateit/src/jquery.rateit.js" type="text/javascript"></script>
    <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js" type="text/javascript"></script><!-- for slider-range -->

    <script src="${url}/frontend/layout/scripts/layout.js" type="text/javascript"></script>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            Layout.init();    
            Layout.initOWL();
            Layout.initTwitter();
            Layout.initImageZoom();
            Layout.initTouchspin();
            Layout.initUniform();
            Layout.initSliderRange();
        });
    </script>
    <!-- END PAGE LEVEL JAVASCRIPTS -->
    
    
    <!-- MY SCRIPT -->
    <script>
    	function updateCart(productId, input){
    		$.ajax({
    			url : "/BanHang/api/update-cart",
    			type : "get",
    			data : {
    				id : productId,
    				amount : input.value
    			},
    			success : function(data) {
    				console.log(data)
    			},
    			error : function(xhr) {
    			}
    		});
    	}
    </script>
    
</body>
<!-- END BODY -->
</html>