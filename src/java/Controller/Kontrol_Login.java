/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Asus a455l
 */
public class Kontrol_Login {
    
    public String[] Login(String table[], String username, String password) {
        String[] txt = new String[2];
//        String kode_cust =null;
        Connection c = Koneksi.koneksi.getKoneksi();
        for (int i = 0; i < table.length; i++) {
            try {
                String sql = "select * from " + table[i] + " where username= '" + username + "' and password ='" + password + "'";
                Statement stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                  String kode = rs.getString(1);
                    System.out.println(kode.substring(0, 4));
                    if (kode.substring(0, 4).equalsIgnoreCase("CUST")) {
                        txt[0]="http://localhost:8084/RPL/jsp/index.jsp";
                        txt[1]=rs.getString("idcustomer");
                        System.out.println("a");
                        break;
                    } else if (kode.substring(0, 4).equalsIgnoreCase("STAF")) {
                        txt[0]="http://localhost:8084/RPL/jsp/Staff.jsp";
                        txt[1]=rs.getString("idstaff");
                        System.out.println("b");
                        break;
                    }else if (kode.substring(0, 4).equalsIgnoreCase("BOSS")) {
                        txt[0]="http://localhost:8084/RPL/jsp/Pemilik.jsp";
                        txt[1]=rs.getString("idpemilik");
                        System.out.println("c");
                        break;
                    }else {    
                        break;
                    }
                } else {                 
//                    response.sendRedirect("Login.jsp?login=salah");
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
        return txt;
    }
}
