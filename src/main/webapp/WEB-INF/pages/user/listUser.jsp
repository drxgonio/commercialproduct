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
				<li class="breadcrumb-item"><a href="index.html">Home</a> <i
					class="fa fa-angle-right"></i></li>
			</ol>
			<!--four-grids here-->
			<div class="four-grids">
			<div class="col-md-3">
					<a class="btn btn-success col-12"
						href="${pageContext.request.contextPath}/trang-quan-ly/them-danh-muc"> <i
						class="fa fa-plus"></i> Thêm người dùng
					</a>
				</div>
				<div class="col-md-12 agile-info-stat">
					<div class="stats-info stats-last widget-shadow">
						<table class="table stats-table ">
							<h1>Danh sách người dùng</h1>
							<thead>
								<tr>
									<th>STT</th>
									<th>Họ tên</th>
									<th>Email</th>
									<th>Số điện thoại</th>
									
									<th>Địa chỉ</th>

									<th>Tùy chọn</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${lstUser}" var="lst">
									<tr>
										<th scope="row">1</th>
										<td>${lst.nameUser}</td>
										<td>${lst.email }</td>
										<td>${lst.phoneNumber }</td>
										
										<th>${lst.address }</th>
										<th><a
												href="#"
												class="btn btn-warning"><i class="fa fa-pencil"></i></a> <a
												href="#"
												class="btn btn-warning"><i class="fa fa-trash"></i></a></th>
									</tr>
								</c:forEach>


							</tbody>
						</table>
					</div>
				</div>

			</div>

			<div class="clearfix"></div>
		</div>


		<!--//w3-agileits-pane-->
		<!-- script-for sticky-nav -->
		<script>
			$(document).ready(function() {
				var navoffeset = $(".header-main").offset().top;
				$(window).scroll(function() {
					var scrollpos = $(window).scrollTop();
					if (scrollpos >= navoffeset) {
						$(".header-main").addClass("fixed");
					} else {
						$(".header-main").removeClass("fixed");
					}
				});

			});
		</script>
		
		
	</div>
</div>
<!--//content-inner-->
<!--/sidebar-menu-->

<div class="clearfix"></div>
</div>



