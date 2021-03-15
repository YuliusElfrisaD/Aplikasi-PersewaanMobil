/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.Supir;
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

/**
 *
 * @author Asus a455l
 */
@WebServlet(name = "InputSupirServlet", urlPatterns = {"/InputSupir"})
public class InputSupirServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InputSupirServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InputSupirServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String idSupir;
            Kontrol_Supir ks = new Kontrol_Supir();
            idSupir = ks.buatKodeSupir();
            String nama = request.getParameter("nama");
            String alamat = request.getParameter("alamat");
            String notelp = request.getParameter("notelp");
            Supir s = new Supir(idSupir, nama, alamat, notelp);
            ks.insertDataSupir(s);
            response.sendRedirect("jsp/Supir.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(InputSupirServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
