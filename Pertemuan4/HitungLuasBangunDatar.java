package Pertemuan4;

import java.util.Scanner;

public class HitungLuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu Luas Bangun Datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Pilih (1-5): ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                System.out.println("Luas persegi: " + (s * s));
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                System.out.println("Luas segitiga: " + (0.5 * a * t));
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                System.out.println("Luas lingkaran: " + (3.14 * r * r));
                break;
            case 4:
                System.out.print("Masukkan sisi atas: ");
                double atas = input.nextDouble();
                System.out.print("Masukkan sisi bawah: ");
                double bawah = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                System.out.println("Luas trapesium: " + (0.5 * (atas + bawah) * tinggi));
                break;
            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.println("Luas layang-layang: " + (0.5 * d1 * d2));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
    }
    
}
