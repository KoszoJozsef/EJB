/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.servlet;

import hu.ejb.StatefulBean;
import hu.ejb.StatelessBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author K
 */
@WebServlet("")
public class ServletStateful extends HttpServlet {
    
    @EJB(beanName = "stateful")
    private StatefulBean sfb;
    
    @EJB(beanName = "stateful")
    private StatefulBean sfb2;
    
    @EJB(beanName = "stateless")
    private StatelessBean slb;
    
    @EJB(beanName = "stateless")
    private StatelessBean slb2;
    

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
        
        PrintWriter out = response.getWriter();       
        
        out.println("Stateful: " + sfb.getNumber());
        
        sfb2.setNumber(15);
        
        out.println("setStateful: " + sfb.getNumber());
        
        out.println("Stateless: " + slb.getNumber());
        
        slb2.setNumber(15);
        
        out.println("setStateless: " + slb.getNumber());
        
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
