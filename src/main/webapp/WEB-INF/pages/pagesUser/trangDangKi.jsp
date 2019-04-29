<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
<div class="gallery-grids">
	<div class="container">
		<h2 class="w3ls_head">
			<span>Trang</span>dang ki
		</h2>
		<p class="w3agile">Điền đầy đủ thông tin để đăng kí</p>
		<div id="msg"></div>
		<div class="show-reel tel-prj">
			<u:form class="row" method="post" action="dang-ki-tai-khoan"
				modelAttribute="User" id="contact_form">
				<div class="row">
					<div class="col-sm-4">
						<u:input type="hidden" path="country" value="Việt Nam" />
						<label>Tên </label>
						<u:input class="form-control" placeholder="Tên người mua"
							path="nameUser" />
						<br> <label>Chứng minh thư</label>
						<u:input class="form-control" placeholder="Số chứng minh thư"
							path="identityCardNumber" />
						<br> <label>Giới tính</label>
						<u:select class="form-control" path="gender">
							<option>Nam</option>
							<option>Nữ</option>
						</u:select>

					</div>
					<br>
					<div class="col-sm-4">

						<%-- <label>Ngày sinh</label> <u:input class="form-control"
										type="text" placeholder="Ngày sinh" path="dateOfBirth" />  --%>
						<br> <label>Hình ảnh</label>
						<div class="input-default-wrapper mt-3">
							<u:input class="form-control" type="text"
								placeholder="Link hình ảnh" path="image" />
							<br>

						</div>
					</div>
					<div class="col-sm-4">
						<label>Điện thoại</label>
						<u:input class="form-control" type="number"
							placeholder="Số điện thoại" path="phoneNumber" />
						<br> <label>Email</label>
						<u:input class="form-control" placeholder="abc@gmail.com"
							path="email" />
					</div>
				</div>
				<div class="row">
					<div class="col-sm-8">
						<label>Địa chỉ</label>
						<u:input class="form-control" placeholder="Địa chỉ hiện tại"
							path="address" />
					</div>
					<div class="col-sm-4">


						<label>Tên đăng nhập</label>
						<u:input class="form-control" placeholder="Tên đăng nhập"
							path="username" />
						<br> <label>Mật khẩu</label>
						<u:input class="form-control" placeholder="Mật khẩu"
							path="password" />
						<br> <br>
						<button type="submit"
							class="btn btn-danger btn-block btn-lg btn-fill">Lưu
							thông tin</button>

					</div>
				</div>
				<div class="row" style="margin-top: 20px"></div>

			</u:form>
		</div>

		<div class="clearfix"></div>
	</div>



	<script>
				$(window).load(function() {
				  $.fn.lightspeedBox();
				});

			</script>
	<script type="text/javascript"
		src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<!-- Dùng ajax đưa dữ liệu của Category qua Controller -->
	<script type="text/javascript">
	$(document).ready(function(e) {
		$("#contact_form").bind("submit", function(event) {
			event.preventDefault();
			$.ajax({
				url : '/TradeProducts/dang-ki-tai-khoan', // point to server-side controller
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

</div>