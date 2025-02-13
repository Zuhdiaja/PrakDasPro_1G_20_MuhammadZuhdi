package semester2.Pertemuan1;
import java.util.Scanner;
public class nilaiMhs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=====================");
        System.out.print("Masukkan nilai tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        kuis = sc.nextInt();
        System.out.print("Masukkan nilai uts: ");
        uts = sc.nextInt();
        System.out.print("Masukkan nilai uas: ");
        uas = sc.nextInt();
        System.out.println("====================");
        System.out.println("====================");
        

        if (tugas < 1 || tugas > 100 || kuis < 1 || kuis > 100 || uts < 1 || uts > 100 ||uas < 1 || uas > 100) {
            System.out.println("nilai tidak valid");
        }else {
            int nilaiAkhir = hitungNilai (tugas, kuis, uts, uas);

            System.out.println("nilai akhir: " + nilaiAkhir);
            System.out.print("nilai huruf: ");
            huruf(nilaiAkhir);
            System.out.println("====================");
            System.out.println("====================");
            status(nilaiAkhir);
        }
    }

    public static int hitungNilai(int tugas, int kuis, int uts, int uas) {
        return (int) ((0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas));
    }

    public static void huruf(int nilai){
        if (nilai > 80 ){
            System.out.println("A");
        } else if (nilai > 73 ) {
            System.out.println("B+");
        } else if (nilai > 65 ) {
            System.out.println("B");
        } else if (nilai > 60) {
            System.out.println("C+");
        } else if (nilai > 50) {
            System.out.println("C");
        } else if (nilai > 39) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }
    }

    public static void status (int nilai){
        if (nilai >= 50) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
    }
}
}
