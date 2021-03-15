/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Supir;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Asus a455l
 */
@WebServlet(name = "UpdateSupirServlet", urlPatterns = {"/UpdateSupir"})
public class UpdateSupirServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            System.out.println("A");
            String parameter1 = request.getParameter("updateSupir");
            String id = request.getParameter("updateSupir");
                HttpSession session = request.getSession();
                session.setAttribute("supir", id);
                response.sendRedirect("jsp/EditSupir.jsp");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String parameter2 = request.getParameter("parameter2");
                Kontrol_Supir ks = new Kontrol_Supir();
                String id = request.getParameter("parameter2");
                String nama = request.getParameter("nama");
                String alamat = request.getParameter("alamat");
                String notelp = request.getParameter("notelp");
                Supir s = new Supir(id, nama, alamat, notelp);
                ks.UpdateSupir(s);
                response.sendRedirect("jsp/Supir.jsp"); 
        } catch (Exception ex) {
            ex.getMessage();
        }
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
