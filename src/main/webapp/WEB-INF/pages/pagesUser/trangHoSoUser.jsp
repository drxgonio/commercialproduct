<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
<div class="gallery-grids">
	<div class="container">
		<h2 class="w3ls_head">
			<span>Thông tin</span>đặt hàng
		</h2>
		<p class="w3ls_head">Chào:${user.nameUser}....</p>
		<div class="row">

			<div class="col-md-8 col-lg-8 agile-gallery-grid">
				<div class="agile-gallery">
					<a href="#" class="lsb-preview" data-lsb-group="header"> <img
						src="${product.image }" alt="" />

					</a>
				</div>
			</div>
			<div class="col-md-4 col-lg-4 agile-gallery-grid">
				<h3>Tên sản phẩm:${product.nameProduct }</h3>
				<br> <span>Giá:${product.price }</span><br>
				<h3>Tên:${pageContext.request.userPrincipal.name}</h3>
				<br> 
				<br> <label>Tên người mua:</label> <input
					class="form-control" placeholder="Tên người mua" value="${user.nameUser} " disabled/>
				<br> <label>Địa chỉ:</label> <input
					class="form-control" placeholder="Địa chỉ" value="${user.address}"/> <br>
				<label>Số điện thoại:</label> <input class="form-control"
					placeholder="Số điện thoại"  value="${user.phoneNumber}"/><br>
					<button type="submit"
										class="btn btn-danger btn-block btn-lg btn-fill">Lưu
										thông tin</button>
			</div>
		</div>
		
		<script>
				$(window).load(function() {
				  $.fn.lightspeedBox();
				});

			</script>
	</div>
</div>