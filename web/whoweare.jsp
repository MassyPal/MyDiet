<%@ page language="java" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>


<!--jsp:forward page="Welcome.do"/-->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chi siamo - <bean:message key="applicazione.nome"/></title>
    </head>

    <body align="center" leftmargin="0" topmargin="0">
        <center>

            <table border="1" width ="75%" height="720">
                <tr> <!-- Header -->
                    <td colspan ="2" valign="middle">
                        <h1><bean:message key="applicazione.nome"/></h1></td>
                </tr>


                <tr> <!-- Menu -->
                    <td colspan ="2" align="right" valign="middle">
                        Home / Chi Siamo / Registrati / Contatti
                    </td>
                </tr>

                <tr height="600">
                    <td valign="top"> <!-- Content -->

                        <p align="center>"><h1>Chi siamo</h1></p>


                    </td>
                    <td width="25%" valign="top"> <!-- Side -->
                        <ul>
                            <li><a href="Welcome.do">Welcome</a>
                            <li><a href="WhoWeAre.do">Chi Siamo</a>
                            <li><html:link forward="Contacts">Contatti</html:link>
                            <li><a href="Error.do">Errore</a>
                            <li><a href="ProvaAction.do">Prova Action</a>
                        </ul>
                        <ol>
                            <li><a href="ProvaActionOk.do">Testa il successo</a>
                            <li><a href="ProvaActionFail.do">Testa il fallimento</a>
                        </ol>

                    </td></tr>

                <tr> <!-- Footer --> 
                    <td colspan ="2" align="center" valign="middle">
                        &copy; MassyPal Creation and design - 2018
                    </td>
                </tr>

            </table>

        </center>
    </body>
</html>
