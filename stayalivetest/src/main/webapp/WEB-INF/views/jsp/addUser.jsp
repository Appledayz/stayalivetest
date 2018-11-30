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
				if($('#id').val().length > 3 && $('#pw').val().length > 3){
					$('#addUserForm').submit();				
				}else{
					alert('아디디와 비밀번호는 4자 이상 입력하세요!');
				}
			});
		});
	</script>
	<title>addUser</title>
</head>
<body>
	<h1>addUser</h1>
	<form id="addUserForm" action="addUser" method="POST" enctype="multipart/form-data">
		<table style="display:table; margin:0 auto;" class="">
			<tr>
				<td>ID</td><td><input class="form-control" type="text" name="userId" id="id" required></td>
			</tr>
			<tr>
				<td>PW</td><td><input class="form-control" type="password" name="userPw" id="pw" required></td>
			</tr>
			<tr>
				<td>PHOTO</td><td><input class="form-control" type="file" name="userPhoto"></td>
			</tr>
			<tr>
				<td colspan="2"><button class="btn btn-primary" id="addUserBtn" type="button">Join</button></td>
			</tr>
		</table>
	</form>
</body>
</html>