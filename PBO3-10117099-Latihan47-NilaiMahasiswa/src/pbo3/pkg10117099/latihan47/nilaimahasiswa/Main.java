/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan47.nilaimahasiswa;

/**
 *
 * @author I Gusti Glen
//NAMA  :I Gusti Glen
//NIM   :10117099    
//KELAS :IF-3
 */
public class Main {
    public static void main(String[] args) {
        
        Index objI = new Index();
        objI.setQuis(75.0);
        objI.setUts(45.0);
        objI.setUas(34.0);
        System.out.println("QUIZ\t= "+objI.getQuis());
        System.out.println("UTS\t= "+objI.getUts());
        System.out.println("UAS\t= "+objI.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir = "+objI.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
        
        
        Index obj2 = new Index();
        obj2.setQuis(60.0);
        obj2.setUts(80.0);
        obj2.setUas(75.0);
        System.out.println("QUIZ\t= "+obj2.getQuis());
        System.out.println("UTS\t= "+obj2.getUts());
        System.out.println("UAS\t= "+obj2.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir = "+obj2.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");
        
        
        Index obj3 = new Index();
        obj3.setQuis(30.0);
        obj3.setUts(80.0);
        obj3.setUas(40.0);
        System.out.println("QUIZ\t= "+obj3.getQuis());
        System.out.println("UTS\t= "+obj3.getUts());
        System.out.println("UAS\t= "+obj3.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir = "+obj3.nilaiAkhir(0));
        System.out.println("");
        System.out.println("");

    }    
}
