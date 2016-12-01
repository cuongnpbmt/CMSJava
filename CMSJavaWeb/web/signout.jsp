<%-- 
    Document   : signout
    Created on : Dec 1, 2016, 4:34:52 PM
    Author     : Windows 10 Version 2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if(session != null){
        session.removeAttribute("fullname");
       
        response.sendRedirect("signin.jsp");
    }                   

%>
