package Pertemuan7;

class Mobil {
    String merk;
    int tahun;

    void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}

public class Class_Object {
    public static void main(String[] args) {
        Mobil m1 = new Mobil(); // membuat objek
        m1.merk = "BYD";
        m1.tahun = 2024;
        m1.info();
    }
}
    

