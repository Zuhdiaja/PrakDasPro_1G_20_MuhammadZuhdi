package semester2.Pertemuan9;

public class Mahasiswa19 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa19(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai (int nilai){
        this.nilai = nilai;
    }
}
