package Pertemuan4;

import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kode Hari (1-7): ");
        int a = input.nextInt();
        String hari = null;
        
        switch (a){
            case 1: hari = "Senin"; break;
            case 2: hari = "Selasa"; break;
            case 3: hari = "Rabu"; break;
            case 4: hari = "Kamis"; break;
            case 5: hari = "Jumat"; break;
            case 6: hari = "Sabtu"; break;
            case 7: hari = "Minggu"; break;
        }
        
        System.out.println("Hari ini adalah hari " + hari);
    }
    
}
