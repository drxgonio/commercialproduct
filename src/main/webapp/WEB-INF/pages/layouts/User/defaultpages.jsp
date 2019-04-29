
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
	<title>Sản phẩm thương mại</title>
	 <link href='<c:url  value="https://use.fontawesome.com/releases/v5.3.1/css/all.css"></c:url>' rel="stylesheet" />
	 <link href='<c:url  value="/resources/pagesUser/css/bootstrap.css"></c:url>' rel="stylesheet" />
	 <link href='<c:url  value="/resources/pagesUser/css/style11.css"></c:url>' rel="stylesheet" />
	<%--  <link href='<c:url  value="/resources/pagesUser/css/styles.css"></c:url>' rel="stylesheet" /> --%>
	 <link href='<c:url  value="/resources/pagesUser/css/lsb.css"></c:url>' rel="stylesheet" />
	  <link href='<c:url  value="/resources/pagesUser/css/font-awesome.min.css"></c:url>' rel="stylesheet" />
	 	 	 	 
	 
</head>
<body>
	<div class="wrapper">
		<tiles:insertAttribute name="header1" />
		<tiles:insertAttribute name="body1" />
		<tiles:insertAttribute name="footer1" />
	</div>
	
</body>

 <script src="<c:url value="/resources/pagesUser/js/jquery-2.1.4.min.js" />"></script>
  <script src="<c:url value="/resources/pagesUser/js/move-top.js" />"></script>
  
   <script src="<c:url value="/resources/pagesUser/js/easing.js" />"></script>
    <script src="<c:url value="/resources/pagesUser/js/bootstrap.js" />"></script>
     <script src="<c:url value="/resources/pagesUser/js/lsb.js" />"></script>

 
  <script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
</html>