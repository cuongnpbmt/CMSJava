<%-- 
    Document   : header
    Created on : Nov 21, 2016, 8:58:10 PM
    Author     : CuongNP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">VNUSLAB</a>
        </div>

        <ul class="nav navbar-nav navbar-right ">
            <li class="active"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
            <li><a href="#">Page 1</a></li>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 2                
                    <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="${pageContext.request.contextPath}">Page 1-1</a></li>
                    <li><a href="#">Page 1-2</a></li>
                    <li><a href="#">Page 1-3</a></li> 
                </ul>
            </li> 
            <%
                if (session.getAttribute("fullname") != null) {
            %>
            <li><a href="${pageContext.request.contextPath}/infoaccout.jsp"><span class="glyphicon glyphicon-user"></span> <%=session.getAttribute("fullname")%> </a></li>
            <li><a href="${pageContext.request.contextPath}/signout.jsp"><span class="glyphicon glyphicon-log-in"></span> Đăng xuất</a></li>
                <%
                } else {
                %>
            <li><a href="${pageContext.request.contextPath}/register.jsp"><span class="glyphicon glyphicon-print"></span> Đăng ký</a></li>
            <li><a href="${pageContext.request.contextPath}/signin.jsp"><span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a></li>
                <%
                    }
                %>
        </ul>
    </div>
</nav>