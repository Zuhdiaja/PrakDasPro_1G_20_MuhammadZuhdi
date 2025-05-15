package semester2.Pertemuan11;

public class MahasiswaTugas19 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaTugas19 (String nim, String nama, String kelas, double ipk ){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi () {
        System.out.println(nama + "\t\t" + nim + "\t\t\t" + kelas + "\t\t\t " +  ipk);
    }
}
