<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원등록폼</title>
</head>
<body>
    
<h1>회원등록폼</h1>
<form action="add.do" method="post"
  enctype="multipart/form-data">
이름: <input type="text" name="name"><br>
나이: <input type="text" name="age"><br>
권한: <input type="text" name="appoint"><br>
직위: <input type="text" name="auth"><br>
이메일: <input type="text" name="email"><br>
<input type="submit" value="등록">
</form>

</body>
</html>