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

        public static int hitungTotalHarga20(int pilihanMenu, int banyaItem){
            int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    
            int hargaTotal = hargaItems[pilihanMenu - 1] * banyaItem;
            return hargaTotal;
        }
    
        public static void main(String[] args){
            menu("Andi", true);

            Scanner sc = new Scanner(System.in);
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyaItem = sc.nextInt();
        
            int totalHarga = hitungTotalHarga20(pilihanMenu, banyaItem);

            System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        }

}
