/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini menampilkan tentang hukum ohm dengan dendekatan objek 
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai batt = new Baterai();
        Baterai batt2 = new Baterai(3,2);
        
        System.out.println("Kuat Arus      : " + batt2.getKuatArus() + " ampere ");
        System.out.println("Hambatan       : " + batt2.getHambatan() + " Ohm " );
        System.out.println("Hasil Tegangan : " + batt2.hitungTegangan() + " volt ");
    }
    
}
