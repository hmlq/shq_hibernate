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
    
    <title>My JSP 'customermessages.jsp' starting page</title>
    
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
    <h2>�˿���Ϣ���£�</h2>
    <table border=1 width=80%>
    	<tr>
    		<th>�û���</th>
    		<th>����</th>
    		<th>���</th>
    		<th>�Ա�</th>
    		<th>����</th>
    		<th>���֤��</th>
    		<th>����</th>
    		<th>�绰����</th>
    		<th>��ַ</th>	
    	</tr>
    	<c:forEach items="${listCustomer}" var="customer">
    	<tr>
    		<td>${customer.customerName }</td>
    		<td>${customer.customerPass }</td>
    		<td>${customer.customerIdentity }</td>
    		<td>${customer.customerSex }</td>
    		<td>${customer.customerAge }</td>
    		<td>${customer.customerIdcard }</td>
    		<td>${customer.customerEmail }</td>
    		<td>${customer.customerTelephone }</td>
    		<td>${customer.customerAddress }</td>
    	</tr>
    	</c:forEach>
    </table>
    </center>
  </body>
</html>
