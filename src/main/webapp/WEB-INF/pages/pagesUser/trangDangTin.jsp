<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
<div class="gallery-grids">
	<u:form class="container" method="post" action="trang-dang-tin"
		modelAttribute="Product">

		<h2 class="w3ls_head">
			Đăng tin
		</h2>
		
		<div class="row">

			<div class="col-lg-6">
				<div class="form-group">
					
						<label>Chọn danh mục</label>
						<u:select class="form-control" name="nameCategory"
							path="category.idCategory">
							<c:forEach items="${lstCategory}" var="lst">
								<option value="${lst.idCategory }">${lst.nameCategory}</option>

							</c:forEach>

						</u:select>
					
				</div>
				<br>
				<br>
				<div class="form-group">
					<label for="comment">Tiêu đề:</label>
					<u:textarea class="form-control" rows="5" name="title" path="title" />
				</div>
				<br>
				<div class="form-group">
					<label>Tên sản phẩm:</label>
					<u:input type="text" class="form-control" id="name"
						path="nameProduct" />
				</div>
				<br>
				<div class="form-group">
					<label>Hình ảnh:</label>
					<u:input type="text" class="form-control" id="image" path="image" />
				</div>
				<br>
				<div class="form-group">
					<label>Giá:</label>
					<u:input type="text" class="form-control" id="price" path="price" />
				</div>
				<br>

			</div>
			<div class="col-lg-6">
				<div class="form-group">
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
				</div>
				<div class="form-group">
					<label>Số lượng:</label>
					<u:input type="number" class="form-control" id="count" path="count" />
				</div>
				<br>
				<div class="form-group">
					<label>Ngày đăng:</label>
					<u:input type="text" id="mydate" path="date" />
				</div>
				<div class="form-group">
					<u:input type="hidden" path="user.username"
						value="${pageContext.request.userPrincipal.name}" />
				</div>
				<br>
				<div class="form-group">
					<button type="submit"
						class="btn btn-danger btn-block btn-lg btn-fill">Đăng tin</button>
				</div>
			</div>

		</div>





	</u:form>

	<script>
		var today = new Date();
		var date = today.getFullYear() + '-' + (today.getMonth() + 1) + '-'
				+ today.getDate();
		var time = today.getHours() + ":" + today.getMinutes() + ":"
				+ today.getSeconds();
		var dateTime = date + ' ' + time;
		document.getElementById("mydate").value = dateTime;
	</script>
	<script>
		$(window).load(function() {
			$.fn.lightspeedBox();
		});
	</script>
</div>
</div>