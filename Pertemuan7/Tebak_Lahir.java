package Pertemuan7;

import java.util.Scanner;

public class Tebak_Lahir {
    static int hitung(int bulan, int tanggal) {
        return (bulan * 100) + tanggal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Bulan lahir (1-12): ");
        int b = in.nextInt();
        System.out.print("Tanggal lahir: ");
        int t = in.nextInt();

        System.out.println("Hasil tebak: " + hitung(b, t));
    }
}
