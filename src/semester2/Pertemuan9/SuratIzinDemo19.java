package semester2.Pertemuan9;

import java.util.Scanner;

public class SuratIzinDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat19 stackSurat = new StackSurat19(10);
        int pilihan;
        
        do{
            System.out.println("Menu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan Nama Mahasiswa");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();


            switch (pilihan) {
                case 1:
                System.out.print("ID Surat: ");
                String id = sc.nextLine();
                System.out.print("Nama Mahasiswa: ");
                String nama = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                System.out.print("Jenis Izin (S/I): ");
                char jenis = sc.nextLine().charAt(0);
                System.out.print("Durasi Izin (hari): ");
                int durasi = sc.nextInt();
                sc.nextLine();

                Surat19 surat = new Surat19(id, nama, kelas, jenis, durasi);
                stackSurat.push(surat);
                System.out.println("Surat izin berhasil diterima");
                break;
                
                case 2:
                Surat19 diproses = stackSurat.pop();
                if (diproses != null) {
                    System.out.println("surat " + diproses.namaMahasiswa + " diproses");
                }
                break;

                case 3:
                Surat19 lihat = stackSurat.peek();
                if (lihat != null) {
                    System.out.println("Surat terakhir: " + lihat.namaMahasiswa);
                }
                break;

                case 4:
                System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                String cariNama = sc.nextLine();
                if (stackSurat.cariSurat(cariNama)) {
                    System.out.println("Surat " + cariNama + " ditemukan");
                } else {
                    System.out.println("Surat " + cariNama + " tidak ditemukan");
                }
                break;

                default:
                System.out.println("Menu tidak tersedia.");
            }
        }while(pilihan >= 1 && pilihan <= 4);

    }
}
