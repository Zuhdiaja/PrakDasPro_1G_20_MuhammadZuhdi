package Pertemuan11;
import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama,next;

        String [][] penonton = new String[4][2];
    
        while (true) {
            System.out.println();
            System.out.println("input");
            System.out.print("masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (baris >= 0 && baris <= penonton.length && kolom >= 0 && kolom <= penonton[0].length) {
                if (penonton [baris-1][kolom-1] == null) {
                    penonton [baris-1][kolom-1] = nama;
                } else {
                    System.out.println("masukkan baris dan kolom kembali");
                }
            } else {
                System.out.println("baris/kolom kursi yang tidak tersedia");
                
            }
            System.out.println();
            System.out.println("tampilan");
            
            for (int i = 0; i < penonton.length; i++) {
                System.out.print("penonton pada baris ke-" + (i+1) + ": ");
                for (int j = 0; j < penonton[i].length; j++) {
                    System.out.print((penonton[i][j] == null ? "***" : penonton[i][j]) + " ");
                }
                System.out.println();
            }

            System.out.print("input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        }
}
