<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateadmin.jsp' starting page</title>
    
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
    <h2>���޸Ĺ���Ա��Ϣ��</h2>
    <form action="updateAdminServlet2" method="post">	
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
    		<td align="center"><input type="text" name="adminName" value="${admin.adminName }"></td>
    		<td align="center"><input type="text" name="adminPass" value="${admin.adminPass }"></td>
    		<td align="center"><input type="text" name="adminIdentity" value="${admin.adminIdentity}"></td>
    		<td align="center"><input type="text" name="adminSex" value="${admin.adminSex }"></td>
    		<td align="center"><input type="text" name="adminAge" value="${admin.adminAge }"></td>
    		<td align="center"><input type="text" name="adminIdcard" value="${admin.adminIdcard }"></td>
    		<td align="center"><input type="text" name="adminEmail" value="${admin.adminEmail }"></td>
    		<td align="center"><input type="text" name="adminTelephone" value="${admin.adminTelephone }"></td>
    		<td align="center"><input type="text" name="adminAddress" value="${admin.adminAddress }"></td>
    	</tr>
    	
    </table>
	    <input type="submit" value="�ύ">&nbsp;
	    <input type="reset" value="����">
	    </form>
    </center>
  </body>
</html>
