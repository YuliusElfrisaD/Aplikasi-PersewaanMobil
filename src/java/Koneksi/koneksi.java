package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksi {

    public static Connection getKoneksi() {

        String host = "localhost";
        String port = "1521";
        String db = "xe";
        String usr = "hr";
        String pwd = "hr";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Maaf, driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }
        //Hubungkan ke sumber data
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + ":" + db, usr, pwd);
        } catch (SQLException ex) {
            System.out.println("Maaf, koneksi tidak berhasil");
            System.out.println(ex.getMessage());
        }
        if (conn != null) {
            System.out.println("Koneksi ke database berhasil terhubung");
        } else {
            System.out.println("Maaf, koneksi ke database gagal terbentuk");
        }
        return conn;
    }
//      public static void main(String[] args) {
//        Frame_1 panggil = new Frame_1();
//        panggil.setVisible(true);
//    }    
}