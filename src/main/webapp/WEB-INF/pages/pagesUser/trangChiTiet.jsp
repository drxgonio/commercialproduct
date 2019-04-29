<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
<div class="gallery-grids">
	<div class="container">
		<h2 class="w3ls_head">
			<span>Thông tin</span>đặt hàng
		</h2>
		<p class="w3ls_head">Chào:${user.nameUser}...bạn vui lòng điền đầy
			đủ thông tin để nhận hàng.</p>
		<div class="row">

			<div class="col-md-8 col-lg-8 agile-gallery-grid">
				<div class="agile-gallery">
					<a href="#" class="lsb-preview" data-lsb-group="header"> <img
						src="${product.image }" alt="" />

					</a>
				</div>
			</div>
			<u:form class="col-md-4 col-lg-4 agile-gallery-grid" method="post"
				action="trang-dat-mua-san-pham" modelAttribute="invoiceDetails">
				<h3>Tên sản phẩm:${product.nameProduct }</h3>
				<u:input path="product.idProduct" value="${product.idProduct } " type="hidden"/>
				<u:input path="user.username" value="${user.username } " type="hidden"/>
				<br>
				<span>Giá:${product.price }</span>
				<br>
				<h3>Tên:${product.user.username}</h3>
				<br>
				<br>
				<label>Tên người mua:</label>
				<input class="form-control" placeholder="Tên người mua"
					value="${user.nameUser} " disabled />
				<br>
				<label>Địa chỉ:</label>
				<u:input class="form-control" placeholder="Địa chỉ"
					value="${user.address}" path="address" />
				<br>
				<label>Số điện thoại:</label>
				<u:input class="form-control" placeholder="Số điện thoại"
					value="${user.phoneNumber}" path="phone" />
				<br>
				<button type="submit"
										class="btn btn-danger btn-block btn-lg btn-fill" onclick="thanhcong()">Lưu
										thông tin ne</button>

			</u:form>
		</div>

		<script>
			$(window).load(function() {
				$.fn.lightspeedBox();
			});
		</script>
		<script >
		function thanhcong() {
			  alert("Bạn đã đặt mua thành công....Vui lòng vào hồ sơ cá nhân để xem lại...");
			}
		</script>
	</div>
</div>