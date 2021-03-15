/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mobil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus a455l
 */
public class Kontrol_Pencarian {

    Connection connection;
    KoneksiDB db = new KoneksiDB();

    public ArrayList<Mobil> pencarianMobil(String tanggalpinjam) {
        ArrayList<Mobil> mob = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mobil where idkendaraan NOT IN (select idkendaraan FROM data_persewaan where tanggal_pinjam = '" + tanggalpinjam + "') and status = 'AVAILABLE'";
            connection = db.getKoneksiOracleDB();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                Mobil m = new Mobil();
                m.setIdKendaraan(rs.getString(1));
                m.setNamaKendaraan(rs.getString(3));
                m.setGambar(rs.getString(9));
                mob.add(m);
            }
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return mob;
    }
       
}
