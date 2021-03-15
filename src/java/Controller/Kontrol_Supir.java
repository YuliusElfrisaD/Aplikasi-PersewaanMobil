package Controller;

import Model.Customer;
import Model.Supir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus a455l
 */
public class Kontrol_Supir {

    Connection connection;
    KoneksiDB db = new KoneksiDB();

    public ArrayList<Supir> tampilSupir() {
        ArrayList<Supir> sup = new ArrayList<>();
        try {
            connection = db.getKoneksiOracleDB();
            String sql = "select * from supir order by idsupir asc";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Supir s = new Supir();
                s.setIdSupir(rs.getString(1));
                s.setNamaSupir(rs.getString(2));
                s.setAlamatSupir(rs.getString(3));
                s.setNotelpSupir(rs.getString(4));
                sup.add(s);//Jangan lupa add ke dalam array list kategori
            }
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return sup;
    }

    public void insertDataSupir(Supir s) throws SQLException {
        PreparedStatement ps = null;
        String sql = "INSERT INTO SUPIR VALUES (?,?,?,?)";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
            ps.setString(1, s.getIdSupir());
            ps.setString(2, s.getNamaSupir());
            ps.setString(3, s.getAlamatSupir());
            ps.setString(4, s.getNotelpSupir());
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

    public String buatKodeSupir() {
        String kodeHuruf = "SUPIR";
        String kodeAngka = null;
        int angka = 0;
        String oper;
        try {
            String sql = "SELECT * FROM SUPIR order by IDSUPIR DESC";
            connection = db.getKoneksiOracleDB();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                kodeHuruf = rs.getString("IDSUPIR").substring(0, 3);
                kodeAngka = rs.getString("IDSUPIR").substring(3, 4);
                angka = Integer.parseInt(kodeAngka);
                angka = angka + 1;
                oper = String.valueOf(angka);
                kodeHuruf = kodeHuruf + oper;
                rs.getString("IDSUPIR").substring(0, 3);
                return kodeHuruf;
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return kodeHuruf;
    }

    public void UpdateSupir(Supir s) {
        PreparedStatement ps = null;
        String sql = "update supir set nama_supir=?, alamat_supir=?, notelp_supir=? where idsupir=?";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
            ps.setString(1, s.getNamaSupir());
            ps.setString(2, s.getAlamatSupir());
            ps.setString(3, s.getNotelpSupir());
            ps.setString(4, s.getIdSupir());
            ps.executeUpdate();
            System.out.println("Data berhasil diubah");
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Kontrol_Supir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeleteSupir(String kode) {
        PreparedStatement ps = null;
        String sql = "delete from supir where idsupir=?";
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
