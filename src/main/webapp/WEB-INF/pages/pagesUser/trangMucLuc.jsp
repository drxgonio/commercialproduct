<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
	<div class="gallery-grids">
		<div class="container">
		<h2 class="w3ls_head"><span>Danh mục:</span>${category.nameCategory}</h2>
			<p class="w3agile">Danh sách các danh mục sản phẩm mà chúng tôi
			có.</p>
			<c:forEach items="${lstProductOrderBy}" var="lst">
			<div class="row">
				<div class="show-reel tel-prj">
					<div class="col-md-3 col-lg-3 agile-gallery-grid">
						<div class="agile-gallery">
							<a href="#" class="lsb-preview" data-lsb-group="header">
								<img src="${lst.image}" alt="" />
								<div class="agileits-caption">
									<h4>${lst.nameProduct}</h4>
									<p>${lst.date }</p>
								</div>
							</a>
						</div>
					</div>
				
					<div class="col-md-3 col-lg-9 agile-gallery-grid">
						<div class="agile-gallery">
							<a href="${pageContext.request.contextPath}/trang-dat-mua-san-pham/${lst.idProduct}"><h1>${lst.title}</h1></a>
							<span>Giá:${lst.price} vnd</span><br>
							<span>Ngày đăng:${lst.date }</span><br>
							<span>Người bán:${ lst.user.username}</span>
						</div>
					</div>
				
				</div>
			</div>
			</c:forEach>
		<script>
			$(window).load(function() {
				$.fn.lightspeedBox();
			});
		</script>
	</div>
</div>