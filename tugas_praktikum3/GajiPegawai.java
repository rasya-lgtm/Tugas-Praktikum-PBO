package tugas_praktikum3;


import java.util.Scanner;

public class GajiPegawai {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       String nik , nama , alamat , jabatan ;
       int p1 , p2 , p3 , p4;
       int total , pajak , gaji;
       
        System.out.println("Nomor Induk Karyawan : ");
        nik = input.nextLine();
        
        System.out.println("Nama Karyawan : ");
        nama = input.nextLine();
        
        System.out.println("Alamat : ");
        alamat= input.nextLine();
        
        System.out.println("Jabatan : ");
        jabatan = input.nextLine();
        
        System.out.println("Gaji Pokok : ");
        p1 = input.nextInt();
        
        System.out.println("Tunjangan Jabatan : ");
        p2 = input.nextInt();
        
        System.out.println("Tunjangan Istri : ");
        p3 = input.nextInt();
        
        System.out.println("Tunjangan Anak : ");
        p4 = input.nextInt();
        
        System.out.println("\nNomor Induk Karyawan\t: " + nik);      
        System.out.println("Nama Karyawan\t\t: " + nama);       
        System.out.println("Alamat \t\t\t: " + alamat);        
        System.out.println("Jabatan \t\t: " + jabatan);
        System.out.println("Gaji Pokok \t\t: " + p1);
        System.out.println("Tunjangan Jabatan\t: " + p2);
        System.out.println("Tunjangan Istri\t\t: " + p3);
        System.out.println("Tunjangan Anak\t\t: " + p4);
        
        total = p1 + p2 + p3 + p4;
        System.out.println("Total Gaji\t\t: " + total);
       
        pajak = (p1 + p2 + p4)/10;
        System.out.println("Pajak Penghasilan\t: " + pajak);
        
        gaji = total - pajak;
        System.out.println("Gaji Bersih\t\t: " + gaji);
    }
    
}