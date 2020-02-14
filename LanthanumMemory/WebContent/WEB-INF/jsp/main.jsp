<%@page import="model.User"%>
<% User user = (User)session.getAttribute("loginUser"); %>

<!DOCTYPE html>
<html>
  <head>
    <link rel="stylesheet" href="./main.css">
    <title>LanthanumMemory</title>
  </head>
  <body>
    <div>
      <p id="loginMessage">Welcome To LanthanumMemory , <%= user.getUserName() %></p>
    </div>
    <div class="menuTable">
      <div class="menu"><input type="button" value="Photo"></div>
      <div class="menu"><input type="button" value="Map"></div>
      <div class="menu"><input type="button" value="Info"></div>
    </div>



</body>
</html>