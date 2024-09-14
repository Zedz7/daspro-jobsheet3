
import java.util.Scanner;   //Untuk mengimpor kelas scanner dari package java.util

public class Tagihanlistrik06 {     //Deklarasi dari kelas dalam bahasan pemrograman java
    public static void main(String[] args) {     //Main method yang menjadi awal eksekusi dari setiap program 
        Scanner input = new Scanner(System.in);  //Untuk membuat objek Scanner yang digunakan untuk melakukan input dari user

        System.out.println("Masukkan penggunaan listrik dalam kWh: ");  //Untuk menampilkan teks
        int penggunaanListrik = input.nextInt();    //Untuk mendifinisikan variabel penggunaanListrik sebagai int dan memberikan input kepada user
        int tarifListrik = 1500;    //Untuk mendefinisikan variabel  tarifListrik sebagagai int dan memberikan input kepada user
        int totalTagihan = penggunaanListrik * tarifListrik;    //Untuk mendefinisikan variabel totalTagihan sebagai int dan memberikan input kepada user
        boolean melebihi500kWh = penggunaanListrik > 500;   //Untuk mendefinisikan variabel melebihi500kWh sebagai boolean 
        
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);    //Untuk menampilkan teks dan menggabungkan dengan variabel totalTagihan
        System.out.println("Penggunaan listrik melebihi 500 kWh: " + melebihi500kWh);   //Untuk menampilkan teks dan menggabungkan dengan variabel melebihi500kWh
        
    }
}
