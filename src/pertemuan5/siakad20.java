package pertemuan5;

import java.util.Scanner;

public class siakad20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, nim, kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = input.nextLine();
        System.out.print("Masukkan Absen: ");
        absen = input.nextByte();

        //nilai
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = input.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        System.out.println("Mahasiswa dengan nama " + nama + "( NIM " + nim + ")" + " Kelas " + kelas + " Nomor Absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai akhir huruf : A \nKualifikasi : Sangat baik");
        }
            else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("Nilai akhir huruf : B+ \nKualifikasi : Lebih dari baik");
        }
            else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai akhir huruf : B \nKualifikasi Baik");
        }
            else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai akhir huruf : C+ \nKualifikasi Lebih dari cukup");
        }
            else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("Nilai akhir huruf : C \nKualifikasi Cukup");
        }
            else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai akhir huru : D \nKualifikasi Kurang");
        }
            else if (nilaiAkhir <= 39) {
                System.out.println("Nilai akhir huruf : E \nKualifikasi Gagal");
        }
    }
}
