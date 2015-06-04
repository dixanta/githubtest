/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loginexample.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kripesh
 */
public class AuthFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init Started");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest)request;
        HttpServletResponse res=(HttpServletResponse) response;
        //Boolean loggedIn=false;
        HttpSession session=req.getSession(false);
        
        if(session!=null  && (Boolean)session.getAttribute("LoggedIn") ){
            chain.doFilter(req, res);
        }
        else{
            
            res.sendRedirect("/LoginExample/Login.jsp?error=true");
        }
            
            
        
    }

    @Override
    public void destroy() {
       System.out.println("Destroy"); 
    }
    
}
