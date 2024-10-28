package Pertemuan9;
import java.util.Scanner;

public class RataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i ,j;
        float nilai, RataNilai,
        totalNilai;
        
        i=1;
        while (i<=5) {
            totalNilai = 0;
            System.out.println("input nilai mahasiswa ke " + i);
            for ( j = 1; j <=5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai=sc.nextInt();
                totalNilai+=nilai;
            }
            RataNilai=totalNilai/5;
            i++;

            System.out.println("Rata - Rata Nilai Mahasiswa ke " +i+ "adalah = " + RataNilai);
        }
    }
}