package Pertemuan4;

import java.util.Scanner;

public class Kabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        if ((tahun % 4 == 0))
            System.out.println(tahun + " adalah tahun kabisat");
        else
            System.out.println(tahun + " bukan tahun kabisat");
    }
    
}
