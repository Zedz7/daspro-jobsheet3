import java.util.Scanner;   //Untuk mengimpor kelas scanner dari package java.util
public class Siakad06 { //Deklarasi dari kelas dalam bahasan pemrograman java
    public static void main(String[] args) {     //Main method yang menjadi awal eksekusi dari setiap program
        Scanner sc = new Scanner(System.in);    //Untuk membuat objek Scanner yang digunakan untuk melakukan input dari user

        String nama, nim;   //Untuk mendefinisikan variabel nama dan nim dengan tipe data String
        char kelas; //Untuk mendefinisikan variabel kelas dengan tipe data char
        byte absen; //Untuk mendefinisikan variabel absen dengan tipe data byte
        Double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;   //Untuk mendefinisikan variabel nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir dengan tipe data double

        System.out.println("Masukkan Nama: ");  //Untuk menampilkan teks 
        nama = sc.nextLine();   //Untuk memberikan input kepada user dan membacanya menjadi nilai String
        System.out.println("Masukkan Nim: ");   //Untuk menampilkan teks
        nim = sc.nextLine();    //Untuk memberikan input kepada user dan membacanya menjadi nilai String
        System.out.println("Masukkan Kelas: "); //Untuk menampilkan teks
        kelas = sc.nextLine(). charAt(0);   //Untuk memberikan input kepada user dan membacanya menjadi nilai String dan nilai char
        System.out.println("Masukkan nomor absen: ");   //Untuk menampilkan teks
        absen = sc.nextByte();  //Untuk memberikan input kepada user dan membacanya menjadi nilai byte

        System.out.println("Masukkan nilai kuis: ");    //Untuk menampilkan teks
        nilaiKuis = sc.nextDouble();    //Untuk memberikan input kepada user dan membacanya menjadi nilai double
        System.out.println("Masukkan nilai tugas: ");   //Untuk menampilkan teks
        nilaiTugas = sc.nextDouble();   //Untuk memberikan input kepada user dan membacanya menjadi nilai double
        System.out.println("Masukkan nilai uts: ");     //Untuk menampilkan teks
        nilaiUTS = sc.nextDouble();     //Untuk memberikan input kepada user dan membacanya menjadi nilai double
        System.out.println("Masukkan nilai uas: ");     //Untuk menampilkan teks
        nilaiUAS = sc.nextDouble();     //Untuk memberikan input kepada user dan membacanya menjadi nilai double

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);  //Untuk memproses perhitungan dari variabel nilaiAkhir

        System.out.println("Nama: " + nama + "NIM: " + nim);         //Untuk meanmpilkan teks dan menggabungkan dengan variabel nama, nim
        System.out.println("Kelas: " + kelas + "Absen: " + absen);   //Untuk meanmpilkan teks dan menggabungkan dengan variabel kelas, absen
        System.out.println("Nilai Akhir: " + nilaiAkhir);            //Untuk meanmpilkan teks dan menggabungkan dengan variabel nilaiAkhir

        System.out.println("Mahasiswa dengan nama " + nama  + " (NIM " + nim + ") " + "kelas " + kelas  + " nomor absen " +
        absen + "\nNilai Akhir: " + nilaiAkhir);    //Untuk menampilkan teks dan menggabungkan dengan variabel nama, nim, kelas, absen, nilaiAkhir
        }
}