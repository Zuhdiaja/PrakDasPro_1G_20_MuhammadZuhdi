package semester2.Pertemuan3;
import java.util.Scanner;
public class DosenDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen19 [] arrayOfdosen19 = new Dosen19[3];
        String kode, nama, dummy, dataKelamin;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            dataKelamin = sc.nextLine();
            jenisKelamin = dataKelamin.equalsIgnoreCase("pria");
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("===============================");

            arrayOfdosen19[i] = new Dosen19(kode, nama, jenisKelamin, usia);
        }
        
        DataDosen19 dataDosen = new DataDosen19();
        dataDosen.dataSemuaDoosen(arrayOfdosen19);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfdosen19);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfdosen19);
        dataDosen.infoDosenPalingTua(arrayOfdosen19);
        dataDosen.infoDosenPalingMuda(arrayOfdosen19);

        }
    }


