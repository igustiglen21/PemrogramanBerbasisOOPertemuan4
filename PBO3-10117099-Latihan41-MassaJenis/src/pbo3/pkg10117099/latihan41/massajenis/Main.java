/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan41.massajenis;

/**
 *
 * @author I Gusti Glen
//NAMA  :I Gusti Glen
//NIM   :10117099    
//KELAS :IF-3
 */
public class Main {
    public static void main(String[] args) {
        
        Kubus objK = new Kubus();
        System.out.println("==== Massa Jenis Kubus====");
        objK.setSisi(5);
        objK.setMassa(250);
        System.out.println("Sisi : "+objK.getSisi());
        System.out.println("Massa : "+objK.getMassa());
        System.out.println("");
        System.out.println("==== Hasil Perhitungan====");
        System.out.println("Volume : "+objK.hitungVolume(0));
        System.out.println("Massa Jenis : "+objK.hitungMassaJenis(0,0));

    }
    
}
