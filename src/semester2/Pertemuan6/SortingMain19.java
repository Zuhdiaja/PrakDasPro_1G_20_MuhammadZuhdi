package semester2.Pertemuan6;

public class SortingMain19 {
    public static void main(String[] args) {
    int a[] = {20,10,2,7,12};
    int b[] = {30,20,2,8,14};
    int c[] = {40,10,4,9,3};
    Sorting19 Dataurut1 = new Sorting19(a, a.length);
    Sorting19 Dataurut2 = new Sorting19(b, b.length);
    Sorting19 Dataurut3 = new Sorting19(c, c.length);

    System.out.println("Data awal 1");
    Dataurut1.tampil();
    Dataurut1.bubbleshort();
    System.out.println("Data Sudah diurutkan dengan BUBBLE SORT (ASC)");
    Dataurut1.tampil();

    System.out.println("================================");

    System.out.println("Data awal 2");
    Dataurut2.tampil();
    Dataurut2.SelectionSort();
    System.out.println("Data Sudah diurutkan dengan SELECTION SORT (ASC)");
    Dataurut2.tampil();

    System.out.println("================================");

    System.out.println("Data awal 3");
    Dataurut3.tampil();
    Dataurut3.SelectionSort();
    System.out.println("Data Sudah diurutkan dengan INSERTION SORT (ASC)");
    Dataurut3.tampil();
    }
}

