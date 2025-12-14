package Pertemuan10;

class Produk {
    String judul, penulis;

    Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    String getInfoProduk() {
        return "Judul: " + judul + "\nPenulis: " + penulis;
    }
}

class Komik extends Produk {
    Komik(String judul, String penulis) {
        super(judul, penulis);
    }
}

class Games extends Produk {
    Games(String judul, String penulis) {
        super(judul, penulis);
    }
}

public class Main2 {
    
}
