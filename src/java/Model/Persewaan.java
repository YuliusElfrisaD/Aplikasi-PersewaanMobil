/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Asih
 */
public class Persewaan {

    private String idPersewaan;
    private Customer c;
    private Mobil m;
    private String tanggalPinjam;
    private String tanggalKembali;
    private String biaya;

    public Persewaan() {

    }

    public Persewaan(String idPersewaan, Customer c, Mobil m, String tanggalPinjam, String tanggalKembali, String biaya) {
        this.idPersewaan = idPersewaan;
        this.c = c;
        this.m = m;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.biaya = biaya;
    }

    public Persewaan(String idPersewaan, String tanggalPinjam, String tanggalKembali, String biaya) {
        this.idPersewaan = idPersewaan;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.biaya = biaya;
    }
    
    
    
    public String getIdPersewaan() {
        return idPersewaan;
    }

    public void setIdPersewaan(String idPersewaan) {
        this.idPersewaan = idPersewaan;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public Mobil getM() {
        return m;
    }

    public void setM(Mobil m) {
        this.m = m;
    }

}
