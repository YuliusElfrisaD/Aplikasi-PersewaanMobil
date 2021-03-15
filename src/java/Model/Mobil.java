/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Asus a455l
 */
public class Mobil {
    private String idKendaraan ;
    private String noPolisi;
    private String namaKendaraan;
    private String tipe ;
    private String warna;
    private String tanggalPajak;
    private int harga;
    private String status;
    private String gambar;

    public Mobil() {
    }

    public Mobil(String idKendaraan, String namaKendaraan, String gambar) {
        this.idKendaraan = idKendaraan;
        this.namaKendaraan = namaKendaraan;
        this.gambar = gambar;
    }

    public Mobil(String idKendaraan, String noPolisi, String namaKendaraan, String tipe, String warna, String tanggalPajak, int harga, String status, String gambar) {
        this.idKendaraan = idKendaraan;
        this.noPolisi = noPolisi;
        this.namaKendaraan = namaKendaraan;
        this.tipe = tipe;
        this.warna = warna;
        this.tanggalPajak = tanggalPajak;
        this.harga = harga;
        this.status = status;
        this.gambar = gambar;
    }

    public Mobil(String idKendaraan, String noPolisi, String tanggalPajak, int harga, String status) {
        this.idKendaraan = idKendaraan;
        this.noPolisi = noPolisi;
        this.tanggalPajak = tanggalPajak;
        this.harga = harga;
        this.status = status;
    }
    
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTanggalPajak() {
        return tanggalPajak;
    }

    public void setTanggalPajak(String tanggalPajak) {
        this.tanggalPajak = tanggalPajak;
    }
    
    
            
}
