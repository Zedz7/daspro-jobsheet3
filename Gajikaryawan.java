
import java.util.Scanner;    //Untuk mengimpor kelas scanner dari package java.util

public class Gajikaryawan { //Deklarasi dari kelas dalam bahasan pemrograman java
    public static void main(String[] args) {    //Main method yang menjadi awal eksekusi dari setiap program 
        Scanner input = new Scanner(System.in); //Untuk membuat objek Scanner yang digunakan untuk melakukan input dari user
        
        System.out.println("Masukkan jumlah jam kerja: ");  //Untuk menampilkan teks
        int jamKerja = input.nextInt(); //Untuk mendefinisikan variabel jamKerja memberikan input kepada user dan membacanya sebagai int
        
        System.out.println("Masukkan upah per jam: Rp ");   //Untuk menampilkan teks
        double upahPerjam = input.nextDouble(); //Untuk mendefinisikan variabel upahPerjam dan memberikan input kepada user dan membacaya sebagai double

        double gajiKotor = jamKerja * upahPerjam;   //Untuk mendefinisikan variabel gajiKotor sebagai double dan memproses perhitungan gajiKotor
        double bonus = 0.10 * gajiKotor;    //Untuk mendefinisikan variabel bonus sebagai double dan memproses perhitungan bonus
        double totalGajisebelumpajak = gajiKotor + bonus;   //Untuk mendefinisikan variabel totalGajisebelumpajak sebagai double dan memproses perhitungan gajiSebelumpajak
        double pajak = 0.05 * totalGajisebelumpajak;    //Untuk mendefinisikan variabel pajak sebagai double dan memproses perhitungan pajak
        double gajiBersih = totalGajisebelumpajak - pajak;  //Untuk mendefinisikan variabel gajiBersih dan memproses perhitungan gajiBersih

        System.out.println("\nGaji kotor: Rp " + gajiKotor);    //Untuk menampilkan teks
        System.out.println("Bonus: Rp " + bonus);   //Untuk menampilkan teks dan menggabungkan dengan variabel bonus
        System.out.println("Pajak: Rp " + pajak);   //Untuk menampilkan teks dan menggabungkan dengan variabel pajak
        System.out.println("Gaji bersih: Rp " + gajiBersih);    //Untuk menampilkan teks dan menggabungkan dengan variabel gajiBersih
    }
}
