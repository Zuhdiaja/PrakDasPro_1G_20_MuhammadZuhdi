package Pertemuan6;
import java.util.Scanner;

public class Pemilihan2Percobaan2_20 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        String member, jenisPembayaran;
        int pilihan_menu;
        double diskon, harga, total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input20.nextInt();
        input20.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input20.nextLine();
        System.out.print("Masukkan jenis pembayaran (QRIS / Tunai) = ");
        jenisPembayaran = input20.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga budling = " + harga);
            } else {
                System.out.println("masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);

            } else if (member.equalsIgnoreCase("n")) {
            System.out.println("Tidak mendapatkan diskon.");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga;

        } else {
            System.out.println("Input member tidak valid");
            return;
        }
        
        if (jenisPembayaran.equals("QRIS")) {
            total_bayar -= 1000;
            System.out.println(" potongan harga Rp. 1.000 memakai QRIS");

        }else if (jenisPembayaran.equalsIgnoreCase("Tunai")) {
            System.out.println("menggunakan tunai tidak ada potongan");

        } else {
            System.out.println("Pembayaran tidak valid");
        }
        System.out.println("Total bayar = " + total_bayar);


        System.out.println("------------------------------------");




    }
}
