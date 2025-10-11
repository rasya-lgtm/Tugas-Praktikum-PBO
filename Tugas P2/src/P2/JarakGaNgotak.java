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
public class JarakGaNgotak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double jarakBumiKeBulan = 384400;
        double jarakBumiKeMatahari = 152.1e6;
        double kecepatanCahaya = 300000;
        
        double waktuKeBulan = jarakBumiKeBulan / kecepatanCahaya;
        double waktuKeMatahari = jarakBumiKeMatahari / kecepatanCahaya;

        
        System.out.println("=== Waktu Tempuh Cahaya ===");
        System.out.println("Dari Bumi ke Bulan: " + waktuKeBulan + " detik");
        System.out.println("Dari Bumi ke Matahari: " + waktuKeMatahari + " detik");
    }
    
}
