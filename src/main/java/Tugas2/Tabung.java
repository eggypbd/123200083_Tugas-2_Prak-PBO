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
public class Tabung implements MenghitungRuang{
    
    private  float r;
    private float t;
    
    

    @Override
    public double volume() {
       double volume = Math.PI * r * r * t;
       System.out.println(" Volume Tabung = " + volume);
       return volume;
    }

    @Override
    public double luasperm() {
        double luasperm;
        luasperm = 2 * Math.PI * r *(t + r);
        System.out.println(" Luas Permukaan Tabung = " + luasperm);
        return luasperm;
    }

   
    
    
    
}
