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
						href="${pageContext.request.contextPath}/them-danh-muc"> <i
						class="fa fa-plus"></i> Thêm danh mục
					</a>
				</div>
				<div class="col-md-12 agile-info-stat">
					<div class="stats-info stats-last widget-shadow">
						<table class="table stats-table ">
							<h1>Danh mục</h1>
							<thead>
								<tr>
									<th>STT</th>
									<th>Tên Danh mục</th>
									<th>Tùy chọn</th>
								</tr>
							</thead>
							<tbody>
							<%! int i = 1; %> 
							<c:forEach items="${lstCategory}" var="lst">
								<tr>
									<th scope="row"><%  out.println(i++); %> </th>
									<td>${lst.nameCategory}</td>
								
									<th><a
												href="${pageContext.request.contextPath}/sua-san-pham/${lst.idCategory}"
												class="btn btn-warning"><i class="fa fa-pencil"></i></a> <a
												href="${pageContext.request.contextPath}/xoa-danh-muc/${lst.idCategory}"
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
