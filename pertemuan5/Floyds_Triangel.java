package Pertemuan5;

import java.util.Scanner;

public class Floyds_Triangel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak baris: ");
        int a = input.nextInt();

        int b = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
    }
}