/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.Mobil;
import Model.Persewaan;
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
@WebServlet(name = "EditPersewaan", urlPatterns = {"/EditPersewaan"})
public class EditPersewaan extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
//            String parameter1 = request.getParameter("updatePersewaan");
            String id = request.getParameter("updatePersewaan ");
            HttpSession session = request.getSession();
            session.setAttribute("rent", id);
            response.sendRedirect("jsp/EditPersewaan.jsp");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String parameter2 = request.getParameter("parameter2");
            System.out.println(parameter2);
//            String id = request.getParameter("id");
//            String idCust = request.getParameter("idcustomer");
//            String idMob = request.getParameter("idkendaraan");
            String tglPinjam = request.getParameter("tglPinjam");
            System.out.println(tglPinjam);
            
            String tglKembali = request.getParameter("tglKembali");
            System.out.println(tglKembali);
            
            String biaya = request.getParameter("biaya");
            System.out.println(biaya);
            
            Persewaan p = new Persewaan(parameter2, tglPinjam, tglKembali, biaya);
            Kontrol_Persewaan ks = new Kontrol_Persewaan();
            ks.UpdatePersewaan(p);
            System.out.println("BERHASIL UPDATE");
            response.sendRedirect("jsp/Persewaan.jsp");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
