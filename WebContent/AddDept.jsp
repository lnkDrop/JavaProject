<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>添加商品</title>
    <link rel="stylesheet" id="templatecss" type="text/css" href="2.css">
</head>

<body>
    <form action="AddDeptServlet" method="post" class="basic-grey">
        <h1>商品添加表单
            <span>请填写欲添加的文本信息</span>
        </h1>
        
        <label>
            <span> 商品名称 :</span>
            <input id="name" type="text" name="name" placeholder="在此输入商品名称" />
        </label>
        
        <label>
            <span> 商品价格 :</span>
            <input id="name" type="text" name="price" placeholder="在此输入商品价格" />
        </label>
        

        <label>
            <span> 商品信息 :</span>
            <textarea id="message" name="remake" placeholder="在此输入商品信息"></textarea>
        </label>
        
        
        
        <label>
            <span>&nbsp;</span>
            <input type="submit" class="button" value="添加	" />
            <input type="reset" class="button" value="重置" />
        </label>
    </form>
    <a href="index.jsp">返回</a>
</body>

</html>