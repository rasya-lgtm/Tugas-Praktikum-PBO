
package pertemuan2;

public class Pertemuan2 {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Nilai awal a = " + a);

        // Pre-increment: ++a (naik dulu, lalu digunakan)
        int b = ++a;
        System.out.println("Setelah pre-increment (++a):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Post-increment: a++ (digunakan dulu, baru naik)
        int c = a++;
        System.out.println("\nSetelah post-increment (a++):");
        System.out.println("a = " + a);
        System.out.println("c = " + c);
    }
    
}
