package UTS;
import java.util.Scanner;

public class GajiKaryawan_20 {

    public static void main(String[] args) {
        Scanner zuhdi = new Scanner(System.in);

        int hp = 0, gol = 0, jumlahHadir = 0, menu;
        String Nama = "", alamat, pilihan;
        double masaKerja = 0.0;
        boolean dataKaryawan = false;

        System.out.println("=== UTS PRAKTIKUM DASAR PEMOGRAMAN TI - 1G ==");
        System.out.println("DIBUAT OLEH : Muhammad Zuhdi Yudadharma");
        System.out.println("NIM : 244107020017");
    
        do {
            System.out.println("=====================================");
            System.out.println("pilihan menu : ");
            System.out.println("1. data karyawan");
            System.out.println("2. gaji karyawan");
            System.out.println("=====================================");
            System.out.print("Menu : ");
            menu = zuhdi.nextInt();

            if (menu == 0) {
                break;
            }
            
            if (menu == 1) {
                System.out.println("Masukkan detail data karyawan:");

                System.out.print("Nama: ");
                zuhdi.nextLine();
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
                dataKaryawan = true;

                System.out.print("Apakah anda ingin mencetak data karyawan? (y/t): ");
                pilihan = zuhdi.next();
                
                if (pilihan.equalsIgnoreCase("y")) {
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
                    if (!dataKaryawan) {
                        System.out.println("Masukkan data karyawan terlebih dahulu.");
                    } else {
                    
                    double gajiPokok = 0;
                    double tunjanganMasaKerja = 0;
                    double tunjanganKehadiran = 0;
                    double totalGaji = 0;
    
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
    
                    if (masaKerja < 1) {
                        tunjanganMasaKerja = 0;
                    } else if (masaKerja >= 1 && masaKerja <= 5) {
                        tunjanganMasaKerja = 0.1 * gajiPokok;
                    } else if (masaKerja >= 6 && masaKerja <= 8) {
                        tunjanganMasaKerja = 0.2 * gajiPokok;
                    } else if (masaKerja > 8) {
                        tunjanganMasaKerja = 0.25 * gajiPokok;
                    }
    
                    tunjanganKehadiran = jumlahHadir * 35000;
    
                    totalGaji = gajiPokok + tunjanganMasaKerja + tunjanganKehadiran;

                    System.out.println("=====================================");
                    System.out.println("Gaji Karyawan:");
                    System.out.println("Nama: " + Nama);
                    System.out.println("Gaji Pokok: Rp " + gajiPokok);
                    System.out.println("Tunjangan Masa Kerja: Rp " + tunjanganMasaKerja);
                    System.out.println("Tunjangan Kehadiran: Rp " + tunjanganKehadiran);
                    System.out.println("Total Gaji: Rp " + totalGaji);

                    System.out.print("Kembali ke menu? (y/t): ");
                    pilihan = zuhdi.next();

                    if (pilihan.equalsIgnoreCase("t")) {
                        System.out.println("Program selesai.");
                        break;
                    }
                }
            }
            
            
        
        
        }while (true);
    

            
    

    
    
    
    }
}
