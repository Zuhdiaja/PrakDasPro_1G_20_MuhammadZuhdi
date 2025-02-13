package semester2.Pertemuan1;
import java.util.Scanner;
public class array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("Program Menghitung IP semester");
        System.out.println("===========================");

        String [] matkul = { "Pancasila\t\t", "Konsep Teknologi Informasi","Critical Thinking\t", "Matematika Dasar\t"
        ,"Bahasa Inggris\t\t", "Dasar Pemrograman\t", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        String []huruf = new String[matkul.length];
        double []nSetara = new double[matkul.length];

        double[] nilaiAngka = new double[matkul.length];
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();


        if (nilaiAngka [i] >= 85 ){
            huruf[i] = "A";
            nSetara [i] = 4;
        } else if (nilaiAngka [i] >= 73 ) {
            huruf[i] = "B+";
            nSetara [i] = 3.5;
        } else if (nilaiAngka [i] >= 65 ) {
            huruf[i] ="B";
            nSetara [i] = 3;
        } else if (nilaiAngka [i] >= 60) {
            huruf[i] ="C+";
            nSetara [i] = 2.5;
        } else if (nilaiAngka [i] >= 50) {
            huruf[i] ="C";
            nSetara [i] = 2;
        } else if (nilaiAngka [i] >= 39) {
            huruf[i] ="D";
            nSetara [i] = 1;
        }else {
            huruf[i] ="E";
            nSetara [i] = 0;
        }
    }

    System.out.println("===========================");
    System.out.println("hasil konversi nilai");
    System.out.println("===========================");
    System.out.println("Mata Kuliah\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");

    double bobotNilai = 0;
        for (int i = 0; i < matkul.length; i++) {
            System.out.println(matkul[i] + "\t\t" + nilaiAngka[i] + "\t\t" + huruf[i] + "\t\t" + nSetara[i]);
            bobotNilai += nSetara[i];
    }

    System.out.println("==================");
    double IP = bobotNilai / matkul.length;
    System.out.println("IP :  " + IP);
}
}