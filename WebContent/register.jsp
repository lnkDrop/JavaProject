<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>用户注册</title>
    <link rel="stylesheet" id="templatecss" type="text/css" href="2.css">
</head>

<body>
    <form action="RegisterServlet" method="post" class="basic-grey">
   
        <h1>注册
            <span>请填写用户信息</span>
        </h1>
        
        <label>
            <span> 用户名 :</span>
            <input id="name" type="text" name="username"  />
        </label>
        

        <label>
            <span> 密码 :</span>
            <input id="name" type="password" name="password"  />
        </label>
        
        <label>
            <span> 邮箱 :</span>
            <input id="name" type="text" name="email"  />
        </label>
        
        <label>
            <span> 手机号 :</span>
            <input id="name" type="text" name="tel"  />
        </label>
        
        <label>
            <span>&nbsp;</span>
            <input type="submit" class="button" value="提交" />
            
        </label>
        
        
        
    </form>
    <a href="index.jsp">返回</a>
</body>

</html>


