package Pertemuan13;

import java.util.Scanner;

public class Percobaan620 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int p,l,t,L, vol;

        System.out.print("Masukkan panjang : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang Adalah " + L);

        vol= hitungVolume(t, p, l);
        System.out.println("volume  balok adalah " + vol);
        
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}