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
public class Balok implements MenghitungRuang {
    
    
    
    int t;
    int p;
    int l;
    
    
    
    
   
    @Override
    public double volume() {
        double volume = p * l * t;
        System.out.println(" Volume Balok = " + volume);
        return volume;
    }
    
    @Override
    public double luasperm(){
        double luasperm = 2*(p*l + p*t + l*t);
        System.out.println(" Luas Permukaan Balok = " + luasperm);
        return luasperm;
    }
  
}
