package Pertemuan7;

import java.util.Scanner;

public class K_Persegi_Panjang {
    static int keliling(int p, int l){ //Keliling = 2 * (Panjang + Lebar)  
        return 2 * (p + l);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Panjang: ");
        int p = in.nextInt();
        System.out.print("Lebar: ");
        int l = in.nextInt();

        System.out.println("Keliling = " + keliling(p, l));
    }
}
