package semester2.Pertemuan1;
import java.util.Scanner;
public class perulangan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  nim;

        System.out.print("masukkan nim : ");
        nim = sc.nextDouble();
        System.out.println("==========================");
        double N = nim % 100;

        if (N < 10) {
            N += 10;
        }

        System.out.println("n : " + N);


        for (int i = 1; i <= N; i++) {
            if (i == 6 || i == 10) {
                System.out.print(" *");
            } else if (i % 2 == 1) {
                System.out.print(" *");
            } else {
                System.out.print( i);
            }
        }
    }
}
