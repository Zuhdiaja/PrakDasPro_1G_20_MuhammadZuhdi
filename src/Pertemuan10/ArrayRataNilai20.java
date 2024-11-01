package Pertemuan10;
import java.util.Scanner;
public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double totalNilaiLulus = 0, totalNilaiTidakLulus = 0;
        int jmlMhsLulus = 0, jmlMhsTidaklLulus = 0;

        System.out.print("masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            
            if (nilaiMhs[i] > 70) {
                totalNilaiLulus += nilaiMhs[i];
                jmlMhsLulus++;
            } else {
                totalNilaiTidakLulus += nilaiMhs[i];
                jmlMhsTidaklLulus++;
            }
        }
        
        double rataLulus;
        if (jmlMhsLulus > 0) {
            rataLulus = totalNilaiLulus / jmlMhsLulus;
        } else {
            rataLulus = 0;
        }
        double rataTidakLulus;
        if (jmlMhsTidaklLulus > 0) {
            rataTidakLulus = totalNilaiTidakLulus / jmlMhsTidaklLulus;
        } else {
            rataTidakLulus = 0;
        }

        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);

    }

}