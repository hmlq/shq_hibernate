<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updatecustomer.jsp' starting page</title>
    
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
    <h2>请修改顾客信息：</h2>
    <form action="updateCustomerServlet" method="post">	
    <table border=1>
    	<tr>
    		<th align="center">用户名</th>
    		<th align="center">密码</th>
    		<th align="center">身份</th>
    		<th align="center">性别</th>
    		<th align="center">年龄</th>
    		<th align="center">身份证号</th>
    		<th align="center">邮箱</th>
    		<th align="center">电话号码</th>
    		<th align="center">地址</th>	
    	</tr>
  		
    	<tr>
    		<td align="center"><input type="text" name="customerName" value="${user.customerName }"></td>
    		<td align="center"><input type="text" name="customerPass" value="${user.customerPass }"></td>
    		<td align="center"><input type="text" name="customerIdentity" value="${user.customerIdentity}"></td>
    		<td align="center"><input type="text" name="customerSex" value="${user.customerSex }"></td>
    		<td align="center"><input type="text" name="customerAge" value="${user.customerAge }"></td>
    		<td align="center"><input type="text" name="customerIdcard" value="${user.customerIdcard }"></td>
    		<td align="center"><input type="text" name="customerEmail" value="${user.customerEmail }"></td>
    		<td align="center"><input type="text" name="customerTelephone" value="${user.customerTelephone }"></td>
    		<td align="center"><input type="text" name="customerAddress" value="${user.customerAddress }"></td>
    	</tr>
    	
    </table>
	    <input type="submit" value="提交">&nbsp;
	    <input type="reset" value="重置">
	    </form>
    </center>
  </body>
</html>
