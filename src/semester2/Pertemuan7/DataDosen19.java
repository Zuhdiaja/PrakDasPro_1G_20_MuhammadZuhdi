package semester2.Pertemuan7;

public class DataDosen19 {
    Dosen19 [] ListDsn = new Dosen19[5];
    int idx;

    void tambah (Dosen19 m){
        if (idx < ListDsn.length) {
            ListDsn[idx] = m;
            idx++;
        } else {
            System.out.println("Data dosen penuh");
        }
    }

    void tampil(){
        for (Dosen19 m : ListDsn) {
            m.tampilInformasi();
            System.out.println("------------------------------");
        }
    }

    int sequentialSearching(String cari){
        int posisi = -1;
        int count = 0;

        for (int j = 0; j < ListDsn.length; j++) {
            if (ListDsn[j].nama.equalsIgnoreCase(cari)) {
                if (posisi == -1) {
                posisi=j;
                }
                count ++;
            }
        }
            if (count == 0) {
                System.out.println("nama dosen " +cari+ " tidak ditemukan");
            }else if (count > 1) {
                System.out.println("Ditemukan lebih dari satu dosen dengan nama: " +cari);
                System.out.println();
            } else {
                System.out.println("data ditemukan pada index: " +posisi);
            }
        return posisi;
    }

    int findBinarySearch(int cariUsia, int left, int right){
        int mid = 0;
        if (right>=left) {
            mid = (left+right)/2;

            if (ListDsn[mid].usia == cariUsia) {
                System.out.println("Dosen dengan usia " + cariUsia + " ditemukan.");
                System.out.println();
            
            int count = 1;
            if (mid > 0 && ListDsn[mid - 1].usia == cariUsia) {
                count++;
            }
            if (mid < right && ListDsn[mid + 1].usia == cariUsia) {
                count++;
            }

            if (count > 1) {
                System.out.println("Ditemukan lebih dari satu dosen dengan usia " + cariUsia);
                System.out.println();
            }

                return (mid);
            } else if (ListDsn[mid].usia > cariUsia) {
                return findBinarySearch(cariUsia, left, mid -1);
            } else {
                return findBinarySearch(cariUsia, mid +1, right);
            }
        }
            System.out.println("Usia dosen " + cariUsia + " tidak ditemukan.");
            System.out.println();
            return -1;
    }
}
