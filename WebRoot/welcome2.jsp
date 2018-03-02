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
    
    <title>My JSP 'welcome.jsp' starting page</title>
    
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
  <script type="text/javascript">
  	function rec1(){
  		alert("对不起，您没有修改权限");
  	}
  	function rec2(){
  		alert("对不起，您没有删除权限");
  	}
  </script>
  <center>
    <h1>欢迎您查看或修改信息 </h1>
    <table width="80%"  border="1">
      <tr>
        <th width="30%">标题</th>
        <th width="30%">内容</th>
        <th width="40%" colspan="2">编辑</th>
      </tr>
      <c:forEach  items="${listofmessage}" var="message">
        <tr>
        <td width="30%" align="center">${message.messageTitle}</td>
        <td width="30%" align="center">${message.messageContent }</td>
        <td width="20%" align="center"><a href="getAllMessageServlet" onclick="rec1()">修改</a></td>
        <td width="20%" align="center"><a href="getAllMessageServlet" onclick="rec2()">删除</a></td>
        </tr>
      </c:forEach>
    
    
    </table>
    </center>
  </body>
</html>
 