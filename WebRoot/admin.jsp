<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'admin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <center>
  	<h1>管理员所拥有的权限</h1>
   	<h2><a href="selectCustomerServlet">查看顾客信息</a></h2>
    <h2><a href="getAllMessageServlet">查看发布信息</a></h2>
    <h2><a href="addmessage.jsp">添加发布信息</a><br></h2>
    <h2><a href="updateAdminServlet1">修改账号信息</a><br></h2>
    <h2><a href="deleteUserServlet">删除账号信息</a><br></h2>
   </center>
  </body>
</html>
