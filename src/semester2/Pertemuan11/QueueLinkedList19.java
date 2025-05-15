package semester2.Pertemuan11;

public class QueueLinkedList19 {
    NodeTugas19 head, tail;
    int max;

    boolean IsEmpty() {
        System.out.println("antroan kosong");
        return (head == null);
    }

    boolean isFull() {
        return size() >= max;
    }

    public void clear() {
        head = null;
        tail = null;
        System.out.println("antrian telah kosong");
    }

    public int size() {
        int count = 0;
        NodeTugas19 tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    public void addFirst(MahasiswaTugas19 input) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        NodeTugas19 ndInput = new NodeTugas19(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void addLast(MahasiswaTugas19 input) {
        if (isFull()) {
            System.out.println("antrian penuh");
            return;
        }
        NodeTugas19 ndInput = new NodeTugas19(input, null);
        if (IsEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        NodeTugas19 tmp = head;
        if (IsEmpty()) {
            System.out.println("antrian kosong");
            return;
        }
        System.out.println("Mahasiswa keluar antrian " + tmp.data.nama);
        tmp = tmp.next;

        if (tmp == null) {
            tail = null;
        }
    }

    public void peek() {
        NodeTugas19 tmp = head;
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan: " + tmp.data.nama);
        }
    }

    public void peekTail() {y
        NodeTugas19 tmp = tail;
        if (IsEmpty()) {
            System.out.println("antrian Kosong");
        } else {
            System.out.println("Mahasiswa terakhir: " + tmp.data.nama);
        }
    }

public void print() {
    if (IsEmpty()) {
        System.out.println("antrian kosong");
        return;
    }
    System.out.println("isi antrian: ");
    NodeTugas19 tmp = head;
    while (tmp != null) {
        tmp.data.tampilkanInformasi();
        tmp = tmp.next;
    }
    System.out.println("");
}


}

