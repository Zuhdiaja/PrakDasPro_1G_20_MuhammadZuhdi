package Pertemuan13;

import java.util.Scanner;

public class Kubus20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double s,L,V;
        System.out.print("Masukkan panjang sisi kubus : ");
        s = input.nextDouble();

        L = luasKubus(s);
        System.out.println("luas permukaan kubus adalah : " + L);

        V = volumeKubus(s);
        System.out.println("volume kubus adalah : " + V);
    }

    static double luasKubus(double s) {
        double luas = 6 * s * s;
    return luas;
    }

    static double volumeKubus(double s) {
        double volume = s * s * s;
        return volume;
    }

    
    
}
