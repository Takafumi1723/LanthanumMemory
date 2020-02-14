<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./index.css?<%= System.currentTimeMillis() %>">
<title>LanthanumMemory Login</title>
</head>
<body>
  <h1>LanthanumMemory</h1>
  <hr>
  <div align="center">
    <table border="0">
      <form action="/LanthanumMemory/Login" method="POST">
      <tr>
        <td>
          <input type="text" id="user_id" name="user_id" placeholder="Username">
        </td>
      </tr>
      <tr>
        <td>
          <input type="password" id="password" name="password" placeholder="Password">
        </td>
      </tr>
        <td>
          <input type="submit" id="loginBtn" value="ログイン">
        </td>
      </form>
      <tr>
        <td>
          <a href="createAccount.jsp">アカウント登録</a>
        </td>
      </tr>
    </table>
  </div>
</body>
</html>