package tugas_praktikum3;

import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan waktu pertama (jam menit detik): ");
        int jam1 = input.nextInt();
        int menit1 = input.nextInt();
        int detik1 = input.nextInt();

        System.out.print("Masukkan waktu kedua (jam menit detik): ");
        int jam2 = input.nextInt();
        int menit2 = input.nextInt();
        int detik2 = input.nextInt();

        int totalDetik1 = jam1 * 3600 + menit1 * 60 + detik1;
        int totalDetik2 = jam2 * 3600 + menit2 * 60 + detik2;

        int selisih = Math.abs(totalDetik2 - totalDetik1);

        int jam = selisih / 3600;
        selisih %= 3600;
        int menit = selisih / 60;
        int detik = selisih % 60;

        System.out.println("Selisih waktu = " + jam + " jam " + menit + " menit " + detik + " detik");

    }
    
}
