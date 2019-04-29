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
					class="fa fa-angle-right"></i>Sữa người dùng</li>
			</ol>
			<!--four-grids here-->
			<u:form class="four-grids" method="post"
				action="${pageContext.request.contextPath}/doi-mat-khau"
				modelAttribute="User">
				<div class="col-md-12 agile-info-stat">
					<div class="stats-info stats-last widget-shadow">
						<div class="row">
							<div class="col-md-8 col-lg-8 agile-gallery-grid">
								<div class="agile-gallery">
									<a href="#" class="lsb-preview" data-lsb-group="header"> <img
										src="${user.image }" alt="" />

									</a>
								</div>
							</div>
							
							<div class="col-md-4 col-lg-4 agile-gallery-grid">


								<u:input class="form-control" placeholder="Tên đăng nhập"
									path="username" value="${user.username }" />
								<br>
								<u:input class="form-control" placeholder="Mật khẩu"
									path="password" value="${user.password }" />
								<br> <br>
								<button type="submit"
									class="btn btn-danger btn-block btn-lg btn-fill"
									onclick="doimatkhau()">Lưu thông tin</button>

							</div>
						</div>
						<div class="row">

							<div class="row">
							<div class="col-sm-8">
								<u:input type="hidden" path="address" value="${user.address }" />
							</div>
								<div class="col-sm-4">
									<u:input type="hidden" path="nameUser"
										value="${user.nameUser }" />
									<u:input type="hidden" path="identityCardNumber"
										value="${user.identityCardNumber }" />
									<u:input type="hidden" value="${user.gender }" path="gender" />


								</div>
								<br>
								<div class="col-sm-4">


									<u:input type="hidden" path="image" value="${user.image }" />
									<br>


								</div>
								<div class="col-sm-4">
									<u:input class="form-control" type="hidden" path="phoneNumber"
										value="${user.phoneNumber }" />
									<u:input type="hidden" path="email" value="${user.email }" />
								</div>
							</div>

							<div class="row" style="margin-top: 20px"></div>

						</div>
					</div>
				</div>

			</u:form>

			<div class="clearfix"></div>
		</div>


		<!--//w3-agileits-pane-->
		<!-- script-for sticky-nav -->
		<script>
			function doimatkhau() {
				alert("Đổi mật khẩu thành công!!! Vui lòng đăng nhập lại....")
			}
		</script>
		<!-- /script-for sticky-nav -->
		<!--inner block start here-->
		<div class="inner-block"></div>
		<!--inner block end here-->
		<!--copy rights start here-->

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


<script>
	$(document).ready(
			function() {
				//BOX BUTTON SHOW AND CLOSE
				jQuery('.small-graph-box').hover(function() {
					jQuery(this).find('.box-button').fadeIn('fast');
				}, function() {
					jQuery(this).find('.box-button').fadeOut('fast');
				});
				jQuery('.small-graph-box .box-close').click(function() {
					jQuery(this).closest('.small-graph-box').fadeOut(200);
					return false;
				});

				//CHARTS
				function gd(year, day, month) {
					return new Date(year, month - 1, day).getTime();
				}

				graphArea2 = Morris.Area({
					element : 'hero-area',
					padding : 10,
					behaveLikeLine : true,
					gridEnabled : false,
					gridLineColor : '#dddddd',
					axes : true,
					resize : true,
					smooth : true,
					pointSize : 0,
					lineWidth : 0,
					fillOpacity : 0.85,
					data : [ {
						period : '2014 Q1',
						iphone : 2668,
						ipad : null,
						itouch : 2649
					}, {
						period : '2014 Q2',
						iphone : 15780,
						ipad : 13799,
						itouch : 12051
					}, {
						period : '2014 Q3',
						iphone : 12920,
						ipad : 10975,
						itouch : 9910
					}, {
						period : '2014 Q4',
						iphone : 8770,
						ipad : 6600,
						itouch : 6695
					}, {
						period : '2015 Q1',
						iphone : 10820,
						ipad : 10924,
						itouch : 12300
					}, {
						period : '2015 Q2',
						iphone : 9680,
						ipad : 9010,
						itouch : 7891
					}, {
						period : '2015 Q3',
						iphone : 4830,
						ipad : 3805,
						itouch : 1598
					}, {
						period : '2015 Q4',
						iphone : 15083,
						ipad : 8977,
						itouch : 5185
					}, {
						period : '2016 Q1',
						iphone : 10697,
						ipad : 4470,
						itouch : 2038
					}, {
						period : '2016 Q2',
						iphone : 8442,
						ipad : 5723,
						itouch : 1801
					} ],
					lineColors : [ '#ff4a43', '#a2d200', '#22beef' ],
					xkey : 'period',
					redraw : true,
					ykeys : [ 'iphone', 'ipad', 'itouch' ],
					labels : [ 'All Visitors', 'Returning Visitors',
							'Unique Visitors' ],
					pointSize : 2,
					hideHover : 'auto',
					resize : true
				});

			});
</script>
