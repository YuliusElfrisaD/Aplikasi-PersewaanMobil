/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;


/**
 *
 * @author Asus a455l
 */
public class KoneksiDB {
    
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
    String userId = "HR";
    String password = "hr";
    Connection conn;

    public KoneksiDB() {

    }

    public Connection getKoneksiOracleDB() {
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userId, password);
            System.out.println("Berhasil terhubung ke Oracle");
        } catch (SQLException ex) {
            System.out.println("Gagal terhubung ke Oracle");
        }
        return conn;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Tidak bisa tutup koneksi");
        }
    }
    
    public static void main(String[] args) {
        KoneksiDB c = new KoneksiDB();
        c.getKoneksiOracleDB();
       
    }

}
