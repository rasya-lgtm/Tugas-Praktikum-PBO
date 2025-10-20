package tugas_praktikum3;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.io.IOException;

public class Buah {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah buah mangga yang dibeli: ");
        int mangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah tetangga yang diberi jambu: ");
        int tetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah jambu per tetangga: ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah mangga yang busuk: ");
        int manggaBusuk = Integer.parseInt(br.readLine());

        int totalJambu = tetangga * jambuPerTetangga;
        int totalBuah = mangga + totalJambu - manggaBusuk;

        System.out.println("Total buah yang dibeli Ibu Sisca = " + totalBuah + " pcs");
    }
}
    

