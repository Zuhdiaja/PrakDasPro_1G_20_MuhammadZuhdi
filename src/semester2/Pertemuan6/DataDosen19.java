package semester2.Pertemuan6;

public class DataDosen19 {
    Dosen19[] ListDsn = new Dosen19[3];
    int idx;

    void tambah(Dosen19 d){
        if (idx<ListDsn.length) {
            ListDsn[idx]=d;
            idx++;
        } else{
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (Dosen19 d : ListDsn) {
            d.tampilInformasi();
            System.out.println("==================================");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < ListDsn.length-1; i++) {
            for (int j = 1; j < ListDsn.length-i; j++) {
                if (ListDsn[j].usia<ListDsn[j-1].usia) {
                    Dosen19 tmp = ListDsn[j];
                    ListDsn[j]=ListDsn[j-1];
                    ListDsn[j-1]=tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < ListDsn.length-1; i++) {
            int idxMax=i;
            for (int j = i+1; j < ListDsn.length; j++) {
                if (ListDsn[j].usia>ListDsn[idxMax].usia) {
                    idxMax=j;
                }
            }
            Dosen19 tmp = ListDsn[idxMax];
            ListDsn[idxMax]=ListDsn[i];
            ListDsn[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < ListDsn.length; i++) {
            Dosen19 tmp = ListDsn[i];
            int j=i;
            while (j>0 && ListDsn[j-1].usia<tmp.usia) {
                ListDsn[j]=ListDsn[j-1];
                j--;
            }
            ListDsn[j]=tmp;
        }
    }
}
