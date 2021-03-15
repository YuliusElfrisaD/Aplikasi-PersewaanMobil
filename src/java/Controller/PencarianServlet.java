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
@WebServlet(name = "PencarianServlet", urlPatterns = {"/Pencarian"})
public class PencarianServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String supir = request.getParameter("radioSupir");
        String tglpinjam = request.getParameter("tglPinjam");
        String tglkembali = request.getParameter("tglKembali");
        String customer = (String) session.getAttribute("idCust");
        String jampinjam = request.getParameter("jamPinjam");
        String jamkembali = request.getParameter("jamKembali");
        String menitpinjam = request.getParameter("menitPinjam");
        String menitkembali = request.getParameter("menitKembali");
        
        Kontrol_Persewaan kp = new Kontrol_Persewaan();
        String id = kp.buatKodePersewaan();
        Persewaan booking = new Persewaan(id, tglpinjam, tglkembali, null);
        session.setAttribute("transaksi", booking.getIdPersewaan());
        session.setAttribute("tglPinjam", tglpinjam);
        session.setAttribute("tglKembali", tglkembali);
        session.setAttribute("jamPinjam", jampinjam);
        session.setAttribute("jamKembali", jamkembali);
        session.setAttribute("menitPinjam", menitpinjam);
        session.setAttribute("menitKembali", menitkembali);
        session.setAttribute("supir", supir);

        Kontrol_Pencarian p = new Kontrol_Pencarian();
        session.setAttribute("cariMobil", p.pencarianMobil(tglpinjam));
        response.sendRedirect("jsp/pencarian.jsp");
//        RequestDispatcher rd;
//        rd = request.getRequestDispatcher("jsp/pencarian.jsp");
//        rd.forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
