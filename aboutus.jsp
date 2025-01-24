<!DOCTYPE HTML>
<html>
<head>
    <title> About Us Page</title>
</head>
<body>
<p> About Us page </p>
<%
   String myName =  (String)session.getAttribute("name_key");
   %>
<p><%= myName  %></p>
</body>
</html>