package Pertemuan7;

class Civitas {
    String nama, status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void tampil() {
        System.out.println(nama + " adalah " + status + " Fakultas Teknik");
    }
}

public class CivitasAkademikaFT {
    public static void main(String[] args) {
        Civitas dosen = new Civitas("Pak Sutono", "Dosen");
        Civitas mhs   = new Civitas("Rasya", "Mahasiswa");
        Civitas staff = new Civitas("Bu Siti Rukmini", "Staff");

        dosen.tampil();
        mhs.tampil();
        staff.tampil();
    }
    
}
