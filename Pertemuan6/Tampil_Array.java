package Pertemuan6;
public class Tampil_Array {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 2, 6};

    // Cara 1: For biasa
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }

    // Cara 2: For-each
    for (int a : arr) {
        System.out.println(a);
    }

    }
}
    