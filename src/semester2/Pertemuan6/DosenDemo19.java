package semester2.Pertemuan6;

import java.util.Scanner;

public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 list = new DataDosen19();

        while (true) {
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. keluar");
            System.out.print("Pilih meenu  : ");
            int pilihan = sc.nextInt();
            System.out.println("================================");
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan jumlah Dosen: ");
                int jumlah = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < jumlah; i++) {
                    System.out.print("Kode          : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama          : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin : ");
                    String dataKelamin = sc.nextLine();
                    boolean jenisKelamin = dataKelamin.equalsIgnoreCase("Pria");
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    System.out.println("------------------------------");
                    sc.nextLine();

                    Dosen19 dsn = new Dosen19(dataKelamin, nama, jenisKelamin, usia);
                    list.tambah(dsn);
                }

            } else if (pilihan == 2) {
                System.out.println("Data Seluruh Dosen: ");
                list.tampil();

            } else if (pilihan == 3) {
                System.out.println("Data Dosen yang sudah terurut menggunakan BUBBLE SORT (ASC)");
                list.bubbleSort();
                list.tampil();

            } else if (pilihan == 4) {
                System.out.println("pilih metode sorting DSC: ");
                System.out.println("1. SELECTION SORT");
                System.out.println("2. INSERTION SORT");
                System.out.print("Pilih Metode : ");
                int pilihanDSC = sc.nextInt();
                sc.nextLine();

                if (pilihanDSC == 1) {
                    System.out.println("Data Dosen yang sudah terurut menggunakan SELECTION SORT (DSC)");
                list.selectionSort();
                list.tampil();
                } else if (pilihanDSC == 2) {
                    System.out.println("Data Dosen yang sudah terurut menggunakan INSERTION SORT (DSC)");
                    list.insertionSort();
                    list.tampil();
                }

            } else if (pilihan == 5) {
                System.out.println("selesai");
                break;

            }else{
                System.out.println("Pilihan tidak ada");
            }
        }
    }
}
