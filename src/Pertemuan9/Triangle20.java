package Pertemuan9;
import java.util.Scanner;

public class Triangle20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            int j = 0;
            while ( j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        System.out.println();
        }
    }
}

