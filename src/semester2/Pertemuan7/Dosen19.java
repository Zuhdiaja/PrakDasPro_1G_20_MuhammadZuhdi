package semester2.Pertemuan7;

public class Dosen19 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen19(String kd, String name, boolean jk, int age){
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampilInformasi(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("usia: " + usia);
    }
}
