/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mobil;
import java.sql.Connection;
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
public class Kontrol_Mobil {

    Connection connection;
    KoneksiDB db = new KoneksiDB();

    public ArrayList<Mobil> tampilMobil() {
        ArrayList<Mobil> mob = new ArrayList<>();
        try {
            connection = db.getKoneksiOracleDB();
            String sql = "select * from mobil order by idkendaraan asc";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mobil m = new Mobil();
                m.setIdKendaraan(rs.getString(1));
                m.setNoPolisi(rs.getString(2));
                m.setNamaKendaraan(rs.getString(3));
                m.setTipe(rs.getString(4));
                m.setWarna(rs.getString(5));
                m.setTanggalPajak(rs.getString(6));
                m.setHarga(rs.getInt(7));
                m.setStatus(rs.getString(8));
                m.setGambar(rs.getString(9));
                mob.add(m);//Jangan lupa add ke dalam array list kategori
            }
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return mob;
    }
    
    public ArrayList<Mobil> getByIdMobil(String id) throws SQLException{
        ArrayList<Mobil> mob = new ArrayList<>();
        try {
            connection = db.getKoneksiOracleDB();
            String sql = "select * from mobil where idkendaraan='" + id + "'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mobil m = new Mobil();
//                m.setIdKendaraan(rs.getString(1));
//                m.setNoPolisi(rs.getString(2));
                m.setNamaKendaraan(rs.getString("NAMA_KENDARAAN"));
//                m.setTipe(rs.getString(4));
//                m.setWarna(rs.getString(5));
//                m.setTanggalPajak(rs.getString(6));
                m.setHarga(rs.getInt(7));
//                m.setStatus(rs.getString(8));
                m.setGambar(rs.getString("GAMBAR"));
                mob.add(m);//Jangan lupa add ke dalam array list kategori
            }
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return mob;
    }

    public void insertDataMobil(Mobil s) throws SQLException {
        PreparedStatement ps = null;
        String sql = "INSERT INTO MOBIL VALUES (?,?,?,?,?,?,?,?)";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
            ps.setString(1, s.getIdKendaraan());
            ps.setString(2, s.getNoPolisi());
            ps.setString(3, s.getNamaKendaraan());
            ps.setString(4, s.getTipe());
            ps.setString(5, s.getWarna());
            ps.setString(6, s.getTanggalPajak());
            ps.setDouble(7, s.getHarga());
            ps.setString(8, s.getStatus());
//            ps.setString(9, s.getGambar());
            ps.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }
//

    public void UpdateMobil(Mobil s) {
        PreparedStatement ps = null;
        String sql = "update mobil set nopolisi=?, tanggal_pajak=?, harga=?, status=?  where idkendaraan=?";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
            ps.setString(1, s.getNoPolisi());
            ps.setString(2, s.getTanggalPajak());
            ps.setDouble(3, s.getHarga());
            ps.setString(4, s.getStatus());
            ps.setString(5, s.getIdKendaraan());
            ps.executeUpdate();
            System.out.println("Data berhasil diubah");
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Kontrol_Supir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeleteMobil(String kode) {
        PreparedStatement ps = null;
        String sql = "delete from mobil where idkendaraan=?";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
            ps.setString(1, kode);
            ps.executeUpdate();
            System.out.println("Data berhasil dihapus");
            connection.commit();
            connection.close();
        } catch (SQLException ex) {

        }
    }
    
    public void UpdateStatusMobil(String status, String id) {
        PreparedStatement ps = null;
        String sql = "update mobil set status='"+status+"' where idkendaraan='"+id+"'";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
//            ps.setString(1, status);
//            ps.setString(2, id);
            ps.executeUpdate();
            System.out.println("Data berhasil diubah");
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
}
