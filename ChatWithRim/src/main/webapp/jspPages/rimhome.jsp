<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Rim Welcome Page</title>
<style>
body {
	background-color: #F3C3EB;
}
.btn {
	width:350px;
	height: 80px;
	position: absolute;
	top: 40%;
	left: 35%;
	border-radius: 15px;
	background-color: #F00B5E;
	border: none;
	box-shadow: 0px 8px 15px rbga(0,0,0,.4);
	font-family: monospace;
	font-weight: bolder;
	font-size: xx-large;
}
.btn:hover {
	background-color: #DE0F5B;	
	box-shadow: 0px 8px 15px rbga(0,0,0,.4);
	transition: 0.45 all linear;
}
</style>
</head>
<body>
	<div class = "home-form">
		<form method = "post">
			<button type="submit" class="btn btn-dark btn-block mt-3">Start Chat</button>
		</form>
	</div>
</body>
</html>