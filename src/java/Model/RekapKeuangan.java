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
public class RekapKeuangan {
    private Persewaan P;

    public RekapKeuangan() {
    }

    public RekapKeuangan(Persewaan P) {
        this.P = P;
    }

    public Persewaan getP() {
        return P;
    }

    public void setP(Persewaan P) {
        this.P = P;
    }
    
    
}
