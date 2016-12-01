<%-- 
    Document   : signin
    Created on : Nov 27, 2016, 8:23:38 PM
    Author     : CuongNP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign in</title>
        <%@include file="admin/includes/adminheadtag.jsp" %>
        <%@include file="includes/headtag.jsp" %>
    </head>
    <body class="login">
        <header>
            <%@include file="includes/header.jsp" %>
        </header>
        <section class="login_wrapper">
            <div id="register" class="animate form registration_form">
                <section class="login_content">
                    <form action="SignInServlet" method="post">
                        <h1>Đăng nhập </h1>
                      
                        <div>
                            <input type="text" class="form-control" name="username" placeholder="Tên đăng nhập" required="" />
                        </div>
                     
                        <div>
                            <input type="password" class="form-control" name="pwd" placeholder="Mật khẩu" required="" />
                        </div>
                      
                        <div >                          
                            <button type="submit"  class="btn btn-default" >Đăng nhập</button>                            
                        </div>
                        <%@include file="includes/errormsg.jsp" %>

                        <div class="clearfix"></div>

                        <div class="separator">
                            <p class="change_link">
                                <a href="${pageContext.request.contextPath}/signup.jsp" class="to_register"> Tạo tài khoản. </a>
                                <a href="${pageContext.request.contextPath}/signin.jsp" class="to_register"> Quên mật khẩu </a>
                            </p>

                            <div class="clearfix"></div>

                        </div>

                    </form>
                </section>
            </div>
        </section>
        <footer>
            <%@include file="includes/footer.jsp" %>
        </footer>

    </body>
</html>
