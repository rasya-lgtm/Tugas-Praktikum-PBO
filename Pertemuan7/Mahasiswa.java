package Pertemuan7;

import java.util.Scanner;

class Data_Mahasiswa {
    String nama, npm, kelas;

    Data_Mahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampil() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nama  : ");
        String nama = in.nextLine();
        System.out.print("NPM   : ");
        String npm = in.nextLine();
        System.out.print("Kelas : ");
        String kelas = in.nextLine();

        Data_Mahasiswa d = new Data_Mahasiswa(nama, npm, kelas);
        d.tampil();
    }
    
}
