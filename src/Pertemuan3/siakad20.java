package Pertemuan3;

import java.util.Scanner;

public class siakad20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.next().charAt(0);
        System.out.print("Masukkan Absen: ");
        absen = sc.nextByte();
        
        //nilai
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + nama + "NIM: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}