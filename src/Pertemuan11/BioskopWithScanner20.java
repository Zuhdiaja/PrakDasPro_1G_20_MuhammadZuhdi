package Pertemuan11;
import java.util.Scanner;

public class BioskopWithScanner20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama,next;

        String [][] penonton = new String[4][2];
    
        while (true) {
            System.out.print("masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris][kolom-1] = nama;

            System.out.print("input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        }
}
