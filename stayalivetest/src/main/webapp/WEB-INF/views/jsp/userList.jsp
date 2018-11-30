<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		let time = <%=request.getAttribute("date")%>;
		function printServerTime(){
			let date = Date(time);
			document.getElementById('sdate').innerHTML = date;
			time++;
		}
		setInterval(printServerTime, 1000);
		$(document).ready(()=>{
			printServerTime();
		});
	</script>
	<title>userList</title>
</head>
<body>
	<h1>userList</h1>
	<h3 id="sdate">sdate</h3>
		<c:if test="${S_ID == null}">
			<a class="btn btn-primary" href="/login">로그인</a>
		</c:if>
		<c:if test="${S_ID != null}">
			<a class="btn btn-primary" href="/logout">로그아웃</a>
		</c:if>
		<a class="btn btn-primary" href="/addUser">user 추가</a>
		<table class="table">
			<thead>
				<tr>
					<td>no</td>
					<td>id</td>
					<td>pw</td>
					<td>date</td>
					<td>photo</td>
				</tr>
			</thead>
			<tbody>
				<!-- model안의 sampleList 가져와서 사용 -->
				<c:forEach var="user" items="${userList}">
					<tr>
						<td>${user.userNo}</td>
						<td>${user.userId}</td>
						<td>${user.userPw}</td>
						<td>${user.userDate}</td>
						<td><img src="${user.userPhoto}"></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>