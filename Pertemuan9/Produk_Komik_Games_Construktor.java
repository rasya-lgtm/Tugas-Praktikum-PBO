package Pertemuan9;

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

public class Produk_Komik_Games_Construktor {
    public static void main(String[] args) {
        Komik komik = new Komik("Naruto", "Masashi Kishimoto");
        Games game = new Games("GTA V", "Rockstar");

        System.out.println("=== DATA KOMIK ===");
        System.out.println(komik.getInfoProduk());

        System.out.println("\n=== DATA GAME ===");
        System.out.println(game.getInfoProduk());
    }
    
}
