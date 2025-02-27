package semester2.Pertemuan3;
import java.util.Scanner;
public class MatakuliahDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam;
        
        System.out.print("masukkan jumlah Matakuliah = ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        Matakuliah19 [] arrayOfMatakuliah19 = new Matakuliah19[jumlahMataKuliah];

        for (int i = 0; i < arrayOfMatakuliah19.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrayOfMatakuliah19[i] = new Matakuliah19(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMatakuliah19.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode       : " + arrayOfMatakuliah19[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah19[i].nama);
            System.out.println("SKS        : " + arrayOfMatakuliah19[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah19[i].jumlahJam);
            System.out.println("------------------------------------");
            arrayOfMatakuliah19[i] = new Matakuliah19("4321", "Agama", 2, 4);
            arrayOfMatakuliah19[i].cetakInfo(i+1);
            
        }

        
    }
    

}
