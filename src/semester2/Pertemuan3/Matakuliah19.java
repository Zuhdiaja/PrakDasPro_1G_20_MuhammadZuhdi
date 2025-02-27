package semester2.Pertemuan3;

public class Matakuliah19 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    public Matakuliah19 (String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo(int index){
        System.out.println("Tambahan Data Matakuliah ke-" + index);
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
}

