package semester2.Pertemuan2;

public class dosen20 {
    String IdDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    
    void tampilkanInformasi(){
        System.out.println("ID Dosen : " + IdDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status : " + (statusAktif == true ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }
    
    void setStatusAktif(boolean Status){
        statusAktif = Status;
    }

    int hitungMasaKerja(int thnSkr){
        return thnSkr - tahunBergabung;
    
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }

    public dosen20() {

    }

    public dosen20(String IdDosen, String nm, boolean statusAktif, int thnBergabung, String bdKeahlian){
        nama = nm;
        this.IdDosen = IdDosen;
        this.statusAktif = statusAktif;
        tahunBergabung = thnBergabung;
        bidangKeahlian = bdKeahlian;
    }



}
