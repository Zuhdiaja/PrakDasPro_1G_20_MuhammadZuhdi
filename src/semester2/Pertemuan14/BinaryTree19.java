package semester2.Pertemuan14;

public class BinaryTree19 {
    Node19 root;

    public BinaryTree19() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa19 mahasiswa) {
        Node19 newNode = new Node19(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node19 current = root;
            Node19 parent = null;
            while (true) {
                parent  = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node19 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node19 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node19 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node19 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traverseInOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }


    Node19 getSuccessor(Node19 del) {
        Node19 successor = del.right;
        Node19 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node19 parrent = root;
        Node19 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk ==ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parrent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parrent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parrent.left = null;
                    } else {
                        parrent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parrent.left = current.right;
                    } else {
                        parrent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if ((current == root)) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parrent.left = current.left;
                    } else {
                        parrent.right = current.left;
                    }
                }
            } else {
                Node19 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parrent.left = successor;
                    } else {
                        parrent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(Mahasiswa19 mahasiswa) {
        root = addRekursi(root, mahasiswa);
    }

    Node19 addRekursi(Node19 current, Mahasiswa19 mahasiswa) {
        if (current == null) {
            return new Node19(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursi(current.left, mahasiswa);
        } else {
            current.right = addRekursi(current.right, mahasiswa);
        }
        return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("tree kosong");
            return;
        }
        Node19 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil: ");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("tree kosong");
            return;
        }
        Node19 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terkecil: ");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ": ");
        tampilMahasiswaIPKdiAtasRekursif(root, ipkBatas);
    }

    void tampilMahasiswaIPKdiAtasRekursif(Node19 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasRekursif(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilMahasiswaIPKdiAtasRekursif(node.right, ipkBatas);
        }
    }
}
