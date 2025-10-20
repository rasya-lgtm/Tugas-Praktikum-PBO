package tugas_praktikum3;

import java.util.Scanner;

public class WaktuCetakNovel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah novel yang akan dicetak: ");
        int jumlahNovel = input.nextInt();

        System.out.print("Masukkan tebal (jumlah lembar) tiap novel: ");
        int lembarPerNovel = input.nextInt();

        int totalLembar = jumlahNovel * lembarPerNovel;
        int totalDetik = totalLembar; // karena 1 lembar dicetak dalam 1 detik

        // Konversi waktu
        int hari = totalDetik / 86400;
        totalDetik %= 86400;

        int jam = totalDetik / 3600;
        totalDetik %= 3600;

        int menit = totalDetik / 60;
        int detik = totalDetik % 60;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total lembar dicetak : " + totalLembar + " lembar");
        System.out.println("Waktu yang diperlukan : " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");

    }
    
}
