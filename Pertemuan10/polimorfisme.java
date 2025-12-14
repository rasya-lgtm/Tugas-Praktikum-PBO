package Pertemuan10;

abstract class Bentuk{
    public abstract double luas();
}

class PersegiPanjang extends Bentuk{
    private double p, l;
    
    public PersegiPanjang(double p, double l){
        this.p = p;
        this.l = l;
    }
    
    public double luas(){
        return p * l;
    }
}

class BujurSangkar extends Bentuk{
    private double sisi;
    
    public BujurSangkar(double sisi){
        this.sisi = sisi;
    }
    
    public double luas(){
        return sisi * sisi;
    }
}

class Segitiga extends Bentuk{
    private double a, t;
    
    public Segitiga(double a, double t){
        this.a = a;
        this.t = t;
    }
    
    public double luas(){
        return 0.5*a*t;
    }
}

class Lingkaran extends Bentuk {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public double luas() {
        return 3.14 * r * r;
    }
}


public class polimorfisme {
    public static void main(String[] args) {
        Bentuk b1 = new PersegiPanjang(5, 3);
        Bentuk b2 = new BujurSangkar(4);
        Bentuk b3 = new Segitiga(6, 4);
        Bentuk b4 = new Lingkaran(3);

        System.out.println("Luas Persegi Panjang: " + b1.luas());
        System.out.println("Luas Bujur Sangkar: " + b2.luas());
        System.out.println("Luas Segitiga: " + b3.luas());
        System.out.println("Luas Lingkaran: " + b4.luas());

    }
}
