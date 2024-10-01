package pertemuan4;

import java.util.Scanner;

public class quiz20 {
    public static void main(String[] args) {
        //scanner input digunakan untuk
        Scanner input = new Scanner(System.in);
        
        String  nama20, nim20;
        int absen20;
        int tglBerangkat20, blnBerangkat20, thnBerangkat20;
        int lamaSEHari20, tahunSE20, bulanSE20, hariSE20;
        int ttlHariKepulangan20, ttlBulanKepulangan20, ttlTahunKepulangan20;
        int hariKepulangan20, bulanKepulangan20;

        //untuk nama, nim, dan absen
        System.out.print("Nama   : ");
        nama20 = input.nextLine();
        System.out.print("NIM    : ");
        nim20 = input.nextLine();
        System.out.print("Absen  : ");
        absen20 = input.nextInt();


        //unutk tanggal berangkat
        System.out.println("======== QUIZ 1 TI 1E =======");
        System.out.print("Masukkan tanggal berangkat : ");
        tglBerangkat20 = input.nextInt();
        System.out.print("Masukkan bulan berangkat : ");
        blnBerangkat20 = input.nextInt();
        System.out.print("Masukkan tahun berangkat : ");
        thnBerangkat20 = input.nextInt();
        
        //hasil tanggal berangkat
        System.out.println("Tanggal berangkat : " + tglBerangkat20 + "-" + blnBerangkat20 + "-" + thnBerangkat20);
        
         // Input lama SE dalam hari
        System.out.println("\n====== Masukkan berapa lama anda SE ====");
        System.out.print("Berapa lama SE dalam Hari: ");
        lamaSEHari20 = input.nextInt();
        
         // Perhitungan: Konversi lama SE ke tahun, bulan, dan hari
         tahunSE20 = lamaSEHari20 / 365; //untuk tahun
         bulanSE20 = (lamaSEHari20 % 360)/ 30; //untuk bulan
         hariSE20 = (lamaSEHari20 % 360) % 30; //untuk hari //

         //Perhitungan tanggal kepulangan
        ttlHariKepulangan20 = tglBerangkat20 + hariSE20; //12 + 5
        ttlBulanKepulangan20 = blnBerangkat20 + bulanSE20 + (ttlHariKepulangan20 - 1) / 30; //7 + 0 +(17-1 = 16) /30
        ttlTahunKepulangan20 = thnBerangkat20 + tahunSE20 + (ttlBulanKepulangan20 - 1) / 12;
        
         //Hasil tanggal kepulangan
        hariKepulangan20 = (ttlHariKepulangan20 - 1) % 30 + 1;
        bulanKepulangan20 = (ttlBulanKepulangan20 - 1) % 12 + 1;

        
        // System.out.println("Nama: " + nama20 );
        // System.out.println("NIM: " + nim20 );
        // System.out.print("Absen: " + absen20 );

        
         // Output lama SE dalam tahun, bulan, dan hari
        System.out.println("Lama SE: " + tahunSE20 + " tahun " + bulanSE20 + " bulan " + hariSE20 + " hari");
        
         // Output tanggal kepulangan
        System.out.println("\nTanggal kepulangan anda SE: " + hariKepulangan20 + "-" + bulanKepulangan20 + "-" + ttlTahunKepulangan20);



    }
}
