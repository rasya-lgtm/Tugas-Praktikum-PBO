package tugas_praktikum3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class DISandDOS {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);
        
        System.out.println("Nama: ");
        String nama = in.readLine();
        
        System.out.println("Total Belanja : ");
        double tB = Double.parseDouble(in.readLine());
        
        System.out.println("Diskon (%): ");
        double diskon = Double.parseDouble(in.readLine());
       
        double total = tB - (tB * diskon / 100);
        
        System.out.print("Bayar: ");
        double bayar = Double.parseDouble(in.readLine());

        double kembalian = bayar - total;
        
        System.out.println("\n=== STRUK PEMBAYARAN ===");
            System.out.println("Nama\t\t: " + nama);
            System.out.println("Total Belanja\t: " + tB);
            System.out.println("Diskon (%)\t: " + diskon);
            System.out.println("Total\t\t: " + total);
            System.out.println("Bayar\t\t: " + bayar);
            System.out.println("Kembalian\t: " + kembalian);
        
    }
    
}
