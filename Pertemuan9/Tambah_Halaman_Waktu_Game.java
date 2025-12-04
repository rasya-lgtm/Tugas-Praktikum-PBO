package Pertemuan9;

class Produk2 {
    String judul, penulis;

    Produk2(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    String getInfoProduk() {
        return "Judul: " + judul + "\nPenulis: " + penulis;
    }
}

class Komik2 extends Produk2 {
    int jumlahHalaman;

    Komik2(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    String getInfoProduk() {
        return super.getInfoProduk() + "\nJumlah Halaman: " + jumlahHalaman;
    }
}

class Games2 extends Produk2 {
    int waktuMain;

    Games2(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    String getInfoProduk() {
        return super.getInfoProduk() + "\nWaktu Main: " + waktuMain + " jam";
    }
}

public class Tambah_Halaman_Waktu_Game {
    public static void main(String[] args) {
        Komik2 komik = new Komik2("One Piece", "Eichiro Oda", 200);
        Games2 game = new Games2("PUBG", "Tencent", 5);

        System.out.println("=== KOMIK ===");
        System.out.println(komik.getInfoProduk());

        System.out.println("\n=== GAME ===");
        System.out.println(game.getInfoProduk());
    }
    
}

// HASIL DARI AI

