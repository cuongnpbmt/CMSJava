<%-- 
    Document   : register
    Created on : Nov 24, 2016, 2:34:39 PM
    Author     : CuongNP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng ký thành viên</title>

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
                    <form action="SignUpServlet" method="post">
                        <h1>Tạo tài khoản </h1>
                        <div>
                            <input type="text" class="form-control" name="fullname" placeholder="Tên đầy đủ" required="" />
                        </div>
                        <div>
                            <input type="text" class="form-control" name="username" placeholder="Tên đăng nhập" required="" />
                        </div>
                        <div>
                            <input type="email" class="form-control" name="email" placeholder="Email" required="" />
                        </div>
                        <div>
                            <input type="password" class="form-control" name="pwd" placeholder="Mật khẩu" required="" />
                        </div>
                        <div>
                            <input type="password" class="form-control" name="repwd" placeholder="Nhập lại mật khẩu" required="" />
                        </div>
                      
                        <!-- Adding BotDetect Captcha to the page -->
                        <botDetect:captcha id="exampleCaptchaTag" userInputID="captchaCode" />

                        <div >
                            <input name="captchaCode" class="form-control" type="text" id="captchaCode" placeholder="Nhập mã xác nhận"/>
                            <button type="submit"  class="btn btn-default" name="validateCaptchaButton"  id="validateCaptchaButton" >Đăng ký</button>
                            <span class="correct">${messages.captchaCorrect}</span>
                            <span class="incorrect">${messages.captchaIncorrect}</span>
                        </div>
                        <%@include file="includes/errormsg.jsp" %>

                        

                        <div class="clearfix"></div>

                        <div class="separator">
                            <p class="change_link">Đã có tài khoản?
                                <a href="${pageContext.request.contextPath}/signin.jsp" class="to_register"> Đăng nhập </a>
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
