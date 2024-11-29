package Pertemuan13;

import java.util.Scanner;

public class Kafe20 {

    public static void menu(String namaPelanggan, boolean isMember) {
        System.out.println("selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
    
        System.out.println("======== MENU RESTO KAFE ========");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 28,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static double hitungTotalharga20(int pilihanMenu, int jumlahItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 28000};
        double hargaTotal = hargaItems[pilihanMenu - 1] * jumlahItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5;
            System.out.println("mendapatkan diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
            System.out.println("mendapatkan diskon 30%");
        } else if (kodePromo.equalsIgnoreCase("INVALID")) {
            System.out.println("tidak ada pengurangan total harga");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu("andi", true);
        double totalKeseluruhan = 0;
        
        while (true) {
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahItem = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Masukkan kode diskon (contoh: DISKON50 atau DISKON30): ");
        String diskon = sc.nextLine();

        double totalHarga = hitungTotalharga20(pilihanMenu, jumlahItem, "");
        System.out.println("Total harga untuk pesanan Anda sebelum diskon: Rp" + totalHarga);

        double totalDiskon = hitungTotalharga20(pilihanMenu, jumlahItem, diskon);
        totalKeseluruhan += totalDiskon;
        System.out.println("Total harga untuk pesanan Anda setelah diskon: Rp" + totalDiskon);

        System.out.print("apakah anda ingin memesan menu yang lain ya/tidak?");
        String lanjut = sc.nextLine();

        if (lanjut.equalsIgnoreCase("tidak")) {
            break;
        }
    }
        System.out.println("total keseluruhan harga : " + totalKeseluruhan);
}
    }
