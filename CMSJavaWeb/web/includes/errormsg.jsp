<%-- 
    Document   : errormsg
    Created on : Dec 1, 2016, 11:00:33 AM
    Author     : CuongNP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (session.getAttribute("errormsg") != null) {

%>
<div class="panel panel-danger">
    <span class="text-danger"><%=session.getAttribute("errormsg")%></span>
</div>
<%
        session.removeAttribute("errormsg");
    }
%>