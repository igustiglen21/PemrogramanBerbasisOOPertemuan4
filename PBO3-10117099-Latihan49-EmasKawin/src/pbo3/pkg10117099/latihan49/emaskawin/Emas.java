/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan49.emaskawin;

/**
 *
 * @author I Gusti Glen
//NAMA  :I Gusti Glen
//NIM   :10117099    
//KELAS :IF-3
 */
public class Emas {
    private double totalBerat;
    private int harga;

    public double getTotalBerat() {
        return totalBerat;
    }

    public void setTotalBerat(double totalBerat) {
        this.totalBerat = totalBerat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public double perhitungan(){
        return harga*totalBerat;
    }
    
}
