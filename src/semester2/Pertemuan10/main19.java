package semester2.Pertemuan10;
import java.util.Scanner;

public class main19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS19 antrian = new AntrianKRS19(10);
        int pilihan;

        do{
            System.out.println("\n===== MENU ANTRIAN KRS MAHASISWA =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Mahasiswa yang Sudah Proses KRS");
            System.out.println("8. Cetak Jumlah Mahasiswa yang Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
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
                MahasiswaKRS19 mhs =new MahasiswaKRS19(nim, nama, prodi, kelas);
                antrian.tambahAntrian(mhs);
                break;

                case 2:
                antrian.layaniDuaMahasiswa();
                break;

                case 3:
                antrian.tampilkanSemua();
                break;

                case 4:
                antrian.duaTerdepan();
                break;

                case 5:
                antrian.lihatAkhir();
                break;

                case 6:
                System.out.println("jumlah antrian: " + antrian.getJumlahAntrian());
                break;

                case 7:
                System.out.println("jumlah antrian yang sudah diproses: " + antrian.getJumlahProses());
                break;
            
                case 8:
                antrian.cetakMahasiswaBelumProses();
                break;

                case 9:
                antrian.kosongAntrian();
                break;

                case 0:
                System.out.println("selesai");
                break;

                default:
                System.out.println("pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}
