<%-- 
    Document   : left
    Created on : Nov 21, 2016, 11:46:08 PM
    Author     : Windows 10 Version 2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="col-md-3 left_col">
    <div class="left_col scroll-view">
        <div class="navbar nav_title" style="border: 0;">
            <a href="http://vnuslab.com" class="site_title"><i class="fa fa-paw"></i> <span>VNUSLAB.COM!</span></a>
        </div>

        <div class="clearfix"></div>

        <!-- menu profile quick info -->
        <div class="profile">
            <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
            </div>
            <div class="profile_info">
                <span>Welcome,</span>
                <h2>Dung, Tu Duc</h2>
            </div>
        </div>
        <!-- /menu profile quick info -->

        <br />

        <!-- sidebar menu -->
        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
            <div class="menu_section">
                <h3>vnuslab.com</h3>
                <ul class="nav side-menu">
                    <li><a><i class="fa fa-home"></i> Tổng quan <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${pageContext.request.contextPath}/index.jsp">Trang web</a></li>
                            <li><a href="index2.html">Thông tin website</a></li>
                            <li><a href="index3.html">Cấu hình website</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-edit"></i> Quản lý bài viết <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="form.html">Loại bài</a></li>
                            <li><a href="form_advanced.html">Bài đăng</a></li>
                            <li><a href="form_validation.html">Bình luận</a></li>

                        </ul>
                    </li>
                    <li><a><i class="fa fa-user"></i> Người dùng <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="general_elements.html">Danh sách thành viên</a></li>
                            <li><a href="media_gallery.html">Quản lý quyền</a></li>
                            <li><a href="typography.html">Phân quyền</a></li>

                        </ul>
                    </li>
                    <li><a><i class="fa fa-table"></i> Phản hồi <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="tables.html">Danh sách phản hồi</a></li>
                            <li><a href="tables_dynamic.html">Table Dynamic</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-file-code-o"></i> Quản lý trang <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="chartjs.html">Danh sách trang</a></li>
                            <li><a href="chartjs2.html">Thêm trang</a></li>
                            <li><a href="morisjs.html">Moris JS</a></li>
                            <li><a href="echarts.html">ECharts</a></li>
                            <li><a href="other_charts.html">Other Charts</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-clone"></i>Layouts <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="fixed_sidebar.html">Fixed Sidebar</a></li>
                            <li><a href="fixed_footer.html">Fixed Footer</a></li>
                        </ul>
                    </li>
                </ul>
            </div>


        </div>
        <!-- /sidebar menu -->

        <!-- /menu footer buttons -->
        <div class="sidebar-footer hidden-small">
            <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
            </a>
            <a data-toggle="tooltip" data-placement="top" title="Logout">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
            </a>
        </div>
        <!-- /menu footer buttons -->
    </div>
</div>
