<!DOCTYPE HTML>
<html>
<head>
    <title> Home Page</title>
</head>
<body>
<p> Home Page </p>
<%
  String myName =  (String) session.getAttribute("name_key");
    %>
<p> <%= myName  %> </p>
</body>
</html>