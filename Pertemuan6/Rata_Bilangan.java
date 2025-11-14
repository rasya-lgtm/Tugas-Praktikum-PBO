package Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rata_Bilangan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Jumlah data: ");
            int a = in.nextInt();
            double[] arr = new double[a];

            for (int i = 0; i < a; i++) {
                System.out.print("Data " + i + ": ");
                arr[i] = in.nextDouble();
            }

            double total = 0;
            for (double x : arr) total += x;

            System.out.println("Rata-rata = " + total / a);

        } catch (InputMismatchException) {
            System.out.println("Error: Input harus angka!");
        }
    }
}
