/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mobil;
import Model.Persewaan;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "bookingServlet", urlPatterns = {"/bookingServlet"})
public class bookingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String idMobil = request.getParameter("pesanMobil");
        System.out.println("A");
        String idUser = (String) session.getAttribute("username");
        System.out.println(idUser);
        System.out.println("B");
        if (idUser == null) {
            System.out.println("C");
            response.sendRedirect("jsp/Login.jsp");
            System.out.println("D");
        } else {
            String mobil = request.getParameter("pesanMobil");
            String supir = (String)session.getAttribute("supir");

            int biaya = 0;
            int hargaMobil = 0;

            Kontrol_Mobil m = new Kontrol_Mobil();
            Mobil s = new Mobil();
            ArrayList<Mobil> mobilList;
            try {
                mobilList = m.getByIdMobil(mobil);
                for (int j = 0; j < mobilList.size(); j++) {
                    hargaMobil = mobilList.get(j).getHarga();
                }

                if (supir.equals("YA")) {
                    biaya = hargaMobil + 150000;
                }else{
                    biaya = hargaMobil;
                }
            } catch (SQLException ex) {
                Logger.getLogger(PencarianServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            String hargaTotal = Integer.toString(biaya);
            session.setAttribute("biaya", hargaTotal);
            session.setAttribute("mobil", mobil);
            Kontrol_Mobil mm = new Kontrol_Mobil();
            String status = "BOOKED";
            mm.UpdateStatusMobil(status, mobil);
            System.out.println(mobil);
            response.sendRedirect("Transaksi/IsiData.jsp");

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
