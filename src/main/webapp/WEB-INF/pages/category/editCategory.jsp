<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
 <div class="left-content">
	   <div class="mother-grid-inner">
             <!--header start here-->
				
		<ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="index.html">Home</a> <i class="fa fa-angle-right"></i></li>
            </ol>



		<div class="col-md-12 agile-info-stat">
			<div class="stats-info stats-last widget-shadow">
						<table class="table stats-table ">
							<h1>Danh sách khách hàng</h1>
							<thead>
								<tr>
									<th>STT</th>
									<th>Họ tên</th>
									<th>Email</th>
									<th>Số điện thoại</th>
									<th>Image</th>
									<th>Tùy chọn</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<th scope="row">1</th>
									<td>Nguyễn Văn B</td>
									<td><span class="label label-success">In progress</span></td>
									<td><h5>85% <i class="fa fa-level-up"></i></h5></td>
									<th>Image</th>
									<th>
										
                          <a href="#" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
                          <button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
                       
										 
									</th>
								</tr>
								<tr>
									<th scope="row">2</th>
									<td>Aliquam</td>
									<td><span class="label label-warning">New</span></td>
									<td><h5>35% <i class="fa fa-level-up"></i></h5></td>
									<th>Image</th>
									<th>
											<a href="#" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
											<button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
									 
									</th>
								</tr>
								<tr>
									<th scope="row">3</th>
									<td>Lorem ipsum</td>
									<td><span class="label label-danger">Overdue</span></td>
									<td><h5 class="down">40% <i class="fa fa-level-down"></i></h5></td>
									<th>Image</th>
									<th>
											<a href="#" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
											<button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
									 
									</th>
								</tr>
								<tr>
									<th scope="row">4</th>
									<td>Aliquam</td>
									<td><span class="label label-info">Out of stock</span></td>
									<td><h5>100% <i class="fa fa-level-up"></i></h5></td>
									<th>Image</th>
									<th> 
											<a href="#" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
											<button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
									 
									</th>
								</tr>
								<tr>
									<th scope="row">5</th>
									<td>Lorem ipsum</td>
									<td><span class="label label-success">In progress</span></td>
									<td><h5 class="down">10% <i class="fa fa-level-down"></i></h5></td>
									<th>Image</th>
									<th>
											<a href="#" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
											<button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
									 
									</th>
								</tr>
								<tr>
									<th scope="row">6</th>
									<td>Aliquam</td>
									<td><span class="label label-warning">New</span></td>
									<td><h5>38% <i class="fa fa-level-up"></i></h5></td>
									<th>Image</th>
									<th>
											<a href="#" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
											<button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
									 
									</th>
								</tr>
							</tbody>
						</table>
					</div>
			</div>
		  <div class="clearfix"></div>
	  </div>
	  <!--//w3-agileits-pane-->	
<!-- script-for sticky-nav -->
		<script>
		$(document).ready(function() {
			 var navoffeset=$(".header-main").offset().top;
			 $(window).scroll(function(){
				var scrollpos=$(window).scrollTop(); 
				if(scrollpos >=navoffeset){
					$(".header-main").addClass("fixed");
				}else{
					$(".header-main").removeClass("fixed");
				}
			 });
			 
		});
		</script>
		<!-- /script-for sticky-nav -->
<!--inner block start here-->
<div class="inner-block">

</div>

</div>