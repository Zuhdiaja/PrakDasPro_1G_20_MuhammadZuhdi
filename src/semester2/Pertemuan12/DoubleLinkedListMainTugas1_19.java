package semester2.Pertemuan12;

import java.util.Scanner;

public class DoubleLinkedListMainTugas1_19 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedListTugas1_19 dll = new DoubleLinkedListTugas1_19();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRIAN VAKSI EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("");
            System.out.println("1. Tambah Data Penerima Vaksin.");
            System.out.println("2. Hapus Data Pengantri Vaksin.");
            System.out.println("3. Daftar Penerima Vaksin.");
            System.out.println("4. Keluar.");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian: ");
                    int nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc.nextLine();
                    dll.addLast(nomor, nama);
                    break;

                case 2:
                    dll.removeFirst();
                    System.out.println("++++++++++++++++++++++");
                    System.out.println("Daftar pengatri vaksin");
                    System.out.println("++++++++++++++++++++++");
                    dll.print();
                    System.out.println("Sisa Antrian " + dll.size());
                    break;

                case 3:
                    dll.print();
                    System.out.println("Sisa Antrian " + dll.size());
                    break;

                case 4:
                    break;
            
                default:
                    System.out.println("Menu tidak Valid.");
            }


        } while (pilihan != 4);
        
    }
}
