/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
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
public class Kontrol_Customer {

    Connection connection;
    KoneksiDB db = new KoneksiDB();

    public void insertDataCustomer(Customer c) throws SQLException {
        PreparedStatement ps = null;
        String sql = "INSERT INTO CUSTOMER VALUES (?,?,?,?,?,?,?)";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
            ps.setString(1, c.getIdCustomer());
            ps.setString(2, c.getNama());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getAlamat());
            ps.setString(5, c.getNoTelp());
            ps.setString(6, c.getUsername());
            ps.setString(7, c.getPassword());
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

    public void UpdateCustomer(Customer s) {
        PreparedStatement ps = null;
        String sql = "update customer set nama=?, email=?, alamat=?, notelp=?, username=?, password=? where idcustomer=?";
        try {
            connection = db.getKoneksiOracleDB();
            ps = connection.prepareStatement(sql);
            ps.setString(1, s.getNama());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getAlamat());
            ps.setString(4, s.getNoTelp());
            ps.setString(5, s.getUsername());
            ps.setString(6, s.getPassword());
            ps.setString(7, s.getIdCustomer());
            ps.executeUpdate();
            System.out.println("Data berhasil diubah");
            connection.commit();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Kontrol_Supir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String buatKodeCustomer() {
        String kodeHuruf = "CUSTOMER";
        String kodeAngka = null;
        int angka = 0;
        String oper;
        try {
            String sql = "SELECT * FROM CUSTOMER order by IDCUSTOMER DESC";
            connection = db.getKoneksiOracleDB();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {
                kodeHuruf = rs.getString("IDCUSTOMER").substring(0, 4);
                kodeAngka = rs.getString("IDCUSTOMER").substring(4, 5);
                angka = Integer.parseInt(kodeAngka);
                angka = angka + 1;
                oper = String.valueOf(angka);
                kodeHuruf = kodeHuruf + oper;
                rs.getString("IDCUSTOMER").substring(0, 4);
                return kodeHuruf;
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return kodeHuruf;
    }

    public ArrayList<Customer> getByIdCustomer(String id) throws SQLException {
        connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        ArrayList<Customer> custList = new ArrayList<Customer>();
        try {
            connection = db.getKoneksiOracleDB();
            statement = connection.prepareStatement("SELECT * FROM CUSTOMER where IDCUSTOMER ='" + id + "'");
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Customer c = new Customer();
                c.setNama(resultSet.getString("NAMA"));
                c.setEmail(resultSet.getString("EMAIL"));
                c.setAlamat(resultSet.getString("ALAMAT"));
                c.setNoTelp(resultSet.getString("NOTELP"));
                c.setUsername(resultSet.getString("USERNAME"));
                c.setPassword(resultSet.getString("PASSWORD"));
                custList.add(c);
            }
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ignore) {
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            }
        }
        return custList;
    }

}
