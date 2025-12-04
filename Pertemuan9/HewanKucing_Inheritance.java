package Pertemuan9;

class Hewan_{
    String nama;
    String makanan;

    void display() {
        System.out.println("Nama hewan : " + nama);
        System.out.println("Makanan    : " + makanan);
    }
}

class Kucing extends Hewan_ {

}


public class HewanKucing_Inheritance {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.nama = "Kucing Persia";
        k.makanan = "Whiskas";
        k.display();
    }
    
}
