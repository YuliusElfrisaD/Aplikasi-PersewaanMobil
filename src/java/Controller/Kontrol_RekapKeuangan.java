/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Persewaan;
import Model.RekapKeuangan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asih
 */
public class Kontrol_RekapKeuangan {

    Connection connection;
    KoneksiDB db = new KoneksiDB();

    public ArrayList<RekapKeuangan> tampilRekapKeuangan() throws SQLException {
        ArrayList<RekapKeuangan> rekap = new ArrayList<>();
        try {
            connection = db.getKoneksiOracleDB();
            String sql = "select * from rekapkeuangan";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RekapKeuangan r = new RekapKeuangan();

                Persewaan pr = new Persewaan();
                pr.setBiaya(rs.getString(1));
                pr.setTanggalKembali(rs.getString(2));
                r.setP(pr);

                rekap.add(r);
            }
            connection.commit();
            connection.close();

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return rekap;
    }
    
    public ArrayList<RekapKeuangan> tampilRekapKeuanganPerBulan(String bulan) throws SQLException {
        ArrayList<RekapKeuangan> rekap = new ArrayList<>();
        try {
            connection = db.getKoneksiOracleDB();
            String sql = "SELECT sum(biaya) FROM data_persewaan where tanggal_pinjam like '%"+bulan+"%'";;
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RekapKeuangan r = new RekapKeuangan();

                Persewaan pr = new Persewaan();
                pr.setBiaya(rs.getString(1));
                pr.setTanggalKembali(bulan);
                r.setP(pr);

                rekap.add(r);
            }
            connection.commit();
            connection.close();

        } catch (SQLException ex) {
            ex.getMessage();
        }
        return rekap;
    }
}
