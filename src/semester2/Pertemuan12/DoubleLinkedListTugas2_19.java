package semester2.Pertemuan12;

public class DoubleLinkedListTugas2_19 {
    NodeTugas2_19 head, tail;
    int size;

    public boolean IsEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        if (IsEmpty()) {
            head = new NodeTugas2_19(null, id, judul, rating, null);
        } else {
            NodeTugas2_19 newNode = new NodeTugas2_19(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        if (IsEmpty()) {
            addFirst(id, judul, rating);
        } else {
            NodeTugas2_19 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeTugas2_19 newNode = new NodeTugas2_19(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int id, String judul, double rating, int index) throws Exception {
        if (IsEmpty()) {
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            NodeTugas2_19 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeTugas2_19 newNode = new NodeTugas2_19(null, id, judul, rating, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeTugas2_19 newNode = new NodeTugas2_19(current.prev, id, judul, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public void print() {
        if (!IsEmpty()) {
            NodeTugas2_19 tmp = head;
            while (tmp != null) {
            System.out.println("=============================");
            System.out.println("ID: " + tmp.id);
            System.out.println("Judul Film: " + tmp.judul);
            System.out.println("Rating: " + tmp.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            System.out.println(head.judul + " telah dihapus");
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            System.out.println(head.judul + " telah dihapus");
            head = null;
            size--;
            return;
        }
        NodeTugas2_19 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println(current.judul + " telah dihapus");
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (IsEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeTugas2_19 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            System.out.println(current.judul + " telah dihapus");
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void search(int id) {
        NodeTugas2_19 tmp = head;
        boolean found = false;
        while (tmp != null) {
            if (tmp.id == id) {
                System.out.println("ID: " + tmp.id);
                System.out.println("Judul Film: " + tmp.judul);
                System.out.println("Rating: " + tmp.rating);
                found = true;
            }
            tmp = tmp.next;
        }
        if (!found) {
            System.out.println("data tidak ditemukan");
        }
    }

    public void desceding() {
        if (!IsEmpty()) {
            for (int i = 0; i < size - 1; i++) {
            NodeTugas2_19 current = head;
                for (int j = 0; j < size - i - 1; j++) {
                    if (current.next != null && current.rating < current.next.rating) {
                        int tempId = current.id;
                        String tempJudul = current.judul;
                        Double tempRating = current.rating;

                        current.id = current.next.id;
                        current.judul = current.next.judul;
                        current.rating = current.next.rating;

                        current.next.id = tempId;
                        current.next.judul = tempJudul;
                        current.next.rating = tempRating;
                    }
                    current = current.next;
                }
            }
        }
    }
}

