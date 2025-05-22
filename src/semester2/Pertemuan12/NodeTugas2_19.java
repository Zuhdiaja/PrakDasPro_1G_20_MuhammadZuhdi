package semester2.Pertemuan12;

public class NodeTugas2_19 {
    int id;
    String judul;
    double rating;
    NodeTugas2_19 prev, next;

    public NodeTugas2_19 (NodeTugas2_19 prev, int id, String judul, double rating, NodeTugas2_19 next){
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
