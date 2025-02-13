package semester2.Pertemuan1;
import java.util.Scanner;
public class tugas2 {

    public static void main(String[] args) {
        pilihan();

    }

    public static double Vkubus(double s) {
        double volume = s * s * s;
        return volume;
    }

    public static double lKubus(double s) {
        double luas = 6 * s * s;
        return luas;
    }

    public static double Kkubus(double s) {
        double keliling = 12 * s;
        return keliling;
    }

    public static void pilihan() {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        double sisi;

        do {
            System.out.println("\n=================");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("panjang sisi kubus: ");
                    sisi = sc.nextDouble();
                    System.out.println("Volume Kubus: " + Vkubus(sisi));
                    break;
                case 2:
                    System.out.print("panjang sisi kubus: ");
                    sisi = sc.nextDouble();
                    System.out.println("Luas Permukaan Kubus: " + lKubus(sisi));
                    break;
                case 3:
                    System.out.print("panjang sisi kubus: ");
                    sisi = sc.nextDouble();
                    System.out.println("Keliling Kubus: " + Kkubus(sisi));
                    break;
            }
        } while (pilihan != 3);
    }
}
