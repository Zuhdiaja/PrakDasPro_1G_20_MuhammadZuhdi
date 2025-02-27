package semester2.Pertemuan3;
import java.util.Scanner;
public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa19 [] arrayOfMahasiswa19 = new Mahasiswa19[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa19[i] = new Mahasiswa19();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NiM     : ");
            arrayOfMahasiswa19[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa19[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa19[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa19[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama    : " + arrayOfMahasiswa19[i].nama);
            System.out.println("kelas   : " + arrayOfMahasiswa19[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa19[i].ipk);
            System.out.println("------------------------------------");
        }

        Mahasiswa19 mhs1 = new Mahasiswa19();
        mhs1.nim = "2241719132";
        mhs1.nama = "Nama Mahasiswa";
        mhs1.kelas = "TI-2A";
        mhs1.ipk = 3.5f;

        mhs1.cetakInfo();
        }
}
