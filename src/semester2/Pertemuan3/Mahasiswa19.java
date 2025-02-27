package semester2.Pertemuan3;

public class Mahasiswa19 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

public Mahasiswa19(String nim, String nama, String kelas, float ipk){
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
}

public Mahasiswa19() {
    this.nim = "244107019017";
    this.nama = "Zuhdi";
    this.kelas = "1G";
    this.ipk = 3.5f;
}

    public void cetakInfo (){
            System.out.println("Nama    : " + nama);
            System.out.println("kelas   : " + kelas);
            System.out.println("IPK     : " + ipk);
            System.out.println("------------------------------------");
        }
    }



