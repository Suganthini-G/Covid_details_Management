<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<sb:head includeScripts="false" includeScriptsValidation="false"
	includeStylesResponsive="true" />

<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />


<style>
.error {
	color: #ff0000;
	font-size: 0.9em;
	font-weight: bold;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}

input[type="text"],input[type="password"] {
	height: 40px;
}
body
{
	margin: 0;
	background: url(/assets/img/covid.jpg) no-repeat;
	background-size: 1600px 800px;
}
</style>

<title>Covid Management System Login</title>

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
				<a class="btn btn-sm btn-outline-secondary" href="/" style="color: black;font-size: 20px; background-color: transparent">Home</a>
			</div>
		</div>
	</header>

	<div class="col-lg-5 col-lg-offset-3" style="margin-top: 150px">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						<s:form id="myForm" action="login" theme="bootstrap"
							validate="true" cssClass="bs-example form-horizontal"
							method="post">
							<fieldset>
								<legend align="center">Login here</legend>

								<s:textfield label="User Name" name="userName"
									cssClass="col-lg-9" placeholder="User Name" />

								<s:password label="Password" name="password"
									cssClass="col-lg-9" placeholder="Password" />

								<div class="col-lg-3 col-lg-offset-3">
<%--									<s:submit cssClass="btn btn-default" value="Cancel" />--%>
									<s:submit cssClass="btn btn-primary" value="Login" />
								</div>
								<s:hidden name="pageName" value="login" />
							</fieldset>
						</s:form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>