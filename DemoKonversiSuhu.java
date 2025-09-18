/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KonversiSuhu;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KonversiSuhu2 konversi = new KonversiSuhu2();

        System.out.print("Masukkan suhu dalam Celcius: ");
        int celcius = input.nextInt();

        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        int fahrenheit = input.nextInt();

        System.out.println("\n=== HASIL KONVERSI ===");
        System.out.println(celcius + " derajat C = " + konversi.celciusToFahrenheit(celcius) + " derajat F");
        System.out.println(celcius + " derajat C = " + konversi.celciusToReamur(celcius) + " derahat R");
        System.out.println(fahrenheit + " derajat F = " + konversi.fahrenheitToReamur(fahrenheit) + " derajat R");
 
    }
    
}
