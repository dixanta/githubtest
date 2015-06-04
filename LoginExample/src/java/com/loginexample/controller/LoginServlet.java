/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loginexample.controller;

import com.loginexample.dao.UserDAO;
import com.loginexample.dao.impl.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author forsell
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginProcess"})
public class LoginServlet extends HttpServlet {

    UserDAO userDAO=new UserDAOImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(userDAO.authenticate(username, password)!=null){
            response.sendRedirect("Success.jsp");
        }
        else
        {
            response.sendRedirect("Login.jsp?error=true");
        }
    }
}
