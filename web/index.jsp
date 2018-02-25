<%@ page language="java" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!--jsp:forward page="Welcome.do"/-->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body align="center">
        <p align="center>"><h1>Pagina di benvenuto</h1></p>
    <ul>
        <li><a href="WhoWeAre.do">Chi Siamo</a>
        <li><html:link forward="Contacts">Contatti</html:link>
        <li><a href="Error.do">Errore</a>
        <li><a href="ProvaAction.do">Prova Action</a>
     </ul>
    <ol>
        <li><a href="ProvaActionOk.do">Testa il successo</a>
        <li><a href="ProvaActionFail.do">Testa il fallimento</a>
    </ol>
    
    <html:form action="">
        <html:text property="nome" />

    </html:form>
    </body>
</html>
