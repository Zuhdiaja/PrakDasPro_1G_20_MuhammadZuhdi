package semester2.Pertemuan10;
public class AntrianKRS19 {
    MahasiswaKRS19 [] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahProses;

    public AntrianKRS19 (int max) {
        this.max = max;
        this.data = new MahasiswaKRS19[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahProses = 0;
    }

    public boolean IsEmpty () {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull () {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void kosongAntrian () {
        front = 0;
        rear = -1;
        size = 0;
        jumlahProses = 0;
        System.out.println("antrian KRS dikosongkan");
    }

    public void tambahAntrian (MahasiswaKRS19 mhs) {
        if (IsFull()) {
            System.out.println("Antrian KRS penuh, tidak dapat menambah");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size ++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian");
    }

    public MahasiswaKRS19 dequeue() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong, program dihentikan.");
            System.exit(1);
        }
    
        MahasiswaKRS19 mhs = data[front];
        front = (front + 1) % max;
        size--;
        jumlahProses++;
        return mhs;
    }

    public void layaniDuaMahasiswa(){
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak dapat memanggil 2 mahasiswa sekaligus.");
            return;
        }
        
        System.out.println("Memanggil 2 mahasiswa untuk proses KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
    
        MahasiswaKRS19 mhs1 = dequeue();
        MahasiswaKRS19 mhs2 = dequeue();
        mhs1.tampilkanData();
        mhs2.tampilkanData();
    }

    public void tampilkanSemua () {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong");
            return;
        }
        System.out.println("Daftar semua Antrian: ");
        for (int i = 0; i < size; i++) {
            int index  = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void duaTerdepan () {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak bisa menampilkan dua terdepan.");
            return;
        }
    
        System.out.println("2 Mahasiswa terdepan dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
    
        int index1 = front;
        int index2 = (front + 1) % max;
    
        data[index1].tampilkanData();
        data[index2].tampilkanData();
    }

    public void lihatAkhir () {
        if (IsEmpty()) {
            System.out.println("antrian kosong");
            return;
        }
        System.out.println("Antrian Paling AKhir Dalam Antrian");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian () {
        return size;
    }

    public int getJumlahProses () {
        return jumlahProses;
    }

    public void cetakMahasiswaBelumProses() {
        int totalMahasiswaPerDPA = 30;
        int belumProses = totalMahasiswaPerDPA - jumlahProses;
    
        if (belumProses <= 0) {
            System.out.println("Semua mahasiswa sudah melakukan proses KRS.");
        } else {
            System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + belumProses);
        }
    }
}
