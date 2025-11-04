/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal5;

/**
 *
 * @author IDEAPAD
 */
import java.util.Scanner;
public class Soal5 {

    public static void main(String[] args) {
        System.out.println("Rekapitulasi nilai ujian");
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah siswa: ");
        int siswa = masukan.nextInt();
        
        double totalNilai = 0;
        
        for(int i=1; i<=siswa; i++){
            System.out.println("Masukkan nilai siswa ke-"+i+ ":");
            double nilai = masukan.nextDouble();
            totalNilai += nilai;
        }
        
        double rataRata = totalNilai/siswa;
        System.out.println("Rata-rata nilai seluruh siswa adalah: " +rataRata);
        
    }
}
