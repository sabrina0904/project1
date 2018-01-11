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
public class exercise2 {
    public static void main (String args []){
        
        double no1;
        double no2;
        double jawapan;
        
        
        Scanner input= new Scanner (System.in);
        System.out.println("Masukkan no1 :");
        no1=input.nextDouble();
        
        System.out.println("Masukkan no2 :");
        no2=input.nextDouble();
        
        jawapan=no1+no2;
        System.out.println("Hasil tambah : " +jawapan);
        jawapan=no1-no2;
        System.out.println("Hasil tolak : " +jawapan);
        jawapan=no1*no2;
        System.out.println("Hasil darab : " +jawapan);
        jawapan=no1/no2;
        System.out.println("Hasil bahagi : " +jawapan);
        
        
        
        
    }
}
