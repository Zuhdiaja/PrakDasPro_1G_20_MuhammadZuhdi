package Pertemuan10;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0;

        System.out.print("masukkan banyak mahasiswa : ");
        int jmlNilai = sc.nextInt();
        int [] arrNilai = new int[jmlNilai];

        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i +1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        for (int i = 0; i < arrNilai.length; i++) {
            total += arrNilai[i];
        }

        int nilaiTertinggi = 0, nilaiTerendah = 100;

        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] > nilaiTertinggi) {
                nilaiTertinggi = arrNilai[i];
            }
            if (arrNilai[i] < nilaiTerendah) {
                nilaiTerendah = arrNilai[i];
            }
        }

    for (int i = 0; i < arrNilai.length; i++) {
        System.out.println("nilai mahasiswa ke-" +(i+1)+ " " + (arrNilai[i]) );
        
    }
    double rata2 = total/arrNilai.length;
    System.out.println("rata rata nilai : " + rata2);
    System.out.println("nilai tertinggi : " +nilaiTertinggi);
        System.out.println("nilai terendah : " +nilaiTerendah);
    }
}
