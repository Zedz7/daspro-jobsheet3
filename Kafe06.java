import java.util.Scanner;   //Untuk mengimpor kelas scanner dari package java.util
public class Kafe06  {  //Deklarasi dari kelas dalam bahasan pemrograman java
    public static void main(String[] args) {    //Main method yang menjadi awal eksekusi dari setiap program 
        Scanner input = new Scanner(System.in); //Untuk membuat objek Scanner yang digunakan untuk melakukan input dari user

        boolean keanggotaan;    //Untuk mendefinisikan variabel keanggotaan dengan tipe data boolean 
        int jmlKopi, jmlTeh, jmlRoti;   //Untuk Untuk mendefinisikan variabel jmlKopi, jmlTeh, jmlRoti dengan tipe data int
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0; //Untuk mendefinisikan dan menentukan variabel hargaKopi, hargaTeh, hargaRoti dengan tipe data double
        float diskon = 10 / 100f;   //Untuk mendefinisikan dan menentukan variabel diskon = 10/100f dengan tipe data float
        double totalHarga, nominalBayar;    //Untuk mendefinisikan variabel totalHarga, nominalBayar

        System.out.println("Masukkan keanggotaan (true/false): ");  //Untuk menampilkan teks yang meminta user memasukkan nilai true/false
        keanggotaan = input.nextBoolean();  //Untuk membaca input dari user dan menyimpannya sebagai nilai boolean 
        System.out.println("Masukkan jumlah pembelian kopi: "); //Untuk menampilkan teks yang meminta user memasukkan jumlah pembelian kopi
        jmlKopi = input.nextInt();  //Untuk meembaca input dari user dan menyimpannyna sebagai nilai int
        System.out.println("Masukkan jumlah pembelian teh: ");  //Untuk menampilkan teks yang meminta user memasukkan jumlah pembelian teh 
        jmlTeh = input.nextInt();   //Untuk membaca input dari user dan menyimpannya dalam nilai int
        System.out.println("Masukkan jumlah pembelian roti: "); //Untuk menampilkan teks yang meminta user memasukkan jumlah pembelian roti
        jmlRoti = input.nextInt();  //Untuk membaca input dan menyimpannya dalam nilai int

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);//Untuk memproses perhitungan dari variabel totalHarga
        byte totalByte = (byte) totalHarga; //Untuk casting nilai dari double ke byte


        nominalBayar = totalHarga - (diskon * totalHarga);  //Untuk memproses perhitungan dari variabel nominalBayar 
        int nominalInt = (int) nominalBayar;    //Untuk casting nilai dari double ke int


        System.out.println("Keanggotaan pelanggan " + keanggotaan); //Untuk menampilkan teks dan menggabungkan dengan variabel keanggotaan 
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");    //Untuk menampilkan teks dengan variabel jmlKopi, jmlTeh, jmlRoti
        System.out.println("Nominal bayar (double) Rp " + nominalBayar);    //Untuk menampilkan teks dan menggabungkan dengan variabel nominalBayar
        System.out.println("Nominal bayar (int setelah casting) Rp " + nominalInt); //Untuk menampilkan teks dan menggabungkan dengan variabel nominalInt
        System.out.println("Total harga (double) Rp " + totalHarga);    //Untuk menampilkan tesk dan menggabungkan dengan variabel totalHarga
        System.out.println("Total harga (byte setelah casting) Rp " + totalByte);   //Untuk menampilkan teks dan menggabungkan dengan variabel totalByte

    }
}