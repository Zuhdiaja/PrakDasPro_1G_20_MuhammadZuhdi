package pertemuan5;
import java.util.Scanner;

public class PemilihanBilangan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan sebuah angka:");
        int angka = sc.nextInt();
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
    
    System.out.println("angka " + angka + " termasuk bilangan " + hasil + ".");
}
}
