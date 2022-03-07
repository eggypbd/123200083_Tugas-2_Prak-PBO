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
public class Lingkaran implements MenghitungBidang {
    
   float r;
   float d;
  
  

    @Override
    public double luas() {
        double luas = (float) (Math.PI * r * r);
        System.out.println(" Luas Lingkaran = " + luas);
        return luas;
    }
    
    @Override
    public double keliling(){
        double keliling = 2 * Math.PI * r;
        System.out.println(" Keliling Lingkaran = " + keliling);
        return keliling;
    }
    
}
