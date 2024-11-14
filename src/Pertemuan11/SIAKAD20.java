package Pertemuan11;
import java.util.Scanner;

public class SIAKAD20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mahasiswa,matkul;

        System.out.print("Masukan jumlah mahasiswa: ");
        mahasiswa = sc.nextInt();
        System.out.print("Masukan jumlah mata kuliah: ");
        matkul = sc.nextInt();

        int [][] nilai = new int[mahasiswa][matkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahsiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata mahasiswa: " + totalPerSiswa/matkul);
        }
        System.out.println("=============================");
        System.out.println("Rata-rata Nilai Mata Kuliah: ");

        for (int j = 0; j < matkul; j++) {
            double totalPerMatkul = 0;
            
            for (int i = 0; i < mahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("mata Kuliah " + (j+1) + ": " + totalPerMatkul/mahasiswa);
        }
        
    }
}