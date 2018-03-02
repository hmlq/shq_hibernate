<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
    	<h2>请修改发布信息</h2>
    	<form action="updateMessageServlet2" method="post">
	    	<input type="hidden" name="messageId" value="${message.messageId}">
	    	<input type="hidden" name="adminId" value="${message.adminId}">
	    	<table border=0>
	    		<tr>
	    			<td>信息标题</td>
	    			<td><input type="text" name="messageTitle" value="${message.messageTitle }"> </td>
	    		</tr>
	    		<tr>
	    			<td>信息内容</td>
	    			<td>
	    				<textarea rows="8" cols="21" name="messageContent">${message.messageContent }</textarea>
	    			</td>
	    		</tr>
	    		<tr>
	    		<td>&nbsp;</td>
	    		<td>
	    			<input type="submit" value="提交">
	    			<input type="reset" value="重置"> 
	    		</td>
	    		</tr>
	    	</table>
    	</form>
    </center>
  </body>
</html>
