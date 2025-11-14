package Pertemuan6;

import java.util.Scanner;

public class No_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //a. Masukan Jumlah Elemen
        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        // b. Masukan elemen Array
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + " : ");
            arr[i] = in.nextInt();
        }

        // c. Nilai terbesar & terkecil
        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) { max = arr[i]; idxMax = i; }
            if (arr[i] < min) { min = arr[i]; idxMin = i; }
        }

        System.out.println("Nilai terbesar = " + max + " pada indeks " + idxMax);
        System.out.println("Nilai terkecil = " + min + " pada indeks " + idxMin);

        // d. Jumlah dan rata-rata Array
        int total = 0;
        for (int x : arr) total += x;
        double rata = (double) total / n;
        System.out.println("Jumlah = " + total);
        System.out.println("Rata-rata = " + rata);

        // e. Jumlah indeks ganjil
        int sumGanjil = 0;
        for (int i = 1; i < n; i += 2) sumGanjil += arr[i];
        System.out.println("Jumlah elemen berindeks ganjil = " + sumGanjil);

        // f. Jumlah indeks genap
        int sumGenap = 0;
        for (int i = 0; i < n; i += 2) sumGenap += arr[i];
        System.out.println("Jumlah elemen berindeks genap = " + sumGenap);

        // g. Cek ganjil/genap
        System.out.println("Hasil penjumlahan ganjil = " + (sumGanjil % 2 == 0 ? "Genap" : "Ganjil"));
        System.out.println("Hasil penjumlahan genap = " + (sumGenap % 2 == 0 ? "Genap" : "Ganjil"));
    }
    
}
