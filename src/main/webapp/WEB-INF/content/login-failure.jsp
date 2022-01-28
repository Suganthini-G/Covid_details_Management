<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Failure</title>
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />
<style>
	body
	{
		margin: 0;
		background: url(/assets/img/covid.jpg) no-repeat;
		background-size: 1600px 800px;
	}
</style>
</head>
<body>
	<script src="jquery-1.8.3.js">

	</script>

	<script src="bootstrap/js/bootstrap.js">

	</script>

	<header class="blog-header py-3">
		<div class="col-xs-12">
			<div class="col-xs-10 text-center">
				<a class="blog-header-logo text-dark" style="text-decoration: none;font-size: 50px;color: black">Covid Details System</a>
			</div>
			<div class="col-xs-2 text-right">
				<a class="btn btn-sm btn-outline-secondary" href="/" style="color: black;font-size: 20px">Home</a>
			</div>
		</div>
	</header>


	<div class="panel panel-danger" style="margin-top: 100px">
		<div class="panel-heading">
			<h3 align="center" class="panel-title">Login failure</h3>
		</div>
		<div class="panel-body">
			<div class="alert alert-dismissable alert-danger">
<%--				<button type="button" class="close" data-dismiss="alert">×</button>--%>
				<p align="center">
					<strong>Oh snap! Invalid Username/Password!</strong>
				</p>
			</div>
		</div>
		<div align="center">
			<a class="btn btn-primary" href="login-input">Try again here!</a>
		</div>

	</div>
</body>
</html>