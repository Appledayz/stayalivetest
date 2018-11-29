<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		$(document).ready(()=>{
			$('#addUserBtn').click(()=>{
				if($('#id').val > 3 && $('#pw').val){
					$('#addUserForm').submit();				
				}
			});
		});
	</script>
	<title>addUser</title>
</head>
<body>
	<h1>addUser</h1>
	<form id="addUserForm" action="addUser" method="POST" enctype="multipart/form-data">
		<table>
			<tr>
				<td>ID</td><td><input type="text" name="id" id="id" required></td>
				<td>PW</td><td><input type="password" name="pw" id="pw" required></td>
				<td>PHOTO</td><td><input type="file" name="photo"></td>
				<td colspan="2"><button id="addUserBtn" type="button">Join</button></td>
			</tr>
		</table>
	</form>
</body>
</html>