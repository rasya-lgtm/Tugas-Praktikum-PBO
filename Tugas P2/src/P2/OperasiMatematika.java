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
public class OperasiMatematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator ();
        k.hitung(22, 33);
    }    
}

class Kalkulator {
 int angka1, angka2;
 
 void hitung(int angka1, int angka2){
         int jumlah = angka1 + angka2;
         int kurang = angka1 - angka2;
         int kali = angka1 * angka2;
         int bagi = angka1 / angka2;
         
         System.out.println("22 + 33 = " + jumlah);
         System.out.println("22 - 33 = " + kurang);
         System.out.println("22 x 33 = " + kali);
         System.out.println("22 : 33 = " + bagi);
    }
    
}
