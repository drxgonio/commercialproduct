<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="banner1">
	<div class="container">
		<nav class="navbar navbar-default">
			<div class="navbar-header navbar-left">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<h1>
					<a class="navbar-brand" href="index.html"><i
						class="fa fa-industry" aria-hidden="true"></i>Diligence</a>
				</h1>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-right"
				id="bs-example-navbar-collapse-1">
				<nav class="link-effect-8" id="link-effect-8">
					<ul class="nav navbar-nav">
						<li><a href="${pageContext.request.contextPath}/trang-chu">Trang chủ</a></li>
						<li><a href="#">Tìm kiếm</a></li>
						<li class="active"><a href="${pageContext.request.contextPath}/trang-dang-tin">Đăng tin</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Danh mục <b class="caret"></b></a>
							<ul class="dropdown-menu agile_short_dropdown">
								<li><a href="#">Đồ điện tử</a></li>
								<li><a href="#">Thực phẩm</a></li>
							</ul>
						</li>
						<!-- Nếu chưa đăng nhập thì load đăng nhập con rồi thì thôi -->
							<c:if
								test="${pageContext.request.userPrincipal.name == null}">
						<li><a href="${pageContext.request.contextPath}/login">Đăng
								nhập</a></li>
								</c:if>
						<c:if
								test="${pageContext.request.userPrincipal.name != null}">
  
     								| &nbsp;
    							<li> <a href="${pageContext.request.contextPath}/logout">Hi: ${pageContext.request.userPrincipal.name}</a></li>

							</c:if>
					</ul>
				</nav>
			</div>
		</nav>
	</div>
</div>