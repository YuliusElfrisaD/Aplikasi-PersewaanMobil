/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.Mobil;
import Model.Persewaan;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
@WebServlet(name = "TransaksiServlet", urlPatterns = {"/TransaksiServlet"})
public class TransaksiServlet extends HttpServlet {

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
        System.out.println("Aaa");
        HttpSession session = request.getSession();
        System.out.println("Bbb");
        String id = request.getParameter("pesanMobil");
        String customer = (String) session.getAttribute("idCust");
        String mobil = (String) session.getAttribute("mobil");
        String supir = (String) session.getAttribute("supir");
        String tglpinjam = (String) session.getAttribute("tglPinjam");
        String tglkembali = (String) session.getAttribute("tglKembali");
        String jampinjam = (String) session.getAttribute("jamPinjam");
        String jamkembali = (String) session.getAttribute("jamKembali");
        String menitpinjam = (String) session.getAttribute("menitPinjam");
        String menitkembali = (String) session.getAttribute("menitKembali");
        String biaya = (String) session.getAttribute("biaya");
        String test = request.getParameter("buktiPembayaran");
        System.out.println("Ccc");

        Mobil mob = new Mobil();
        mob.setIdKendaraan(mobil);

        Customer cust = new Customer();
        cust.setIdCustomer(customer);

        Kontrol_Persewaan persewaan = new Kontrol_Persewaan();
        Persewaan s = new Persewaan(id, cust, mob, tglpinjam, tglkembali, biaya);
        try {
            persewaan.insertDataPersewaan(s);
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        Kontrol_Mobil mm = new Kontrol_Mobil();
        String status = "AVAILABLE";
        mm.UpdateStatusMobil(status, mobil);
        System.out.println(mobil);
        session.removeAttribute("mobil");
        session.removeAttribute("supir");
        session.removeAttribute("tglPinjam");
        session.removeAttribute("tglKembali");
        session.removeAttribute("jamPinjam");
        session.removeAttribute("jamKembali");
        session.removeAttribute("menitPinjam");
        session.removeAttribute("menitKembali");
        session.removeAttribute("biaya");
        response.sendRedirect("./jsp/LihatPesanan.jsp");
        
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
