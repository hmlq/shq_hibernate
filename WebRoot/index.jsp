<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <h2>
    	��ӭ���ʴ�ҳ��<br>
    	���¼
    </h2>
    <form action="loginServlet" method="post">
	<table border=0>
   		<tr>
   		<td align="right">�û�����</td>
   		<td align="left"><input type="text" name="userName"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">���룺</td>
   		<td align="left"><input type="password" name="userPass"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">�û���ݣ�</td>
   		<td align="left">
   			<input type="radio" name="userIdentity" value="�˿�">�˿�
   		    <input type="radio" name="userIdentity" value="����Ա">����Ա</td>
   		</tr>
   		
   		<tr>
   			<td>&nbsp;</td>
   			<td align="left">
	   			<input type="submit" value="�ύ">
	        	<input type="reset" value="����" >
	        	<input type="button" value="ע��" onclick="javascrtpt:window.location.href='register.jsp'">
        	</td>
        </tr>
    </table>
	</form>
    </center>
  </body>
</html>

