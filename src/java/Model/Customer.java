/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Asus a455l
 */
public class Customer {

    private String idCustomer;
    private String nama;
    private String email;
    private String alamat;
    private String noTelp;
    private String username;
    private String password;
    

    public Customer() {

    }

    public Customer(String idCustomer, String nama, String email, String alamat, String noTelp, String username, String password) {
        this.idCustomer = idCustomer;
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.username = username;
        this.password = password;
    }
    
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
