/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan22_perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan perhitungan 
* lingkaran  yang inputannya berasal dari user
 */
public class PBO3_10117082_Latihan22_PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String d;
        double r;
        double L;
        double diameter;
        double K;
        
        Scanner scn = new Scanner (System.in);
        
        System.out.println("=============PERHITUNGAN LINGKARAN===============");
        do{
            System.out.println("Masukkan Nilai Diameter Lingkaran : ");
            d = scn.nextLine();
            
            System.out.println((!d.matches("[0-9]*"))?"Nilai Diameter Tidak "
                    + "Sesuai\n":"");
            
        }
        while (!d.matches("[0-9]*"));
        
        System.out.println("\n==========HASIL PEHITUNGAN LINGKARAN==========");
                 diameter = Double.parseDouble(d); 
                  r = diameter/2;
        System.out.printf("Jari-Jari Lingkaran = %.0f cm %n",r);
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",L);    
        K = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",K);
    }
    
}
