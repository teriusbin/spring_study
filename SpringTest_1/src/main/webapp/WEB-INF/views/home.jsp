<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType = "text/html;charset=utf-8" %>
<%@ page import="www.og.com.DBConnection"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<P> Hey this is result:</P>
<% DBConnection dbcon = new DBConnection();



out.println("test");%>

</body>
</html>
