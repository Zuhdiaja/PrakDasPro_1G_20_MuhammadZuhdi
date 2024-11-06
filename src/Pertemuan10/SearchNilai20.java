package Pertemuan10;
import java.util.Scanner;

public class SearchNilai20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key;
        int hasil = -1;

        System.out.print("masukkan banyak nilai yang akan diinput  : ");
        int jmlNilai = sc.nextInt();
        int[] arrNilai = new int[jmlNilai];

        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < jmlNilai; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("nilai " + key + "  ketemu di mahasiswa " + (hasil+1));
        }else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        


    }
}