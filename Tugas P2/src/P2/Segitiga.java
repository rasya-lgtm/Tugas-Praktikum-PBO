/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author asusS
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        double hasil = 0.5 * b * a;
        
        System.out.println("Hasil Luas Segitigs t=6 a=8 = " + hasil);
        Phytagoras x = new Phytagoras ();
        x.hitung(a, b);
        
    }
    }
    class Phytagoras{
    void hitung (int a , int b){
    double BMiring = Math.sqrt ((a*a) + (b*b)); 
    double keliling = a+b+BMiring;
    
        System.out.println("Nilai c = " + BMiring);
        System.out.println("Nilai Keliling Segitiga = " + keliling);
    }}

