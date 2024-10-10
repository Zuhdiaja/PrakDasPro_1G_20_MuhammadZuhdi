package Pertemuan6;
import java.util.Scanner;

public class tugasP6_20 {
    
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan Bilangan 1 : ");
            int bil1 = input20.nextInt();

        System.out.print("Masukkan Bilangan 2 : ");
            int bil2 = input20.nextInt();

        System.out.print("Masukkan Bilangan 3 : ");
            int bil3 = input20.nextInt();
            int bilanganTerbesar = 0;
        
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilanganTerbesar = bil1;
                } else {
                    bilanganTerbesar = bil3;
                }
        } else {
            if (bil2 > bil3) {
                bilanganTerbesar = bil2;
                } else {
                    bilanganTerbesar = bil3;
                }
        }
    
        System.out.println("bilangan terbesar = " + bilanganTerbesar);

    }
}