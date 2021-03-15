/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.Mobil;
import Model.Persewaan;
import Model.Supir;
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
 * @author Asih
 */
public class Kontrol_Persewaan {

    Connection connection;
    KoneksiDB db = new KoneksiDB();

    public ArrayList<Persewaan> tampilPersewaan() throws SQLException {
        ArrayList<Persewaan> sewa = new ArrayList<>();
        try {
            connection = db.getKoneksiOracleDB();
            String sql = "select * from data_persewaan order by idpersewaan asc";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Persewaan p = new Persewaan();
                p.setIdPersewaan(rs.getString(1));

                Customer c = new Customer();
                c.setIdCustomer(rs.getString(2));
                p.setC(c);

                Mobil m = new Mobil();
                m.setIdKendaraan(rs.getString(3));
                p.setM(m);

                p.setTanggalPinjam(rs.getString(4));
                p.setTanggalKembali(rs.getString(5));
                p.setBiaya(rs.getString(6));
                
                sewa.add(p); 
            }
            connection.commit();
            connection.close();
        }catch (SQLException ex){
            ex.getMessage();
        }
        return sewa;
    }
    
    public ArrayList<Persewaan> lihatPesanan(String id) throws SQLException {
        ArrayList<Persewaan> sewa = new ArrayList<>();
        try {
            connection = db.getKoneksiOracleDB();
            String sql = "SELECT * FROM data_persewaan where idcustomer ='"+id+"'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Persewaan p = new Persewaan();
                p.setIdPersewaan(rs.getString(1));

                Customer c = new Customer();
                c.setIdCustomer(rs.getString(2));
                p.setC(c);

                Mobil m = new Mobil();
                m.setIdKendaraan(rs.getString(3));
                p.setM(m);

                p.setTanggalPinjam(rs.getString(4));
                p.setTanggalKembali(rs.getString(5));                
                sewa.add(p); 
            }
            connection.commit();
            connection.close();
        }catch (SQLException ex){
            ex.getMessage();
        }
        return sewa;
    }
    
    public void insertDataPersewaan(Persewaan s) throws SQLException {
        PreparedStatement ps = null;
        String sql = "INSERT INTO DATA_PERSEWAAN VALUES (?,?,?,?,?,?)";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
            ps.setString(1, s.getIdPersewaan());
            ps.setString(2, s.getC().getIdCustomer());
            ps.setString(3, s.getM().getIdKendaraan());
            ps.setString(4, s.getTanggalPinjam());
            ps.setString(5, s.getTanggalKembali());
            ps.setString(6, s.getBiaya());
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

    public String buatKodePersewaan() {
        String kodeHuruf = "RENTAL";
        String kodeAngka = null;
        int angka = 0;
        String oper;
        try {
            String sql = "SELECT * FROM DATA_PERSEWAAN order by IDPERSEWAAN DESC";
            connection = db.getKoneksiOracleDB();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                kodeHuruf = rs.getString("IDPERSEWAAN").substring(0, 4);
                kodeAngka = rs.getString("IDPERSEWAAN").substring(4, 5);
                angka = Integer.parseInt(kodeAngka);
                angka = angka + 1;
                oper = String.valueOf(angka);
                kodeHuruf = kodeHuruf + oper;
                rs.getString("IDPERSEWAAN").substring(0, 4);
                return kodeHuruf;
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return kodeHuruf;
    }

    public void UpdatePersewaan(Persewaan s) {
        PreparedStatement ps = null;
        String sql = "update data_persewaan set tanggal_pinjam=?, tanggal_kembali=?, biaya=? where idpersewaan=?";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
            ps.setString(1, s.getTanggalPinjam());
            ps.setString(2, s.getTanggalKembali());
            ps.setString(3, s.getBiaya());
            ps.setString(4, s.getIdPersewaan());
            ps.executeUpdate();
            System.out.println("Data berhasil diubah");
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Kontrol_Supir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeletePersewaan(String kode) {
        PreparedStatement ps = null;
        String sql = "delete from data_persewaan where idpersewaan=?";
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
}
