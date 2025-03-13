package semester2.Pertemuan5;

public class NilaiMahasiswa19 {
    int uts[];
    int uas[];

    NilaiMahasiswa19 (int uts[], int uas[]){
        this.uts = uts;
        this.uas = uas;
    }

    int UTSTertinggi (int l, int r){
        if (l==r) {
            return uts[l];
        }
        int mid = (l+r)/2;
        int LutsTertinggi = UTSTertinggi(l, mid);
        int RutsTertinggi = UTSTertinggi(mid + 1, r);
        
        if (LutsTertinggi > RutsTertinggi) {
            return LutsTertinggi;
        } else {
            return RutsTertinggi;
        }
    }

    int UTSTerendah (int l, int r){
        if (l==r) {
            return uts[l];
        }
        int mid = (l+r)/2;
        int LutsTerendah = UTSTerendah( l, mid);
        int RutsTerendah = UTSTerendah(mid+1, r);

        if (LutsTerendah < RutsTerendah) {
            return LutsTerendah;
        } else {
            return RutsTerendah;
        }
    }

    double rataUAS(){
        double total = 0;
        for (int i = 0; i < uas.length; i++) {
            total += uas[i];
        }
        return total/uas.length;
    }
}