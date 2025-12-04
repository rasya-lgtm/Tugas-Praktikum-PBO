package Pertemuan9;

class Segitiga {
    protected double hitungLuas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
}

public class LuasSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Luas segitiga = " + s.hitungLuas(10, 8));
    }
    
}
