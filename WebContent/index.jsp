<%@page import="entity.User"%>
<%@page import="java.util.List"%>
<%@page import="dao.Dao"%>
<%@page import="entity.Dept"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="index.css" type="text/css" rel="stylesheet"> 
<meta charset="UTF-8">
<title>部门列表</title>
</head>
<body>
<h1>部门信息后台管理系统</h1>
    <%
    	User user = (User)session.getAttribute("user");
    	
    	if(user == null){
    %>
    <h2>
    <a href="login.jsp">登录</a>
    <a href="register.jsp">注册</a>
    </h2>
    <% 
    	}else{
	
    %>
    	<p>欢迎:<%=user.getUsername() %>&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="LoginOutServlet">退出</a></p>
    	<div id="tj"><a href="AddDept.jsp">添加商品</a></div>	
    	<table align="center">
	
		<tr>
		
			<th>商品编号</th>
			<th>商品名称</th>
			<th>商品信息</th>
			<th>价格</th>
			<th>操作</th>
			
		</tr>
		
		<% 
			List<Dept> depts = Dao.selectAll();
			for(Dept dept : depts){
		%>
		<tr>
		
		
			<td><%=dept.getId() %></td>
			<td><%= dept.getDeptName()%></td>
			<td><%= dept.getDeptRemake()%></td>
			<td><%=dept.getPrice() %></td>
			<td>
				<a href="UpdateDept.jsp?id=<%=dept.getId()%>">修改</a>
				<a href="DeleteDeptServlet?id=<%=dept.getId()%>">删除</a>
				
			</td>	
		</tr>
		
		<%
		} 
		%>
		
	</table>
	
    <%
    	}
    %>
	
</body>
</html>