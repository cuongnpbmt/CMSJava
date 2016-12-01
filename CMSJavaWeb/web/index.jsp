<%-- 
    Document   : index
    Created on : Nov 21, 2016, 9:00:07 PM
    Author     : CuongNP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VNUSLAB.COM</title>
        <%@include file="includes/headtag.jsp" %>
        <%@include file="includes/includejs.jsp" %>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
        <header>            
            <%@include file="includes/banner.jsp" %>
        </header>

        <section class="container baiviet">
            <%@include file="includes/news.jsp" %>
        </section>
        <section class="container baiviet">
            <%@include file="includes/news.jsp" %>
        </section>
        
        <footer>
            <%@include file="includes/footer.jsp" %>    
        </footer>

    </body>
</html>
