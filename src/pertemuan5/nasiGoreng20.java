package pertemuan5;
import java.util.Scanner;

public class nasiGoreng20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaNasiGoreng, hargaMieRebus, hargaFuyunghai;
        int jumlahNasiGoreng, jumlahMieRebus, jumlahFuyunghai;
        double totalBelanja, totalSetelahDiskon = 0;
        double diskon = 0;

        System.out.println("=== Menu Makanan ===");
        System.out.print("Harga Nasi Goreng: ");
        hargaNasiGoreng = sc.nextInt();
        System.out.print("Jumlah Nasi Goreng yang dibeli: ");
        jumlahNasiGoreng = sc.nextInt();
        
        System.out.print("Harga Mie Rebus: ");
        hargaMieRebus = sc.nextInt();
        System.out.print("Jumlah Mie Rebus yang dibeli: ");
        jumlahMieRebus = sc.nextInt();
        
        System.out.print("Harga Fuyunghai: ");
        hargaFuyunghai = sc.nextInt();
        System.out.print("Jumlah Fuyunghai yang dibeli: ");
        jumlahFuyunghai = sc.nextInt();
        
        totalBelanja = (hargaNasiGoreng * jumlahNasiGoreng) + (hargaMieRebus * jumlahMieRebus) + (hargaFuyunghai * jumlahFuyunghai);
        
        System.out.println("Total belanja sebelum diskon: Rp" + totalBelanja);
        
        if (totalBelanja >= 100_000) {
            if (totalBelanja > 500_000) {
                diskon = 0.10;
                    System.out.println("Diskon yang didapatkan: 10%");
            } else if (totalBelanja > 200_000) {
                diskon = 0.05;
                    System.out.println("Diskon yang didapatkan: 5%");
            } else {
                diskon = 0.02;
                    System.out.println("Diskon yang didapatkan: 2%");
            }

            //diskon
            totalSetelahDiskon = totalBelanja - (totalBelanja * diskon);
        } else {
            System.out.println("Tidak ada diskon yang diberikan.");
                totalSetelahDiskon = totalBelanja;
        }
        
        System.out.println("Total belanja setelah diskon: Rp" + totalSetelahDiskon);

    }
}
