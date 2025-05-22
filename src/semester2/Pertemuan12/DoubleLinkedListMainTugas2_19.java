package semester2.Pertemuan12;

import java.util.Scanner;

public class DoubleLinkedListMainTugas2_19 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListTugas2_19 dll = new DoubleLinkedListTugas2_19();
        int pilihan;

        do {
            System.out.println("===========================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===========================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===========================================");
            System.out.print("");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judul1 = sc.nextLine();
                    System.out.print("Rating Film: ");
                    Double rating1 = sc.nextDouble();
                    dll.addFirst(id1, judul1, rating1);
                    break;
                
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judul2 = sc.nextLine();
                    System.out.print("Rating Film: ");
                    Double rating2 = sc.nextDouble();
                    dll.addFirst(id2, judul2, rating2);
                    break;

                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.println("urutan ke-" + (dll.size +1));
                    System.out.print("ID Film: ");
                    int id3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul Film: ");
                    String judul3 = sc.nextLine();
                    System.out.print("Rating Film: ");
                    Double rating3 = sc.nextDouble();
                    dll.addFirst(id3, judul3, rating3);
                    break;
            
                case 4:
                    dll.removeFirst();
                    System.out.println("data nilai pertama berhasil dihapus");
                    break;

                case 5:
                    dll.removeLast();
                    System.out.println("data nilai terkahir berhasil dihapus");

                    break;

                case 6:
                    System.out.print("node yang ingin dihapus: ");
                    int hapusIndex =sc.nextInt();
                    dll.remove(hapusIndex);
                    break;

                case 7:
                    dll.print();
                    break;
                
                case 8:
                    System.out.print("Masukkan ID yang ingin dicari: ");
                    int idCari = sc.nextInt();
                    dll.search(idCari);
                    break;

                case 9:
                    dll.desceding();
                    System.out.println("node berhasil diurutkan");
                    break;

                case 10:
                    break;

                default:
                System.out.println("Pilihan Tidak Valid");
                    break;
            }
        }while (pilihan != 10);
    }
}
