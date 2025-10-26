package Pertemuan4;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bilangan : ");
        int a = input.nextInt();
        
        if (a % 2 == 0)
            System.out.println(a + " adalah bilangan genap");
        else
            System.out.println(a + " adalah bilangan ganjil");
    }
    
}
