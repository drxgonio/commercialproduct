<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="u"%>
<link href='<c:url  value="/resources/pagesUser/css/styles.css"></c:url>' rel="stylesheet" />
<div class="services" id="services">
 <c:if test="${param.error == 'true'}">
         <div style="color:red;margin:10px 0px;">
          
                Login Failed!!!<br />
                Reason :  ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                 
         </div>
    </c:if>
			<div class="container d-flex justify-content-center">
				<div class="card">
					<div class="card-header">
						<h3>Sign In</h3>
						<div class="d-flex justify-content-end social_icon">
							<span><i class="fab fa-facebook-square"></i></span>
							<span><i class="fab fa-google-plus-square"></i></span>
							<span><i class="fab fa-twitter-square"></i></span>
						</div>
					</div>
					<div class="card-body">
						
						<form  action="${pageContext.request.contextPath}/j_spring_security_check" method='post' >
							<div class="input-group form-group">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fas fa-user"></i></span>
								</div>
								<input type="text" class="form-control" name="username" placeholder="username" >

							</div>
							<div class="input-group form-group">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fas fa-key"></i></span>
								</div>
								<input type="password" class="form-control"name="password" placeholder="password">
							</div>
							<!-- <div class="row align-items-center remember">
								<input type="checkbox">Remember Me
							</div> -->
							<div class="form-group">
								<input type="submit" value="Login" class="btn float-right login_btn">
							</div>
						</form>
					</div>
					<div class="card-footer">
						<!-- <div class="d-flex justify-content-center links">
							Don't have an account?<a href="#">Sign Up</a>
						</div> -->
						<div class="d-flex justify-content-center">
							<a href="${pageContext.request.contextPath}/trang-dang-ki">Đăng kí tài khoản</a>
						</div>
					</div>
				</div>
				<!-- //contact -->
			</div>
		</div>