<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
    <form action="regestServlet" method="post">
    <h2>��ע�᣺</h2>
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
   		<td align="right">�Ա�</td>
   		<td align="left">
   			<input type="radio" name="userSex" value="��">��
   		    <input type="radio" name="userSex" value="Ů">Ů</td>
   		</tr>
   		
   		<tr> 
   		<td align="right">���䣺</td>
   		<td  align="left"><input type="text" name="userAge"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">���֤�ţ�</td>
   		<td align="left"><input type="text" name="userIdcard"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">���䣺</td>
   		<td align="left"><input type="text" name="userEmail"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">�ֻ����룺</td>
   		<td align="left"><input type="text" name="userTelephone"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">��ַ��</td>
   		<td align="left"><input type="text" name="userAddess"></td>
   		</tr>
   		
   		<tr>
   		<td>&nbsp;</td>
   			<td align="left">
   			<input type="submit" value="�ύ">
        	<input type="reset" value="����" >
        	</td>
        </tr>
    </table>
    </form>
    </center>
  </body>
</html>
