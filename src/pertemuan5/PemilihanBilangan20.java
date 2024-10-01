package pertemuan5;
import java.util.Scanner;

public class PemilihanBilangan20 {
    public static void main(String[] args) {
        int angka;

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan sebuah angka:");
        angka = sc.nextInt();
        
        if (angka % 2 == 0)
        {
            System.out.println("angka " + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.println("angka " + angka + " termasuk bilangan ganjil");
        }
    }
}
