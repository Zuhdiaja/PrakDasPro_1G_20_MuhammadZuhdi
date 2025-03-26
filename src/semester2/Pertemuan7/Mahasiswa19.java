package semester2.Pertemuan7;

public class Mahasiswa19 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa19(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi(){
        System.out.println("nim: " + nim);
        System.out.println("nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
