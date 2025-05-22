package semester2.Pertemuan12;

public class DoubleLinkedListTugas1_19 {
    NodeTugas1_19 head, tail;
    int size;

    public DoubleLinkedListTugas1_19() {
        head = tail = null;
        size = 0;
    }

    public boolean IsEmpty() {
        return head == null;
    }

    public void addFirst(int nomor, String nama) {
        if (IsEmpty()) {
            head = new NodeTugas1_19(nomor, nama, null, null);
        } else {
            NodeTugas1_19 newNode = new NodeTugas1_19(nomor, nama, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nomor, String nama) {
        if (IsEmpty()) {
            addFirst(nomor, nama);
        } else {
            NodeTugas1_19 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeTugas1_19 newNode = new NodeTugas1_19(nomor, nama, current, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int nomor, String nama, int index) throws Exception {
        if (IsEmpty()) {
            addFirst(nomor, nama);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            NodeTugas1_19 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeTugas1_19 newNode = new NodeTugas1_19(nomor, nama, null, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeTugas1_19 newNode = new NodeTugas1_19(nomor, nama, current.prev, current);
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
            NodeTugas1_19 tmp = head;
            System.out.println("|No.       |Nama               |");
            while (tmp != null) {
                System.out.println("|" + tmp.nomor + "       |" + tmp.nama + "               |");
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
            System.out.println(head.nama + " telah selesai di vaksinasi");
            removeLast();
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeTugas1_19 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (IsEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeTugas1_19 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
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

    public int getFirst() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.nomor;
    }
    
    public int getLast() throws Exception {
        if (IsEmpty()) {
            throw new Exception("Linked List kosong");
        }
        NodeTugas1_19 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.nomor;
    }

    public int get(int index) throws Exception {
        if (IsEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        NodeTugas1_19 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.nomor;
    }
}

