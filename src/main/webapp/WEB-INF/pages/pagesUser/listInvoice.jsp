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
				<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/">Home</a> <i
					class="fa fa-angle-right"></i></li>
			</ol>
			<!--four-grids here-->
			<div class="four-grids">
				
				<div class="col-md-12 agile-info-stat">
					<div class="stats-info stats-last widget-shadow">
						<table class="table stats-table ">
							<h1>Danh sách các đơn đặt hàng</h1>
							<thead>
								<tr>
									<th>STT</th>
									<th>Người đặt hàng</th>
									<th>Địa chỉ</th>
									<th>Số điện thoại</th>
									<th>Tên Sản Phẩm</th>
									<th>Tùy chọn</th>
								</tr>
							</thead>
							<tbody>
								<%!int i = 1;%>
								<c:forEach items="${invoicedetails}" var="lst">
									<tr>
										<th scope="row">
											<%
												out.println(i++);
											%>
										</th>
										<td>${lst.user.username}</td>
										<td>${lst.address}</td>
										<td>${lst.phone}</td>
										<td>${lst.product.idProduct}</td>

										<th> <a
											href="${pageContext.request.contextPath}/trang-quan-ly/xoa-don-hang/${lst.idInvoice}"
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


