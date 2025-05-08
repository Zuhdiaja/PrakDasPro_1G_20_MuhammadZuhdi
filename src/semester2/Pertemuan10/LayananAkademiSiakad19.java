package semester2.Pertemuan10;
import java.util.Scanner;

public class LayananAkademiSiakad19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan19 antrian = new AntrianLayanan19(5);
        int pilihan;

        do{
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa Dalam Antrian");
            System.out.println("6. Mahasiswa Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.print("NIM   : ");
                        String nim = sc.nextLine();
                        System.out.print("Nama  : ");
                        String nama = sc.nextLine();
                        System.out.print("Prodi : ");
                        String prodi = sc.nextLine();
                        System.out.print("Kelas : ");
                        String kelas = sc.nextLine();
                        Mahasiswa19 mhs =new Mahasiswa19(nim, nama, prodi, kelas);
                        antrian.tambahAntrian(mhs);
                        break;
                    
                    case 2:
                        Mahasiswa19 dilayani = antrian.layanMahasiswa19();
                        if (dilayani != null) {
                            System.out.print("Melayani Mahasiswa: ");
                            dilayani.tampilkanData();
                        }
                        break;

                    case 3:
                        antrian.lihatTerdepan();
                        break;

                    case 4:
                        antrian.tampilkanSemua();
                        break;

                    case 5:
                        System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                        break;

                    case 6:
                        antrian.lihatAkhir();
                        break;

                    default:
                        System.out.println("pilihan tidak valid");
                }
        }while (pilihan != 0);
        sc.close();
    }

}
