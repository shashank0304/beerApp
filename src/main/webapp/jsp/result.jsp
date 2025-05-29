<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Beer Expert</title>
</head>
<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<p>
		<%
			List<String> styles = (List<String>)request.getAttribute("styles");
			Iterator<String> itr = styles.iterator();
			while(itr.hasNext()) {
				out.println("<br>please try: "+ itr.next());
			}
		%>
	</p>
</body>
</html>