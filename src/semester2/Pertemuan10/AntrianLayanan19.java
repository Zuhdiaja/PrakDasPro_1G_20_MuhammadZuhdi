package semester2.Pertemuan10;

public class AntrianLayanan19 {
    Mahasiswa19 [] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan19 (int max) {
        this.max = max;
        this.data = new Mahasiswa19[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
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

    public void tambahAntrian (Mahasiswa19 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size ++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian");
    }

    public Mahasiswa19 layanMahasiswa19 () {
        if (IsEmpty()) {
            System.out.println("Antran kosong");
            return null;
        }
        Mahasiswa19 mhs  = data[front];
        front  = (front + 1) % max;
        size --;
        return mhs;
    }

    public void lihatTerdepan () {
        if (IsEmpty()) {
            System.out.println("Antreian kosong");
        } else {
            System.out.print("mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua () {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index  = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian () {
        return size;
    }

    public void lihatAkhir () {
        if (IsEmpty()) {
            System.out.println("antrian kosong");
            return;
        }
        System.out.println("Mahasiswa Paling Belakang Dalam Antrian");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }
}
