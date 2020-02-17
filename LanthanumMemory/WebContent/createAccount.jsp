<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
  <meta charset="UTF-8">
  <title>アカウント新規作成</title>
</head>
<body>
  <h1>アカウント新規作成</h1>
  <form action="/LanthanumMemory/Account" method="POST">
    <table>
      <tr>
        <td>
          <input type="text" id="user_id" name="user_id" placeholder="UserName">
        </td>
      </tr>
      <tr>
        <td>
          <input type="text" id="password" name="password" placeholder="Password">
        </td>
      </tr>
      <td>
        <input type="submit" id="create_account" value="登録">
      </td>
    </table>
  </form>
</body>
</html>