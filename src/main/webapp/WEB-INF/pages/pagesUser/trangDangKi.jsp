<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
<div class="gallery-grids">
	<div class="container">
		<h2 class="w3ls_head">
			<span></span>Đăng kí tài khoản
		</h2>
		<p class="w3agile">Điền đầy đủ thông tin để đăng kí</p>
		<div id="msg"></div>
		<div class="show-reel tel-prj">
			<u:form class="row" method="post" action="dang-ki-tai-khoan"
				modelAttribute="User" id="contact_form">
				<div class="row">
					<div class="col-sm-4">
						<u:input type="hidden" path="country" value="Việt Nam" /><br>
						<label>Tên: (*) </label>
						<u:input class="form-control" placeholder="Tên người mua"
							path="nameUser" />
							<u:errors path="nameUser" cssClass="error"/> <br/><br/>
						<br> <label>Chứng minh thư</label>
						<u:input class="form-control" placeholder="Số chứng minh thư" type="number"
							path="identityCardNumber" />
							<u:errors path="identityCardNumber" cssClass="error"/> <br/><br/>
						<br> <label>Giới tính</label>
						<u:select class="form-control" path="gender">
							<option>Nam</option>
							<option>Nữ</option>
						</u:select>
						<br>
						<label>Địa chỉ</label>
						<u:input class="form-control" placeholder="Địa chỉ hiện tại"
							path="address" /><br>
							<u:errors path="address" cssClass="error"/> <br/><br/>
							
							<label>Điện thoại</label>
						<u:input class="form-control" type="number"
							placeholder="Số điện thoại" path="phoneNumber" />
							<u:errors path="phoneNumber" cssClass="error"/> <br/><br/>
						<br> 

					</div>
					<br>
					<div class="col-sm-4">

						<label>Tên đăng nhập: (*)</label>
						<u:input class="form-control" placeholder="Tên đăng nhập"
							path="username" />
							<u:errors path="username" cssClass="error"/> <br/><br/>
						<br> <label>Mật khẩu: (*)</label>
						<u:input class="form-control" placeholder="Mật khẩu"
							path="password" type="password"/>
							<u:errors path="password" cssClass="error"/> <br/><br/>
						<br> <br>
						
						
						<u:input class="form-control" placeholder="abc@gmail.com" type="hidden"
							path="email" value="abc@gmail.com"/>
						<br>
						<div class="input-default-wrapper mt-3">
							<u:input class="form-control" type="hidden"
								placeholder="Link hình ảnh" path="image" value="https://as1.ftcdn.net/jpg/02/32/00/56/500_F_232005653_eIpxlczz4ogjHFEQ5PYzGZgU6npGCyBg.jpg" />
							<br>

						</div>
					</div>
					<div class="col-sm-4">
						
					</div>
				</div>
				<div class="row">
					<div class="col-sm-8">
						
					</div>
					<div class="col-sm-4">

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

	

</div>