package Pertemuan4;

import java.util.Scanner;

public class Komisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan total penjualan: ");
        double jual = input.nextDouble();
        double jasa = 0, komsi = 0;

        if (jual <= 2000000) {
            jasa = 100000;
            komsi = 0.1 * jual;
        } else if (jual <= 5000000) {
            jasa = 200000;
            komsi = 0.15 * jual;
        } else {
            jasa = 300000;
            komsi = 0.2 * jual;
        }

        double total = jasa + komsi;
        System.out.println("Total pendapatan salesman: Rp" + total);
    }
    
}
