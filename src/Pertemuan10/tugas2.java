package Pertemuan10;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int jmlPsn;
    String NamaMenu = "";
    int total = 0;

        System.out.print("masukkan jumlah pesanan : ");
        jmlPsn = sc.nextInt();
        sc.nextLine();

        int [] harga = new int[jmlPsn];

        for (int i = 0; i < jmlPsn; i++) {
            System.out.print("masukkan nama makanan atau minuman " +(i+1)+ " : ");
            NamaMenu = sc.nextLine();
            System.out.print("masukkan harga : ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            total += harga[i];
        }

        System.out.println();
        System.out.println("SEMUA PESANAN");
        for (int i = 0; i < jmlPsn; i++) {
            System.out.println( "nama menu " + (i+1) + " : " + NamaMenu);
            System.out.println("harga : " +harga[i]);
        }

        System.out.println();
        System.out.println( "total : " + total);

    }
}
