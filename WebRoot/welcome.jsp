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
  <center>
    <h1>��ӭ���鿴���޸���Ϣ </h1>
    <!-- <a href="selectCustomerServlet">�鿴�˿���Ϣ</a><br>
    <a href="addmessage.jsp">��ӷ�����Ϣ</a><br>
    <a href="updateUserServlet1">�޸��˺���Ϣ</a><br>
    <a href="deleteUserServ">ɾ���˺���Ϣ</a><br> -->
    <table width="80%"  border="1">
      <tr>
        <th width="30%">����</th>
        <th width="30%">����</th>
        <th width="40%" colspan="2">�༭</th>
      </tr>
      <c:forEach  items="${listofmessage}" var="message">
        <tr>
        <td width="30%" align="center">${message.messageTitle}</td>
        <td width="30%" align="center">${message.messageContent }</td>
        <td width="20%" align="center"><a href="updateMessageServlet?messId4=${message.messageId}">�޸�</a></td>
        <td width="20%" align="center"><a href="deleteMessageServlet?messId3=${message.messageId}">ɾ��</a></td>
        </tr>
      </c:forEach>
    </table>
    </center>
  </body>
</html>
 