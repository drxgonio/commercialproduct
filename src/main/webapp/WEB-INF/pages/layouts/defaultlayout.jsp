<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Paper Kit by Creative Tim</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
	<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <link href='<c:url  value="/resources/bootstrap3/css/bootstrap.css"></c:url>' rel="stylesheet" />
    <link href='<c:url  value="/resources/assets/css/style.css"></c:url>' rel="stylesheet"/>
    <link href='<c:url  value="/resources/assets/css/bootstrap.min.css"></c:url>' rel="stylesheet" />
    <link href='<c:url  value="/resources/assets/css/morris.css"></c:url>' rel="stylesheet" />
    <link href='<c:url  value="/resources/assets/css/font-awesome.css"></c:url>' rel="stylesheet" />
    <link href='<c:url  value="/resources/assets/css/fontcss.css"></c:url>' rel="stylesheet" />
    <link href='<c:url  value="/resources/assets/css/icon-font.min.css"></c:url>' rel="stylesheet" />



</head>

<body>
<div class="wrapper">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="menu" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
</body>


<script src='<c:url value="/resources/assets/js/jquery-2.1.4.min.js"></c:url>'></script>
<script src='<c:url value="/resources/assets/js/jquery.nicescroll.js"></c:url>'></script>
<script src='<c:url value="/resources/assets/js/scripts.js"></c:url>'></script>
<script src='<c:url value="/resources/assets/js/bootstrap.min.js"></c:url>'></script>
<script src='<c:url value="/resources/assets/js/raphael-min.js"></c:url>'></script>
<script src='<c:url value="/resources/assets/js/morris.js"></c:url>'></script>

</html>