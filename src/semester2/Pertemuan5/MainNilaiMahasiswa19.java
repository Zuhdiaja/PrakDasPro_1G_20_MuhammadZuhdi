package semester2.Pertemuan5;

public class MainNilaiMahasiswa19 {
    public static void main(String[] args) {
        int uts [] = {78, 85, 90, 76, 92, 88, 80, 82};
        int uas [] = {82, 88, 87, 79, 95, 85, 83, 84};

        NilaiMahasiswa19 nm = new NilaiMahasiswa19(uts, uas);

        System.out.println("Nilai UTS tertinggi: " +nm.UTSTertinggi(0, uts.length-1));
        System.out.println("Nilai UTS Terendah: "+nm.UTSTerendah(0, uts.length-1));
        System.out.println("Rata-Rata UAS: "+nm.rataUAS());

    }
}
