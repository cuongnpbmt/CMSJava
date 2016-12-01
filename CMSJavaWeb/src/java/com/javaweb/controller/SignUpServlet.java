/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.controller;

import com.captcha.botdetect.web.servlet.Captcha;
import com.javaweb.model.TbUsers;
import com.javaweb.service.EnDeCryption;
import com.javaweb.service.UserServices;
import com.javaweb.service.md5;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CuongNP
 */
public class SignUpServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        Captcha captcha = Captcha.load(request, "exampleCaptchaTag");
        boolean isHuman = captcha.validate(request.getParameter("captchaCode"));
        if (!isHuman) {
            // Captcha validation failed, show error message
            session.setAttribute("errormsg", "Mã kiểm tra không đúng!");
            String url = "/register.jsp";
                getServletContext().getRequestDispatcher(url).forward(request, response);
        } else {
            // Captcha validation passed, perform protected action
           
            String username, email, password, fullname;

            username = request.getParameter("username");
            email = request.getParameter("email");
            password = request.getParameter("pwd");
            fullname = request.getParameter("fullname");
            Date date = new Date();
            String key = md5.md5Encryption(date.getTime() + "");

            EnDeCryption cryption = new EnDeCryption("caodangthuchanhfpt");
            String crypwd = cryption.encoding(password);

            TbUsers user = new TbUsers(username, crypwd, fullname, email, key);
            boolean rs = UserServices.InsertOrUpdate(user);

            if (rs) {
                String url = "/index.jsp";
                session.setAttribute("fullname", fullname);
                getServletContext().getRequestDispatcher(url).forward(request, response);
            } else {
                session.setAttribute("errormsg", "Đăng ký chưa thành công! <br /> Vui lòng thử lại.");
                String url = "/register.jsp";
                getServletContext().getRequestDispatcher(url).forward(request, response);
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
