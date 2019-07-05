<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<meta http-equiv="Pragma" content="no-cache"> 
<meta http-equiv="Cache-Control" content="no-cache"> 
<meta http-equiv="Expires" content="0"> 
<title>后台登录</title> 
<link href="login.css" type="text/css" rel="stylesheet"> 
</head> 
<body> 

<div class="login">
    <div class="message">商品管理系统-登录页面</div>
    <div id="darkbannerwrap"></div>
    
    <form action="LoginServlet" method="post">
    <%if(request.getAttribute("msg")!=null){ %>
     <span style="color:red"><%=request.getAttribute("msg") %></span>
    <%
    }
    %>
		<input name="action" value="login" type="hidden">
		<input name="username" placeholder="用户名" required="请在此输入用户名" type="text">
		<hr class="hr15">
		<input name="password" placeholder="密码" required="请在此输入密码" type="password">
		<hr class="hr15">
		<input value="登录" style="width:100%;" type="submit">
		<hr class="hr20">
		<a href="register.jsp">注册</a> 
		<hr class="hr20">
		
	</form>

	
</div>



</body>
</html>