package semester2.Pertemuan1;
import java.util.Scanner;
public class fungsi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bunga [][] ={
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };

    int harga [] = {75000, 50000, 60000, 10000 };
    String cabang [] = {"Royal garden 1", "Royal Garden 2", "royal Garden 3", "royal garden 4"};

    System.out.println("pendapatan");
    for (int i = 0; i < bunga.length; i++) {
        int pendapatan = totalPendapatan(bunga[i],harga);
        System.out.println(cabang[i] + ": Rp" + pendapatan);
    }

    System.out.println("tampilkan stock: ");
    totalStock(bunga);

    int [] mati = {-1, -2, -0, -5};
    kurangStock(bunga, mati);
    }

    public static int totalPendapatan(int[] stockC, int[] harga) {
        int total = 0;
        for (int i = 0; i < stockC.length; i++) {
            total += stockC[i] * harga[i];
        }
        return total;
    }

    public static void totalStock (int [][]bunga){
    int aglonema = 0, keladi = 0, alocasia = 0, mawar = 0;
    
    for (int i = 0; i < bunga.length; i++) {
        aglonema += bunga[i][0];
        keladi += bunga[i][1];
        alocasia += bunga[i][2];
        mawar += bunga[i][3];
    }

    System.out.println("- Aglonema: " + aglonema + " pot");
    System.out.println("- Keladi  : " + keladi + " pot");
    System.out.println("- Alocasia: " + alocasia + " pot");
    System.out.println("- Mawar   : " + mawar + " pot");
    }
    
    public static void kurangStock(int [][] bunga, int [] mati){
        int i = 3;
        System.out.println(" stok Royal Garden 4:");
        for (int j = 0; j < bunga[i].length; j++) {
            bunga[i][j] += mati[j];
            System.out.println("- Bunga ke-" + (j + 1) + ": " + bunga[i][j] + " pot");
        }
    }

}


