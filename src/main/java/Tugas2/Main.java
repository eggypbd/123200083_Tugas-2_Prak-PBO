/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {

   public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double c;
        int menu = 1;
        
        System.out.println("============");
        System.out.println(" MENU UTAMA");
        System.out.println("============");
   
        while(menu!=3){
            
            
            System.out.println("\nOpsi");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");
            menu = input.nextInt();
            
            switch(menu){
                case 1:
                    
                    MenghitungBidang bidang = new MenghitungBidang();
                    MenghitungRuang ruang = new MenghitungRuang();
                    
                    PersegiPanjang perpan = new PersegiPanjang();
                    Balok balok = new Balok();
                    
                    System.out.println("Input Tinggi :");
                    int t = input.nextInt();
                    System.out.println("Input Panjang :");
                    int p = input.nextInt();
                    System.out.println("Input Lebar :");
                    int l = input.nextInt();
                    
                    ruang.volume();
                    ruang.luasperm();
                    
                    bidang.luas();
                    bidang.keliling();
                    
                    perpan.luas();
                    perpan.keliling();
                    
                    balok.volume();
                    balok.luasperm();
                    
                    
                    
                    break;
                
                case 2:
                    
                    MenghitungBidang bidangs = new MenghitungBidang();
                    MenghitungRuang ruangs = new MenghitungRuang();
                    
                    Lingkaran lingkar = new Lingkaran();
                    Tabung tabung = new Tabung();
                    
                    System.out.println("Input Jari-jari :");
                    int r = input.nextInt();
                    System.out.println("Input Tinggi :");
                    int tt = input.nextInt();
                   
                    
                    ruangs.volume();
                    ruangs.luasperm();
                    
                    bidangs.luas();
                    bidangs.keliling();
                    
                    lingkar.luas();
                    lingkar.keliling();
                    
                    tabung.volume();
                    tabung.luasperm();
                    
                    break;
                
                case 3:
                    break;
                
                default:
                    System.out.println("\nOpsi Tidak Ada. Mohon Masukkan Opsi Dengan Benar!!");
                    break;
            }
        }
        
    
        // TODO code application logic here
    }
}
