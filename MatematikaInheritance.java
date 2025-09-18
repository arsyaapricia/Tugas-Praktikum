/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Matematika;

/**
 *
 * @author User
 */

    /**
     */
public class MatematikaInheritance extends Matematika2 {   
    public static void main(String[] args) {
        MatematikaInheritance matematika = new MatematikaInheritance(); 

        System.out.println("Hasil Tambah: " + matematika.tambah(20, 2));
        System.out.println("Hasil Kurang: " + matematika.kurang(10, 5));
        System.out.println("Hasil Kali  : " + matematika.kali(15, 5));
        System.out.println("Hasil Bagi  : " + matematika.bagi(50, 5));
        System.out.println("Hasil Modulus: " + matematika.modulus(20, 5));
   }
    
}
