package Pertemuan7;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hargaTIket = 50000, totalTiket = 0;
    double totalHarga = 0.0, harga, diskon = 0.0, setelahDiskon;
    int jumlahTiket;

    do {
        System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
        jumlahTiket = sc.nextInt();
        if (jumlahTiket == 0) {
            break;
        }
        if (jumlahTiket < 0) {
            System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah yang valid.");
            continue;
        }

            harga = jumlahTiket * hargaTIket;
            if (jumlahTiket > 10) {
                diskon = harga * 0.15;
            } else if (jumlahTiket > 4) {
                diskon = harga * 0.10;
        }

        setelahDiskon = harga - diskon;
        totalTiket += jumlahTiket;
        totalHarga += harga;

        System.out.println("Total harga " + jumlahTiket + " tiket: Rp " + harga);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Total harga setelah diskon: Rp " + setelahDiskon);

    } while (true);

    System.out.println("Total tiket terjual: " + totalTiket);
    System.out.println("Total penjualan tiket: Rp " + totalHarga);
}
}