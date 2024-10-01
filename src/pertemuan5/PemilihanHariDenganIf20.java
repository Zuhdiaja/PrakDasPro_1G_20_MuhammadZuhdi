package pertemuan5;
import java.util.Scanner;

public class PemilihanHariDenganIf20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan angkaa (1-7): ");
    int angka = sc.nextInt();
    
        if (angka >= 1 && angka <= 5) {
            System.out.println("Weekday");
        } else if (angka == 6 || angka == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
