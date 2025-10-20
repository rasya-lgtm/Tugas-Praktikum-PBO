package tugas_praktikum3;

import java.util.Scanner;

public class Novel {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah halaman novel: ");
        int halaman = input.nextInt();

        int totalDetik = halaman; // karena 1 lembar = 1 detik
        int hari = totalDetik / 86400;
        totalDetik %= 86400;

        int jam = totalDetik / 3600;
        totalDetik %= 3600;

        int menit = totalDetik / 60;
        int detik = totalDetik % 60;

        System.out.println("Waktu yang diperlukan: " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");

    }
    
}
