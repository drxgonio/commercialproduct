<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
<div class="page-container">
	<!--/content-inner-->
	<div class="left-content">
		<div class="mother-grid-inner">
			<!--heder end here-->
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/">Home</a><i
					class="fa fa-angle-right"></i>Trang Admin</li>
					<div class="row">
							<h1>Hello:${pageContext.request.userPrincipal.name}</h1>
						<br>
						<h1>Tên:${user.nameUser }</h1>
					</div>
		
		
		
		</div>
	</div>
</div>