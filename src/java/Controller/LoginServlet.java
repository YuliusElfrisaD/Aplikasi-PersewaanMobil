/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Message;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        PrintWriter out = response.getWriter();
//        String akun = request.getParameter("akun");
        HttpSession session;
        Kontrol_Login k = new Kontrol_Login();
//        if (akun.equalsIgnoreCase("login")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String kode_user;
        String table[] = {"CUSTOMER", "STAFF", "PEMILIK"};
        String[] login = null;
        login = k.Login(table, username, password);
        if (login[0] != null && login[1] != null) {
            session = request.getSession(true);
            session.setAttribute("username", username);
            session.setAttribute("idCust", (String) login[1]);
            response.sendRedirect(login[0]);
        } else if (login[0] == null || login[1] == null) {
            response.sendRedirect("jsp/Login.jsp?error=y");
            Message msg = new Message("Maaf, username atau password tidak valid!");
            request.setAttribute("Message", msg);
        }

    }
}

//@Override
//        public String getServletInfo() {
//
//        return "Short description";
//    }// </editor-fold>

