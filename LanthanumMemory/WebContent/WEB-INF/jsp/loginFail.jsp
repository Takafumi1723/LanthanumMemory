<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LanthanumMemory</title>

</head>
<body>
  <p>ログインに失敗しました</p>
  <p>再度入力したください</p>
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
          <input type="submit" id="loginBtn" value="Login">
        </td>
      </form>
    </table>
  </div>
</body>
</html>