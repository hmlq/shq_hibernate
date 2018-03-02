<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addmessage.jsp' starting page</title>
    
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
    <h2>请管理员添加发布信息</h2>
    <form action="addMessageServlet" method="post">
	    <table>
		    <tr>
		    	<td align="right">标题：</td>
		    	<td align="left"><input type="text" name="messageTitle"></td>
		    </tr>
		    <tr>
		    	<td align="right">内容：</td>
		    	<td align="left"><textarea rows="8" cols="19" name="messageContent"></textarea></td>
		    </tr>
		    <tr>
		    	<td>&nbsp;</td>
		    	<td>
		    		<input type="submit" value="提交">&nbsp;
		    		<input type="reset" value="重置">
		    	</td>
		    </tr>
	    </table>
    </form>
    </center>
  </body>
</html>
