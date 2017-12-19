<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="beans.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ma page vue JSP</title>
</head>
<body>

	<h1>Hello World !! (depuis une JSP)</h1>

	<%-- reception de l'envoi de la Servlet --%>
	<%
		// reception de l'objjet envoyé de la Servlet ("perso")
		//Personne p = (Personne) request.getAttribute("perso");
		//out.print("Hello " + p.getPrenom() + " " + p.getNom());
		// reception du message envoyé de la Servlet ("messageEnvoye")
		String result = (String) request.getAttribute("messageEnvoye"); // passage en String
		out.println(result);
	%>
	

</body>
</html>