package Pertemuan6;
import java.util.Scanner;

public class tugasP6_2_20 {
    
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;

        System.out.print("Masukkan Jenis Buku (kamus/novel/buku lain) : ");
        jenisBuku = input20.nextLine().toLowerCase();
        System.out.print("Masukkan Jumlah Buku : ");
        jumlahBuku = input20.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                System.out.println("Diskon 12%");
            } else if (jumlahBuku <= 2 && jumlahBuku > 0) {
                System.out.println("Diskon 10%");
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                System.out.println("Diskon 9%");
            } else if (jumlahBuku <= 3 && jumlahBuku > 0) {
                System.out.println("Diskon 8%");
            }
        } else if (jenisBuku.equalsIgnoreCase("buku lain")) {
            if (jumlahBuku > 3) {
                System.out.println("Diskon 5%");
            } else if (jumlahBuku <= 3 && jumlahBuku > 0) {
                System.out.println("Diskon 0%");
            }
        } else {
            System.out.println("salah masukkan");
        }

    }
}
