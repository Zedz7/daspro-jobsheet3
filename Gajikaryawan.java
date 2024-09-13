
import java.util.Scanner;

public class Gajikaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah jam kerja: ");
        int jamKerja = input.nextInt();
        
        System.out.println("Masukkan upah per jam: Rp ");
        double upahPerjam = input.nextDouble();

        double gajiKotor = jamKerja * upahPerjam;
        double bonus = 0.10 * gajiKotor;
        double totalGajisebelumpajak = gajiKotor + bonus;
        double pajak = 0.05 * totalGajisebelumpajak;
        double gajiBersih = totalGajisebelumpajak - pajak;

        System.out.println("\nGaji kotor: Rp " + gajiKotor);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Gaji bersih: Rp " + gajiBersih);
    }
}
