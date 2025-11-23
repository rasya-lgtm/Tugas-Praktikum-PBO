package Pertemuan7;

import java.util.Scanner;

public class Rekursif {
    static int faktorial(int n) {
        if (n == 1) return 1;
        return n * faktorial(n - 1); // memanggil dirinya sendiri
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan angka : ");
        int n = input.nextInt();
        
        System.out.println("Faktorial " + n + " Adalah " + faktorial(5));
    }
    
}
