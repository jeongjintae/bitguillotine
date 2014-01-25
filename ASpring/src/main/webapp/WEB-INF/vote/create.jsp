<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표등록</title>
</head>
<body>
    
<h1>투표등록</h1>
<form action="add.do" method="post"
  enctype="multipart/form-data">
투표번호: <input type="text" name="name"><br>
날짜: <input type="text" name="date"><br>
득표자: <input type="text" name="candiDate"><br>
투표자: <input type="text" name="eletor"><br>
<input type="submit" value="등록">
</form>

</body>
</html>