package Pertemuan5;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        int[] angka =new int [10];
        int max , min;
        
        System.out.println("Masukan 10 Bilangan: ");
        for (int i = 0; i < 10; i++){
            System.out.print("Bilangan Ke-" + (i+1) + " : ");
            angka [i] = Input.nextInt();
        }
        
        max = min = angka[0];
        for (int i = 0; i <10; i++){
            if(angka[i] > max) max = angka[i];
            if(angka[i] < min) min = angka[i];
        }
        
        System.out.println("BIlangan Terbesar = " + max);
        System.out.println("Bilangan TErkecil = " + min);
    }
    
}
