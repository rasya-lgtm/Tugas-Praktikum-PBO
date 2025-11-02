package Pertemuan5;

import java.util.Scanner;

public class Rata_Rasta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int a = input.nextInt();
        int total = 0;

        for (int i = 1; i <= a; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            total += input.nextInt();
        }

        double rata = (double) total / a;
        System.out.println("Total jumlah bilangan : " + total);
        System.out.println("Rata-rata : " + rata);  
    }
    
}
