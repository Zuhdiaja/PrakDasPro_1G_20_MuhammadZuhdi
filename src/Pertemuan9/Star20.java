package Pertemuan9;
import java.util.Scanner;

public class Star20 {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
    
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int i =0; i <=N; i++) {
            System.out.print("*");
        }
    }
}
