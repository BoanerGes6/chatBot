<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Chat With Rim</title>
	<link rel="stylesheet" type="text/css" href="/css/rimChatStyle.css">
</head>
<body>
 <h1 >${result}</h1>
	 <div class = main-form id="mainform">
	 	<form method = "post" id="query">
		 	<div class = "rFrame">
		 	
		 		<div id = "usermsg" class = "reqres userMsgCss" style = "display: none;">
					
				</div>
		 		<div id = "resp" class = "reqres respcss" style = "display: none;">
					
				</div>
			</div>
			<input type = "text" class ="conv1" id="conv1" name ="conv" placeholder="message"/>
			<button type="submit" class="btn btn-dark btn-block mt-3">Sent</button>
			<br><br>
			
		</form>
	 </div>
	 
	 <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
	 <script type="text/javascript">
			$(document).ready(function() {
				$("#query").submit(function(event){
					var usrmsg = $("#conv1").val();
					$("#usermsg").show().html(usrmsg)
					var postdata = $("#query").serialize();
					$.post("/chatterbox",postdata, function(response){
						$("#conv1").val("");
						$("#resp").show().html(response)
					})
					return false;
				})
				
			});
	</script>	
</body>
</html>