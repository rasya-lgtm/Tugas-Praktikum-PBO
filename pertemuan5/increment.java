package Pertemuan5;
public class increment {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Menggunakan i++:");
        while (i < 5) {
            System.out.println(i++);
        }

        System.out.println("\nMenggunakan ++i:");
        i = 0;
        while (i < 5) {
            System.out.println(++i);
        }
    }
    
}
