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
					class="fa fa-angle-right"></i>Danh sách sản phẩm</li>
			</ol>
			<div class="row"></div>
			<!--four-grids here-->
			<div class="four-grids">
				<div class="col-md-3">
					<a class="btn btn-success col-12"
						href="${pageContext.request.contextPath}/them-san-pham"> <i
						class="fa fa-plus"></i> Thêm sản phẩm
					</a>
				</div>
				<div class="col-md-12 agile-info-stat">
					<div class="stats-info stats-last widget-shadow">
						<table class="table stats-table ">

							<h1>Danh sách sản phẩm</h1>
							<u:form class="row" id="contact_form">
								<div class="col-md-4">
									<label>Chọn danh mục</label> <br> <br> <select
										class="form-control" name="name" id="name">
										<c:forEach items="${lstCategory}" var="lst">
											<option>${lst.nameCategory}</option>

										</c:forEach>


									</select>	
									<br><br>		
								</div>
								<div class="col-md-2 "><br><br>
											<button type="submit"
												class="btn btn-danger btn-block btn-lg btn-fill">Tìm kiếm</button>
												<br><br>	
										</div>
								
								<br>
								<br>
								<thead>
									<tr>
										<th>STT</th>
										<th>Tên sản phẩm</th>
										<th>Tiêu đề</th>
										<th>Giá</th>
										<th>Image</th>

										<th>Tùy chọn</th>
									</tr>
								</thead>
								<tbody>

									<c:forEach items="${lstProduct}" var="lst">
										<tr>
											<%!int i = 1;%>
											<th scope="row">
												<%
														out.println(i++);
													%>
											</th>
											<td>${lst.nameProduct}</td>
											<td>${lst.title }</td>
											<td>${lst.price}</td>
											<th>Image</th>
											<th><a
												href="${pageContext.request.contextPath}/sua-san-pham/${lst.idProduct}"
												class="btn btn-warning"><i class="fa fa-pencil"></i></a> <a
												href="${pageContext.request.contextPath}/xoa-san-pham/${lst.idProduct}"
												class="btn btn-warning"><i class="fa fa-trash"></i></a></th>
										</tr>
									</c:forEach>

								</tbody>

							</u:form>


						</table>

					</div>
				</div>

			</div>

		</div>

		<div class="clearfix"></div>
	</div>
	<!-- Dùng ajax đưa dữ liệu của Category qua Controller -->
	<script type="text/javascript">
	$(document).ready(function(e) {
		$("#contact_form").bind("submit", function(event) {
			event.preventDefault();
			$.ajax({
				url : '/TradeProducts/saveContact', // point to server-side controller
				dataType : 'html', // what to expect back from the controller
				cache : false,
				data : $("#contact_form").serialize(),
				type : 'post',
				success : function(response) {
					$('#msg').html('<span style="color:green;">'+response+'</span>'); // display success response from the controller
				},
				error : function(response) {
					$('#msg').html('<span style="color:red;">'+response+'</span>'); // display error response from the controller
				}
			});
		});
	});
</script>
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
	<!-- /script-for sticky-nav -->
	<!--inner block start here-->
	<div class="inner-block"></div>


</div>
</div>
<!--//content-inner-->
<!--/sidebar-menu-->

<div class="clearfix"></div>
</div>
<script>
	var toggle = true;

	$(".sidebar-icon").click(
			function() {
				if (toggle) {
					$(".page-container").addClass("sidebar-collapsed")
							.removeClass("sidebar-collapsed-back");
					$("#menu span").css({
						"position" : "absolute"
					});
				} else {
					$(".page-container").removeClass("sidebar-collapsed")
							.addClass("sidebar-collapsed-back");
					setTimeout(function() {
						$("#menu span").css({
							"position" : "relative"
						});
					}, 400);
				}

				toggle = !toggle;
			});
</script>


