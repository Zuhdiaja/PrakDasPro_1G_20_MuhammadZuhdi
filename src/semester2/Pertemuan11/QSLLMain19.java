package semester2.Pertemuan11;
import java.util.Scanner;

public class QSLLMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList19 qsll = new QueueLinkedList19();
        qsll.max = 5;
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN MAHASISWA ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Cek Jumlah Antrian");
            System.out.println("6. Cek Apakah Antrian Kosong");
            System.out.println("7. Cek Apakah Antrian Penuh");
            System.out.println("8. Tampilkan Semua Antrian");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    MahasiswaTugas19 mhs = new MahasiswaTugas19(nim, nama, kelas, ipk);
                    qsll.addLast(mhs);
                    break;
                
                case 2:
                    qsll.dequeue();
                    break;

                case 3:
                    qsll.peek();
                    break;
                    
                case 4:
                    qsll.peekTail();
                    break;

                case 5:
                    System.out.println("Jumlah antrian: " + qsll.size());
                    break;
            
                case 6:
                    System.out.println("Antrian kosong: " + qsll.IsEmpty());
                    break;

                case 7:
                    System.out.println("Antrian penuh: " + qsll.isFull());
                    break;

                case 8:
                    qsll.print();
                    break;

                case 9:
                    qsll.clear();
                    break;

                case 0:
                    System.out.println("keluar program");
                    break;

                default:
                    System.out.println("pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}
