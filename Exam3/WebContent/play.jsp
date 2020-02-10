<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="grit.exam.task3.Player" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="guess" method="post"> <!--  player never gets sent here -->
<input type="text" name="guess">
<input type="submit" value="guess">
</form>

Hello
<%
Player p = (Player) request.getAttribute("player");
out.print(p.getName());

for (String s : p.getGuesses()){
	out.print(s + "<br>");
}

%>

</body>
</html>