package Pertemuan5;

import java.util.Scanner;

public class Banyak_Ganjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka: ");
        int a = input.nextInt();
        int total = 0;

        int angka = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(angka + " ");
            total += angka;
            angka += 2;
        }

        System.out.println("\nTotal penjumlahan = " + total);
    }
    
}
