package semester2.Pertemuan2;

public class MataKuliahMain20 {
    public static void main(String[] args) {
        MataKuliah20 MHS1 = new MataKuliah20();
        MHS1.kodeMK = "RTI242008";
        MHS1.nama = "Algoritma Dan Struktur Data";
        MHS1.sks = 3;
        MHS1.jumlahJam = 6;
        MHS1.tampilkanInformasi();
        System.out.println("=============================");

        MHS1.ubahSKS(2);
        MHS1.tambahJam(2);
        MHS1.kurangiJam(1);

        System.out.println("=============================");
        MHS1.tampilkanInformasi();
        System.out.println("=============================");
        
        MataKuliah20 MHS2 = new MataKuliah20("RTI242006", "Basis Data", 3, 4);
        MHS2.ubahSKS(2);
        MHS2.kurangiJam(1);

        System.out.println("==============================");
        MHS2.tampilkanInformasi();

    }
}
