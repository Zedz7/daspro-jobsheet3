
import java.util.Scanner;

public class Tagihanlistrik06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan penggunaan listrik dalam kWh: ");
        int penggunaanListrik = input.nextInt();
        int tarifListrik = 1500;
        int totalTagihan = penggunaanListrik * tarifListrik;
        boolean melebihi500kWh = penggunaanListrik > 500;
        
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Penggunaan listrik melebihi 500 kWh: " + melebihi500kWh);
        
    }
}
