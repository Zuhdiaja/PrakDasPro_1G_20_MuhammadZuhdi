package semester2.Pertemuan7;
import java.util.Scanner;
public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 list = new DataDosen19();
        int jumDsn = 0;

        while (true) {
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampil data");
            System.out.println("3. Cari berdasarkan nama (Sequential search)");
            System.out.println("4. Cari berdasarkan umur (Binary search)");
            System.out.println("5. keluar");
            System.out.print("Pilih meenu  : ");
            int pilihan = sc.nextInt();
            System.out.println("================================");
            sc.nextLine();


            if (pilihan == 1) {
                System.out.print("Masukkan jumlah dosen: ");
                jumDsn = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < jumDsn; i++) {
                    System.out.println("Data dosen ke-" + (i+1));
                    System.out.print("Kode          : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama          : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin : ");
                    String dataKelamin = sc.nextLine();
                    boolean jenisKelamin = dataKelamin.equalsIgnoreCase("Pria");
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    System.out.println("====================================");
                    sc.nextLine();
                    System.out.println();
                    list.tambah(new Dosen19(kode, nama, jenisKelamin, usia));
                }

            } else if (pilihan == 2) {
                System.out.println("Data Dosen: ");
                list.tampil();
                System.out.println();
            
            } else if (pilihan == 3) {
                System.out.println("Pencarian Data Berdasarkan Nama");
                System.out.println("---------------------------------------------");
                System.out.print("masukkan nama dosen yang dicari: ");
                String cari = sc.nextLine();
                System.out.println("==========================");
                list.sequentialSearching(cari);

            } else if (pilihan == 4) {
                System.out.println();
                System.out.println("Pencarian Data Berdasarkan Usia");
                System.out.println("---------------------------------------------");
                System.out.print("masukkan usia dosen yang dicari: ");
                int cariUsia = sc.nextInt();
                System.out.println("==========================");
                list.findBinarySearch(cariUsia, 0, jumDsn - 1);

            }else if (pilihan == 5) {
                System.out.println("selesai");
                break;

            } else {
                System.out.println( "pilihan tidak ada");
            }
            
        }
    }
}
