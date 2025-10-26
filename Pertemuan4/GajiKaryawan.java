package Pertemuan4;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan NIK: ");
        String a = input.nextLine();
        System.out.print("Masukan Nama: ");
        String b = input.nextLine();
        System.out.print("Masukan Golongan (1-4): ");
        int c = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int anak = input.nextInt();
        
        double GP = 0;
        switch (c){
            case 1: GP = 1200000; break;
            case 2: GP = 1500000; break;
            case 3: GP = 1750000; break;
            case 4: GP = 2000000; break;
            default: System.out.println("Kode tidak valid");
        }
        
        double tP = 0.1 * GP;
        double tA = 0.05 * GP * anak;
        double gB = GP + tP + tA;
        
        System.out.println("\n--- Slip Gaji ---");
        System.out.println("NIK\t: " + a);
        System.out.println("Nama\t: " + b);
        System.out.println("Gaji Pokok\t: Rp" + GP);
        System.out.println("Gaji Bersih\t: Rp" + gB);
        
    }
    
}
