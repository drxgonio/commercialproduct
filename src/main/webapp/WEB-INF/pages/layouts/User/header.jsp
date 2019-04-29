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
					<a class="navbar-brand" href="${pageContext.request.contextPath}/"><i
						class="fa fa-industry" aria-hidden="true"></i>Trí nèkk</a>
				</h1>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-right"
				id="bs-example-navbar-collapse-1">
				<nav class="link-effect-8" id="link-effect-8">
					<ul class="nav navbar-nav">
						<li class="active"><a
							href="${pageContext.request.contextPath}/">Trang chủ</a></li>
				
						<li><a
							href="${pageContext.request.contextPath}/trang-dang-tin">Đăng
								tin</a></li>
						<li><a href="#">Giới thiệu về chúng tôi</a></li>

						<c:if test="${pageContext.request.userPrincipal.name == null}">
							<li><a href="${pageContext.request.contextPath}/login">Đăng
									nhập</a></li>
						</c:if>
						<c:if test="${pageContext.request.userPrincipal.name != null}">
							<li><a
								href="${pageContext.request.contextPath}/trang-quan-ly/${pageContext.request.userPrincipal.name}">Trang
									quản lý</a></li>
  								
     								| &nbsp;
    							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">Hi:
									${pageContext.request.userPrincipal.name} <b class="caret"></b>
							</a>
								<ul class="dropdown-menu agile_short_dropdown">
									<li><a href="${pageContext.request.contextPath}/doi-mat-khau/${pageContext.request.userPrincipal.name}">Đổi mật khẩu</a></li>
									<li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>
								</ul></li>
						</c:if>
					</ul>
				</nav>
			</div>
		</nav>
	</div>
</div>