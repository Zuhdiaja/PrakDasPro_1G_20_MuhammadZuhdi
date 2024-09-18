package Pertemuan3;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlListrik, tarif, batasListrik = 500;
        boolean statusTagihan;

        System.out.print("Penggunaan listrik (kWh) = ");
            jmlListrik = sc.nextInt();

        tarif = jmlListrik * 1500;
        statusTagihan = jmlListrik > batasListrik;

        System.out.println("Status tagihan melebihi batas 500 kWh: " + statusTagihan);
        System.out.println("Jumlah tagihan listrik : Rp" + tarif  );

    }
}
