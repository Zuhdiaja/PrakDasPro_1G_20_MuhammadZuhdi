package semester2.Pertemuan12;

public class NodeTugas1_19 {
    int nomor;
    String nama;
    NodeTugas1_19 prev, next;

    NodeTugas1_19(int nomor, String nama, NodeTugas1_19 prev, NodeTugas1_19 next) {
        this.nomor = nomor;
        this.nama = nama;
        this.prev = prev;
        this.next = next;
    }
}
