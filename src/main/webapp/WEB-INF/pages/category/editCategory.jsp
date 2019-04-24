<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
 <div class="page-container">
	<!--/content-inner-->
	<div class="left-content">
		<div class="mother-grid-inner">
			<!--header start here-->

			<!--heder end here-->
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="index.html">Home</a><i
					class="fa fa-angle-right"></i>Sửa danh mục</li>
			</ol>
			<!--four-grids here-->
			<div class="four-grids">
				<div class="col-md-12 agile-info-stat">
					<div class="stats-info stats-last widget-shadow">
						<u:form class="row" method="post" action="${pageContext.request.contextPath}/trang-quan-ly/sua-danh-muc"
							modelAttribute="Category">
						
							<div class="row">
							
									
									 <u:input type="hidden"
								path="idCategory" value="${category.idCategory }"/> 
										<br>
								<div class="col-md-4 col-sm-4">
									<br> <label>Tên danh mục</label>
									 <u:input
										class="form-control" placeholder="Tên danh mục"
										path="nameCategory" value="${category.nameCategory }"/> 
										<br> 

									</div>

								</div>
								<div class="col-md-4 col-sm-4">

									<br> <label>Hình ảnh</label> <u:input class="form-control"
										placeholder="Hình ảnh" path="image" value="${category.image }"/>
										
								</div>

							

							<div class="row" style="margin-top: 20px">
								
								<div class="col-md-4 col-sm-4">
									<br> <br> <br> <br>

									<button type="submit"
										class="btn btn-danger btn-block btn-lg btn-fill">Lưu
										thông tin</button>

								</div>
							</div>

						</u:form>
					</div>
				</div>

			</div>

			<div class="clearfix"></div>
		</div>

