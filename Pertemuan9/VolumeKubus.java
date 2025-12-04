package Pertemuan9;

class Kubus {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
}

public class VolumeKubus {
    public static void main(String[] args) {
        Kubus k = new Kubus(5);
        System.out.println("Volume kubus = " + k.hitungVolume());
    }
    
}
