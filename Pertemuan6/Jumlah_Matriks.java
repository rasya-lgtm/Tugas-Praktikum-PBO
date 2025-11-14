package Pertemuan6;

import java.util.Scanner;

public class Jumlah_Matriks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int r = in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int c = in.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] C = new int[r][c];

        System.out.println("Input Matriks A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = in.nextInt();

        System.out.println("Input Matriks B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = in.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                C[i][j] = A[i][j] + B[i][j];
    }
}
