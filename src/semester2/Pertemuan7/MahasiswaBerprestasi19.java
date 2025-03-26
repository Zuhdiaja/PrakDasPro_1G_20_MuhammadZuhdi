package semester2.Pertemuan7;
public class MahasiswaBerprestasi19 {
    Mahasiswa19 [] ListMhs = new Mahasiswa19[5];
    int idx;

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < ListMhs.length; j++) {
            if (ListMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks " +pos);
        }
        else {
            System.out.println(("data " +x+ "tidak ditemukan"));
        }
    }
    
    void tampilDataSearch(double x, int pos){
        if (pos!=-1) {
            System.out.println("nim\t :" +ListMhs[pos].nim);
            System.out.println("nama\t :" +ListMhs[pos].nama);
            System.out.println("kelas\t :" +ListMhs[pos].kelas);
            System.out.println("ipk\t :" +x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan");
        }
    }

    void tambah (Mahasiswa19 m){
        if (idx < ListMhs.length) {
            ListMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data mahasiswa penuh");
        }
    }

    void tampil(){
        for (Mahasiswa19 m : ListMhs) {
            m.tampilInformasi();
            System.out.println("------------------------------");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left){
            mid = (left + right) / 2;
            if (cari == ListMhs[mid].ipk){
                return (mid);
            }
            else if (ListMhs[mid].ipk > cari){
                return findBinarySearch(cari, left, mid - 1);
            }
            else{
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
