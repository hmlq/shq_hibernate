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
    <h2>���޸Ĺ˿���Ϣ��</h2>
    <form action="updateCustomerServlet" method="post">	
    <table border=1>
    	<tr>
    		<th align="center">�û���</th>
    		<th align="center">����</th>
    		<th align="center">���</th>
    		<th align="center">�Ա�</th>
    		<th align="center">����</th>
    		<th align="center">���֤��</th>
    		<th align="center">����</th>
    		<th align="center">�绰����</th>
    		<th align="center">��ַ</th>	
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
	    <input type="submit" value="�ύ">&nbsp;
	    <input type="reset" value="����">
	    </form>
    </center>
  </body>
</html>
