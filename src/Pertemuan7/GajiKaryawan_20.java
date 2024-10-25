package Pertemuan7;
import java.util.Scanner;

public class GajiKaryawan_20 {

    public static void main(String[] args) {
        Scanner zuhdi = new Scanner(System.in);

        int hp = 0, gol = 0, jumlahHadir = 0, menu;
        String Nama = "", alamat = "", pilihan;
        double masaKerja = 0.0;

        boolean dataKaryawanMasuk = false;  // Flag untuk mengecek apakah data karyawan sudah dimasukkan

        System.out.println("=== UTS PRAKTIKUM DASAR PEMOGRAMAN TI - 1G ==");
        System.out.println("DIBUAT OLEH : Muhammad Zuhdi Yudadharma");
        System.out.println("NIM : 244107020017");
    
        do {
            System.out.println("=====================================");
            System.out.println("Pilihan menu : ");
            System.out.println("1. Data karyawan");
            System.out.println("2. Gaji karyawan");
            System.out.println("=====================================");
            System.out.print("Menu : ");
            menu = zuhdi.nextInt();

            if (menu == 0) {
                break;
            } 
            
            if (menu == 1) {
                // Masukkan data karyawan
                System.out.println("Masukkan detail data karyawan:");

                System.out.print("Nama: ");
                zuhdi.nextLine();  // Bersihkan buffer input
                Nama = zuhdi.nextLine();
                System.out.print("Alamat: ");
                alamat = zuhdi.nextLine();
                System.out.print("Nomor HP: ");
                hp = zuhdi.nextInt();
                System.out.print("Golongan (1-4): ");
                gol = zuhdi.nextInt();
                System.out.print("Masa kerja (tahun): ");
                masaKerja = zuhdi.nextDouble();
                System.out.print("Jumlah kehadiran (hari): ");
                jumlahHadir = zuhdi.nextInt();

                System.out.println("Data karyawan berhasil dimasukkan.\n");
                dataKaryawanMasuk = true;  // Set flag bahwa data sudah diisi

                System.out.print("Apakah anda ingin mencetak data karyawan? (y/t): ");
                pilihan = zuhdi.next();
                
                if (pilihan.equalsIgnoreCase("y")) {
                    // Cetak data karyawan
                    System.out.println("=====================================");
                    System.out.println("Data Karyawan:");
                    System.out.println("=====================================");
                    System.out.println("Nama: " + Nama);
                    System.out.println("Alamat: " + alamat);
                    System.out.println("Nomor HP: " + hp);
                    System.out.println("Golongan: " + gol);
                    System.out.println("Masa Kerja: " + masaKerja + " tahun");
                    System.out.println("Jumlah Kehadiran: " + jumlahHadir + " hari");
                    System.out.println("=====================================\n");
                }

                System.out.print("Kembali ke menu? (y/t): ");
                pilihan = zuhdi.next();

                if (pilihan.equalsIgnoreCase("t")) {
                    System.out.println("Program selesai.");
                    break;
                }
            } 
            
            else if (menu == 2) {
                if (!dataKaryawanMasuk) {
                    // Jika data karyawan belum diisi
                    System.out.println("Masukkan data karyawan terlebih dahulu.");
                } else {
                    // Hitung gaji
                    double gajiPokok = 0;
                    double tunjanganMasaKerja = 0;
                    double tunjanganKehadiran = 0;
                    double totalGaji = 0;

                    // Menentukan gaji pokok berdasarkan golongan
                    if (gol == 1) {
                        gajiPokok = 2000000;
                    } else if (gol == 2) {
                        gajiPokok = 2500000;
                    } else if (gol == 3) {
                        gajiPokok = 3000000;
                    } else {
                        System.out.println("Golongan tidak valid!");
                        continue;
                    }

                    // Menghitung tunjangan masa kerja
                    if (masaKerja < 1) {
                        tunjanganMasaKerja = 0;
                    } else if (masaKerja >= 1 && masaKerja <= 5) {
                        tunjanganMasaKerja = 0.1 * gajiPokok;
                    } else if (masaKerja >= 6 && masaKerja <= 8) {
                        tunjanganMasaKerja = 0.2 * gajiPokok;
                    } else if (masaKerja > 8) {
                        tunjanganMasaKerja = 0.25 * gajiPokok;
                    }

                    // Menghitung tunjangan kehadiran
                    tunjanganKehadiran = jumlahHadir * 35000;

                    // Menghitung total gaji
                    totalGaji = gajiPokok + tunjanganMasaKerja + tunjanganKehadiran;

                    // Cetak hasil gaji
                    System.out.println("=====================================");
                    System.out.println("Gaji Karyawan:");
                    System.out.println("Nama: " + Nama); // Menampilkan nama karyawan
                    System.out.println("Gaji Pokok: Rp " + gajiPokok);
                    System.out.println("Tunjangan Masa Kerja: Rp " + tunjanganMasaKerja);
                    System.out.println("Tunjangan Kehadiran: Rp " + tunjanganKehadiran);
                    System.out.println("Total Gaji: Rp " + totalGaji);
                    System.out.println("=====================================\n");

                    System.out.print("Kembali ke menu? (y/t): ");
                    pilihan = zuhdi.next();

                    if (pilihan.equalsIgnoreCase("t")) {
                        System.out.println("Program selesai.");
                        break;
                    }
                }
            } else {
                System.out.println("Masukkan menu yang benar.");
            }

        } while (true);

        zuhdi.close();
        System.out.println("Anda keluar dari program.");
    }
}
