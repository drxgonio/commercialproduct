<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>


<div class="gallery-grids">
	<div class="container">
	<h2 class="w3ls_head"><span>Danh mục</span>sản phẩm</h2>
		<p class="w3agile">Danh sách các danh mục sản phẩm mà chúng tôi có.</p>
		<div class="show-reel tel-prj">
			<%-- 	<c:forEach items="${lstCategory}" var="lst">
											
											<option >${lst.nameCategory}</option>

										</c:forEach> --%>
			<c:forEach items="${lstCategory}" var="lst">
			<div class="col-md-3 agile-gallery-grid">
				<div class="agile-gallery">
					<a href="${pageContext.request.contextPath}/trang-san-pham-danh-muc/${lst.nameCategory}" class="lsb-preview" data-lsb-group="header">
						<img src="${lst.image}" alt="" />
						<div class="agileits-caption">
							<h4>${lst.nameCategory}</h4>
							<p>Các sản phẩm thuộc danh mục: ${lst.nameCategory} </p>
						</div>
					</a>
				</div>
			</div>
			</c:forEach>
			<div class="clearfix"> </div>
		</div>
	
		<script>
			$(window).load(function() {
			  $.fn.lightspeedBox();
			});

		</script>
	</div>
</div>