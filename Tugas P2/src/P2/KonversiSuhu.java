/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author asusS
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;

        double cToF = (C * 9 / 5) + 32;
        double fToC = (F - 32) * 5 / 9;

        double cToR = C * 4 / 5;
        double rToC = R * 5 / 4;

        double fToR = (F - 32) * 4 / 9;
        double rToF = (R * 9 / 4) + 32;

        System.out.println("=== Konversi Suhu ===");
        System.out.println("Celcius ke Fahrenheit : " + cToF);
        System.out.println("Fahrenheit ke Celcius : " + fToC);

        System.out.println("\nCelcius ke Reamur    : " + cToR);
        System.out.println("Reamur ke Celcius    : " + rToC);

        System.out.println("\nFahrenheit ke Reamur : " + fToR);
        System.out.println("Reamur ke Fahrenheit : " + rToF);
    }
    
}
