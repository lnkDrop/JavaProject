<%@page import="entity.Dept"%>
<%@page import="java.util.Date"%>
<%@page import="dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>修改商品</title>
<link rel="stylesheet" id="templatecss" type="text/css" href="2.css">
</head>

<body>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		 Dept dept = Dao.selectid(id);
	
		 %>
	
	<form action="UpdateServlet" method="post" class="basic-grey">
		<font size=3>
			
			<h1>
				商品修改表 <span>请填写欲修改的文本信息</span>
			</h1> 
			<label> <input type="hidden" name="id"value="<%=dept.getId() %>"/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				商品编号：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=dept.getId() %>

		</label>
			<p></p>
			</table> <label> <span> 商品名称 :</span> <input id="name" type="text"
				name="name" value="<%=dept.getDeptName()%>" />
		</label> <label> <span> 商品价格 :</span> <input id="name" type="text"
				name="price" value="<%=dept.getPrice()%>" />
		</label> 
		<label> <span> 商品信息 :</span> <textarea id="message"
					name="remake" placeholder="<%=dept.getDeptRemake()%>"></textarea>
		</label> 
		<label> <span>&nbsp;</span> <input type="submit"
				class="button" value="提交修改" />
		</label>
		</font>
	</form>
	<a href="index.jsp">返回</a>
</body>

</html>