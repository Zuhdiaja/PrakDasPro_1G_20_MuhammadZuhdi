package semester2.Pertemuan2;

public class dosenMain20 {

    public static void main(String[] args) {
        dosen20 dsn1 = new dosen20();
        dsn1.IdDosen = "1";
        dsn1.nama = "Faiq Nurahman";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Agama";
        

        dsn1.tampilkanInformasi();
        System.out.println("masa kerja:" + dsn1.hitungMasaKerja(2025));
        System.out.println("==============================");

        dsn1.ubahKeahlian("PAI");
        dsn1.setStatusAktif(false);

        dsn1.tampilkanInformasi();
        System.out.println("masa kerja:" + dsn1.hitungMasaKerja(2025));

        System.out.println("===========================");

        dosen20 dsn2 = new dosen20("3", "Ihsan Rahmat", false, 2005, "Pancasila");
        dsn2.IdDosen = "2";
        dsn2.tampilkanInformasi();
        System.out.println("masa kerja:" + dsn2.hitungMasaKerja(2025));
        System.out.println("================================");
    }
}
