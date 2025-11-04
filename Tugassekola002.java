/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugassekola002;

import java.util.Scanner;
public class Tugassekola002 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        
          double volumetabung, jarijariTB, tinggiTB;
        double PHI = 22/7;
        System.out.println("Masukkan jari jari tabung  :");
        jarijariTB = inputan.nextDouble ();
        System.out.println("masukkan tinggi tabung  :");
        tinggiTB = inputan.nextDouble ();
        volumetabung = PHI*jarijariTB*jarijariTB*tinggiTB;
        System.out.println("hasilnya adalah : " + volumetabung);
       
    }
    
}
