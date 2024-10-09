package Pertemuan6;
import java.util.Scanner;

public class Pemilihan2Percobaan120 {
    
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        
        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = input20.nextInt();

        if ((tahun % 4 ) == 0) {
            if ((tahun % 100) == 0){
                if ((tahun % 400) == 0) {
                    System.out.println("tahun kabisat");
        } else{
            System.out.println("Bukan tahun kabisat");
        }
            } else {
                System.out.println("Tahun kabisat");
            }
            } else {
                System.out.println("bukan tahun kabisat");
            }
        










    }
}
