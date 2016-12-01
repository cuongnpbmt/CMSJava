/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaweb.controller;

import com.javaweb.model.TbFkUserRole;
import com.javaweb.model.TbUsers;
import com.javaweb.service.EnDeCryption;
import com.javaweb.service.UserServices;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CuongNP
 */
public class SignInServlet extends HttpServlet {

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
        
        String username, pwd;
        username = request.getParameter("username");
        pwd = request.getParameter("pwd");
        
        EnDeCryption cryption = new EnDeCryption("caodangthuchanhfpt");
        String crypwd = cryption.encoding(pwd);
        
        boolean rs = UserServices.CheckLogin(username, crypwd);
        HttpSession session = request.getSession();
        if(rs){
            TbUsers user = UserServices.GetUserByEmailOrUserid(username);
            session.setAttribute("fullname", user.getFullname());
            int userrole = UserServices.GetUserRole(user.getId());
            String url =  "index.jsp";
            switch (userrole) {
                case 1:
                    url = "/admin/index.jsp";
                    break;
                case 2:
                    url = "/index.jsp";
                    break;
                case 3:
                    url = "/index.jsp";
                    break;
                default:
                    break;
            }            
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }else{
            String url = "/signin.jsp";
            session.setAttribute("errormsg", "Đăng nhập thất bại, vui lòng kiểm tra lại!");
            getServletContext().getRequestDispatcher(url).forward(request, response);
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
