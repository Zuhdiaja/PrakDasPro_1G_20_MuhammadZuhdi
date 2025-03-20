package semester2.Pertemuan6;

public class MahasiswaBerprestasi19 {
    Mahasiswa19 [] ListMhs = new Mahasiswa19[3];
    int idx;

    void tambah(Mahasiswa19 m){
        if (idx<ListMhs.length) {
            ListMhs[idx]=m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (Mahasiswa19 m : ListMhs) {
            m.tampilInformasi();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            for (int j = 1; j < ListMhs.length-i; j++) {
                if (ListMhs[j].ipk>ListMhs[j-1].ipk) {
                    Mahasiswa19 tmp = ListMhs[j];
                    ListMhs[j]=ListMhs[j-1];
                    ListMhs[j-1]=tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < ListMhs.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < ListMhs.length; j++) {
                if (ListMhs[j].ipk<ListMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa19 tmp = ListMhs[idxMin];
            ListMhs[idxMin]=ListMhs[i];
            ListMhs[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < ListMhs.length; i++) {
            Mahasiswa19 temp = ListMhs[i];
            int j=i;
            while (j>0 && ListMhs[j-1].ipk<temp.ipk) {
                ListMhs[j]=ListMhs[j-1];
                j--;
            }
            ListMhs[j]=temp;
        }
    }
}


