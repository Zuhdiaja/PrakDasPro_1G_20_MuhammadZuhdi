package semester2.Pertemuan2;

public class MataKuliah20 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("kode MK : " + kodeMK);
        System.out.println("nama : " + nama);
        System.out.println("sks : " + sks);
        System.out.println("jumlah jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah : " + sks);
    }

    void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("jam ditambakankan menjadi : " + jumlahJam);
    }

    void kurangiJam(int jam){
        if (jam > jumlahJam) {
            System.out.println("jam tidak dapat dikurangi menjadi");
        } else  {
            jumlahJam -= jam;
            System.out.println("jam dikurangi menjadi : " + jumlahJam);
        }
    }

    public MataKuliah20(){

    }

    public MataKuliah20(String kodeMK, String nm, int sks, int jmlJam){
        nama = nm;
        this.kodeMK = kodeMK;
        this.sks = sks;
        jumlahJam = jmlJam;

    }
}

