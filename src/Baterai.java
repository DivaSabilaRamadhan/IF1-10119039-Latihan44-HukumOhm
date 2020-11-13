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
 * Deskripsi Program : berisi class Baterai
 */
public class Baterai {
    private float kuatArus, hambatan;
    public Baterai(){
            System.out.println("=================Hukum Ohm==================");
            System.out.println("Kuat Arus yang mengalir pada suatu hambatan\n"
            + "akan berbanding lurus dengan beda potesial\n"
            + "pada ujung=ujung kawat pengantar tersebut\n"
            + "asalkan suhu kaway dijaga kekonsistenannya");
    }  
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;                  
    }
    
    public float getKuatArus(){
        return kuatArus;
    }
    
    public float getHambatan(){
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
}
