package Pertemuan13;
import java.util.Scanner;

public class tugas2_20 {
    
    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 10, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55}
    };

    static String[] menu = {"Kopi\t", "Teh\t", "Es Degan", "Roti Bakar", "Gorengan"};
    static String [] hari ={"Hari ke 1", "Hari ke 2", "Hari ke 3", "Hari ke 4", "Hari ke 5", "Hari ke 6", "Hari ke 7"};
    
    public static void tampilkan() {
        System.out.print("\t");
            for (int i = 0; i < hari.length; i++) {
        System.out.print("\t     " + hari[i]);
    }
        System.out.println();

            for (int i = 0; i < menu.length; i++) {
                System.out.print(menu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
            System.out.print("|"+"\t" + penjualan[i][j] + "\t");
            }
            System.out.println("|");
        }
    }

    public static void rataRataPenjualan() {
        System.out.println("\nRata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata =  totalPenjualan / penjualan[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void menuTertinggi() {
        int maxPenjualan = 0;
    String menuTerlaris = "";
    for (int i = 0; i < menu.length; i++) {
        int totalPenjualan = 0;
        for (int j = 0; j < penjualan[i].length; j++) {
            totalPenjualan += penjualan[i][j];
        }
        if (totalPenjualan > maxPenjualan) {
            maxPenjualan = totalPenjualan;
            menuTerlaris = menu[i];
        }
    }
    System.out.println("\nMenu dengan penjualan tertinggi adalah: " + menuTerlaris);
    }

    public static void editPenjualan(String namaMenu, int hari, int jumlah) {
        int indexMenu = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(namaMenu)) {
                indexMenu = i;
                break;
            }
        }
        if (indexMenu != -1 && hari >= 1 && hari <= 7) {
            penjualan[indexMenu][hari - 1] = jumlah;
            System.out.println("\nData penjualan untuk " + namaMenu + " pada hari ke-" + hari + " berhasil diubah menjadi " + jumlah);
        } else {
            System.out.println("\nMenu atau hari tidak valid.");
        }
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int pilihan;

            do {
                System.out.println("1. Tampilkan Seluruh Data Penjualan");
                System.out.println("2. Tampilkan Rata-rata Penjualan");
                System.out.println("3. Tampilkan Menu Penjualan Tertinggi");
                System.out.println("4. Edit Data Penjualan");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi (1-5): ");
                pilihan = sc.nextInt();
    
                if (pilihan == 1) {
                    tampilkan();

                } else if (pilihan == 2) {
                    rataRataPenjualan();

                } else if (pilihan == 3) {
                    menuTertinggi();

                } else if (pilihan == 4) {
                    System.out.println("\nPilih menu untuk diedit:");
                    for (int i = 0; i < menu.length; i++) {
                        System.out.println((i + 1) + ". " + menu[i]);
                    }
                    System.out.print("Masukkan nomor menu: ");
                    int menuPilihan = sc.nextInt();
                    if (menuPilihan < 1 || menuPilihan > menu.length) {
                        System.out.println("Menu tidak valid.");
                    }
                    String namaMenu = menu[menuPilihan - 1];
                    System.out.print("Masukkan hari (1-7): ");
                    int hari = sc.nextInt();
                    System.out.print("Masukkan jumlah penjualan baru: ");
                    int jumlah = sc.nextInt();
                    editPenjualan(namaMenu, hari, jumlah);

                } else if (pilihan == 5) {
                    System.out.println("Terima kasih! Program selesai.");
                } else {
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                }
            } while (pilihan != 5);
    }

}
