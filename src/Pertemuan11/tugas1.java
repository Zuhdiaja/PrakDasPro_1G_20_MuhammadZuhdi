package Pertemuan11;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] dataSurvey = new int[10][6];
        int jmlResponden = dataSurvey.length;
        int jmlPertanyaan = dataSurvey[0].length;

        for (int i = 0; i < dataSurvey.length; i++) {
            for (int j = 0; j < dataSurvey[i].length; j++) {
                System.out.print("nilai untuk responden ke-" + (i + 1) + " pertanyaan " + (j + 1) + ": ");
                dataSurvey[i][j] = sc.nextInt();

                if (dataSurvey[i][j] >= 1 && dataSurvey[i][j] <= 5) {
                } else {
                    System.out.println("hanya boleh memasukkan nilai 1 sampai 5 saja.");
                    j--;
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("======= rata rata responden =======");

        for (int i = 0; i < jmlResponden; i++) {
            double skor = 0;
            for (int j = 0; j < jmlPertanyaan; j++) {
                skor += dataSurvey[i][j];
            }
            double rata2Respon = skor / jmlPertanyaan;
            System.out.println("rata rata responden " + (i + 1) + " : " + rata2Respon);
        }

        System.out.println();
        System.out.println("======= rata rata pertanyaan =======");

        for (int j = 0; j < jmlPertanyaan; j++) {
            double skor = 0;
            for (int i = 0; i < jmlResponden; i++) {
                skor += dataSurvey[i][j];
            }
            double rata2Perta = skor / jmlResponden;
            System.out.println("rata rata pertanyaan " + (j + 1) + " : " + rata2Perta);
        }

        System.out.println();
        System.out.println("======= rata rata keseluruhan =======");

        double keseluruhan = 0;

        for (int i = 0; i < jmlResponden; i++) {
            for (int j = 0; j < jmlPertanyaan; j++) {
                keseluruhan += dataSurvey[i][j];
            }
        }
        double rata2Kesel = keseluruhan / (jmlResponden * jmlPertanyaan);
        System.out.println("rata rata keseluruhan : " + rata2Kesel);
    }
}
