/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mobil;
import Model.Supir;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "UpdateMobilServlet", urlPatterns = {"/UpdateMobil"})
public class UpdateMobilServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            System.out.println("A");
            String parameter1 = request.getParameter("updateMobil");
            String id = request.getParameter("updateMobil");
                HttpSession session = request.getSession();
                session.setAttribute("mobil", id);
                response.sendRedirect("jsp/EditMobil.jsp");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
                String parameter2 = request.getParameter("parameter2");
                Kontrol_Mobil ks = new Kontrol_Mobil();
                String id = request.getParameter("parameter2");
                String nopol = request.getParameter("nopol");
                String tanggalPajak = request.getParameter("tglPajak");
                int harga = Integer.parseInt(request.getParameter("harga")) ;
                String status = request.getParameter("status");
                Mobil m = new Mobil(id, nopol, tanggalPajak, harga, status);
                ks.UpdateMobil(m);
                response.sendRedirect("jsp/Supir.jsp"); 
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
