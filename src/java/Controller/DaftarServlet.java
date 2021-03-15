/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
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
@WebServlet(name = "DaftarServlet", urlPatterns = {"/DaftarServlet"})
public class DaftarServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DaftarServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DaftarServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String idCustomer;
            Kontrol_Customer kc = new Kontrol_Customer();
            idCustomer = kc.buatKodeCustomer();
            
            String nama = request.getParameter("nama");
            String email = request.getParameter("email");
            String alamat = request.getParameter("alamat");
            String notelp = request.getParameter("notelp");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Customer c = new Customer(idCustomer, nama, email, alamat, notelp, username, password);
            kc.insertDataCustomer(c);
            response.sendRedirect("jsp/Login.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(DaftarServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
