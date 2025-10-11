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
public class LowUpString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        
        String hasilA = a.toLowerCase();
        String hasilB = b.toUpperCase();
        
        System.out.println("\"Saya Belajar Java\" menjadi " + hasilA );
        System.out.println("\"Saya Belajar Java\" menjadi " + hasilB );
    }
    
}
