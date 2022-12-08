<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="net.database.*"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
 <div align="center">
  <h1> User Account Creation </h1>
  <form action="<%=request.getContextPath()%>/RegistrationForm" method="post">
   <table style="with: 100%">
   <tr>
   <td>Email</td>
   <td><input type="text" name="email" /></td>
    <tr>
     <td>UserName</td>
     <td><input type="text" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{4,15}$" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="text" name="password" /></td>
    </tr>

   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>