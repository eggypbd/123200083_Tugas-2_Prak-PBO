/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author HP
 */
public class PersegiPanjang implements MenghitungBidang {
    
    
   float p;
   float l;
    
    

   
    @Override
    public double luas() {
      
        double luas = p * l;
        System.out.println(" Luas Persegi Panjang = " + luas);
        return luas;
    }
    
   @Override
    public double keliling(){
        
        double keliling = ( p + l) * 2;
        System.out.println(" Keliling Persegi Panjang = " + keliling);
        return keliling;
    }
    
    
    
} 
