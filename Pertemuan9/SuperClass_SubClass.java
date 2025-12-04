package Pertemuan9;

class Hewan {
    void jenisHewan() {
        System.out.println("Macam-macam hewan:");
        System.out.println("- hewan berkaki dua");
        System.out.println("- hewan berkaki enam");
        System.out.println("- hewan berkaki empat");
        System.out.println("- hewan berkaki delapan");
        System.out.println();
        System.out.println("Contoh hewan:");
    }
}

class HewanBerkakiDua extends Hewan {
    void tampil() {
        System.out.println("- hewan berkaki dua: kangguru, ayam, bebek, dll");
    }
}

class HewanBerkakiEnam extends Hewan {
    void tampil() {
        System.out.println("- hewan berkaki enam: capung, nyamuk, kupu-kupu, dll");
    }
}

class HewanBerkakiEmpat extends Hewan {
    void tampil() {
        System.out.println("- hewan berkaki empat: kucing, anjing, kuda, dll");
    }
}

class HewanBerkakiDelapan extends Hewan {
    void tampil() {
        System.out.println("- hewan berkaki delapan: kepiting, belalang, laba-laba, dll");
    }
}

public class SuperClass_SubClass {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        h.jenisHewan();

        new HewanBerkakiDua().tampil();
        new HewanBerkakiEnam().tampil();
        new HewanBerkakiEmpat().tampil();
        new HewanBerkakiDelapan().tampil();
    }
    
}
