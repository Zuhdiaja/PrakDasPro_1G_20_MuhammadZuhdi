package semester2.Pertemuan3;
public class DataDosen19 {
    
    public void dataSemuaDoosen (Dosen19[] arrayOfDosen19){
        
        int i = 1;
        for (Dosen19 dosen19 : arrayOfDosen19) {
            System.out.println("Data Dosen ke-" + (i));
            System.out.println("Kode          : " + dosen19.kode);
            System.out.println("Nama          : " + dosen19.nama);
            System.out.println("Jenis Kelamin : " + (dosen19.jenisKelamin ? "pria" : "wanita"));
            System.out.println("Usia          : " + dosen19.usia);
            System.out.println("-------------------------------");
            i++;
        }
    }

    public void jumlahDosenPerJenisKelamin (Dosen19 [] arrayOfDosen19){
        int pria = 0;
        int wanita = 0;

        for (Dosen19 dosen19 : arrayOfDosen19) {
            if (dosen19.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("Jumlah Dosen Pria   : " + pria);
    }

    public void rerataUsiaDosenPerJenisKelamin (Dosen19 [] arrayOfDosen19){
        int pria = 0;
        int wanita = 0;
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;

        for (Dosen19 dosen19 : arrayOfDosen19) {
            if (dosen19.jenisKelamin) {
                wanita++;
                totalUsiaWanita += dosen19.usia;
            } else {
                pria++;
                totalUsiaPria += dosen19.usia;
            }
        }
        System.out.println("Rerata Usia Dosen Wanita : " + (totalUsiaWanita / wanita));
        System.out.println("Rerata Usia Dosen Pria   : " + (totalUsiaPria / pria));
    }

    public void infoDosenPalingTua (Dosen19[] arrayOfDosen19){
        Dosen19 dosenTertua = arrayOfDosen19[0];

        for (Dosen19 dosen19 : arrayOfDosen19) {
            if (dosen19.usia > dosenTertua.usia) {
                dosenTertua = dosen19;
            }
        }
        System.out.println("Dosen Tertua");
        System.out.println("Kode          : " + dosenTertua.kode);
        System.out.println("Nama          : " + dosenTertua.nama);
        System.out.println("Jenis Kelamin : " + (dosenTertua.jenisKelamin ? "pria" : "wanita"));
        System.out.println("Usia          : " + dosenTertua.usia);
    }

    public void infoDosenPalingMuda (Dosen19 [] arrayOfDosen19){
        Dosen19 dosenTermuda = arrayOfDosen19[0];

        for (Dosen19 dosen19 : arrayOfDosen19) {
            if (dosen19.usia < dosenTermuda.usia) {
                dosenTermuda = dosen19;
            }
        }
        System.out.println("Dosen Termuda");
        System.out.println("Kode          : " + dosenTermuda.kode);
        System.out.println("Nama          : " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin : " + (dosenTermuda.jenisKelamin ? "pria" : "wanita"));
        System.out.println("Usia          : " + dosenTermuda.usia);
    }
}
