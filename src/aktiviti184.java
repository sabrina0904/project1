/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class aktiviti184 {
    public static void main (String []args){
        
        System.out.println("LATIHAN FORMATIF 1.4(SOALAN 1)");
            System.out.println("SOALAN 1: PROGRAM MENGIRA LUAS DINDING SEBUAH BILIK");
            System.out.println("BILIK : 1 pintu, 2 tingkap sama saiz, 4 sisi dinding sama saiz");
            System.out.println(" ");
            
            Scanner data = new Scanner(System.in);
            
            System.out.println("Input tinggi pintu dan tekan ENTER :");
            int tinggi_pintu = data.nextInt();
            System.out.println("Input lebar pintu dan tekan ENTER :");
            int lebar_pintu =data.nextInt();
            
            System.out.println("Input tinggi tingkap dan tekan ENTER :");
            int tinggi_tingkap = data.nextInt();
            System.out.println("Input lebar tingkap dan tekan ENTER :");
            int lebar_tingkap = data.nextInt();
            
            System.out.println("Input tinggi dinding dan tekan ENTER :");
            int tinggi_dinding = data.nextInt();
            System.out.println("Input lebar dinding dan tekan ENTER :");
            int lebar_dinding = data.nextInt();
            
            int luas_pintu , luas_tingkap , luas_dinding, luas_dinding_keseluruhan;
            luas_pintu = tinggi_pintu * lebar_pintu ;
            luas_tingkap = tinggi_tingkap * lebar_tingkap * 2;
            luas_dinding = tinggi_dinding * lebar_dinding * 4;
            
            luas_dinding_keseluruhan = luas_dinding - (luas_pintu + luas_tingkap);
            
            System.out.println(" ");
            System.out.println("Luas 2 Tingkap = " + luas_tingkap + "meter persegi");
            System.out.println("Luas Dinding Keseluruhan = " + luas_dinding_keseluruhan + " meter persegi ");
            
    }
            
      }
        

            
    

