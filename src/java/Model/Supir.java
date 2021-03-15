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
public class Supir {
    private String idSupir;
    private String namaSupir;
    private String alamatSupir;
    private String notelpSupir;

    public Supir() {
    }

    public Supir(String idSupir, String namaSupir, String alamatSupir, String notelpSupir) {
        this.idSupir = idSupir;
        this.namaSupir = namaSupir;
        this.alamatSupir = alamatSupir;
        this.notelpSupir = notelpSupir;
    }

    public String getIdSupir() {
        return idSupir;
    }

    public void setIdSupir(String idSupir) {
        this.idSupir = idSupir;
    }

    public String getNamaSupir() {
        return namaSupir;
    }

    public void setNamaSupir(String namaSupir) {
        this.namaSupir = namaSupir;
    }

    public String getAlamatSupir() {
        return alamatSupir;
    }

    public void setAlamatSupir(String alamatSupir) {
        this.alamatSupir = alamatSupir;
    }

    public String getNotelpSupir() {
        return notelpSupir;
    }

    public void setNotelpSupir(String notelpSupir) {
        this.notelpSupir = notelpSupir;
    }
    
    
            
}
