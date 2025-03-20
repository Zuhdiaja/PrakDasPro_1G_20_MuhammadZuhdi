package semester2.Pertemuan6;
import java.util.Scanner;
public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();
        String nim, nama, kelas;
        double ipk;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("NIM: ");
            nim = sc.nextLine();
            System.out.print("Kelas: ");
            kelas = sc.nextLine();
            System.out.print("IPK: ");
            ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("----------------------------------");

            Mahasiswa19 mhs = new Mahasiswa19(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        //System.out.println("Data mahasiswa sebelum sorting: ");
        //list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC)");
        // list.insertionSort();
        // list.tampil();
    }
}
