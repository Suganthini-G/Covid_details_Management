<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submit Failure</title>
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />
</head>
<body>
	<script src="jquery-1.8.3.js">
		
	</script>

	<script src="bootstrap/js/bootstrap.js">
		
	</script>

	<div class="navbar navbar-default">

		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<div class="navbar-collapse collapse navbar-responsive-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="/">Home</a></li>
					<li><a href="signup-input">Signup</a></li>
					<li class="active"><a href="login-input">Login</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
											data-toggle="dropdown">Explore<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="courses-show-all">All Courses</a></li>
							<li class="divider"></li>
							<li><a href="#">Further Actions</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		<!-- /.nav-collapse -->
	</div>

	<div class="panel panel-danger">
		<div class="panel-heading">
			<h3 class="panel-title">Student Enrollment Signup failure</h3>
		</div>
		<div class="panel-body">
			<div class="alert alert-dismissable alert-danger">
				<button type="button" class="close" data-dismiss="alert">�</button>
				<strong>Oh snap!</strong> Something (User Name) already exists!
				Change a few things up (User Name especially) and try submitting
				again.
			</div>
		</div>
		<div></div>
		<div></div>
		<a class="btn btn-primary" href="signup-input">Try again?</a>
	</div>
</body>
</html>