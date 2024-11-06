package Pertemuan10;
import java.util.Scanner;

public class tugas3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
    "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolatte Ice"};
    String key;
    String hasil = "";
    
    System.out.print("makanan yang ingin dicari : ");
    key = sc.nextLine();

    for (String cari : menu) {
        if (cari.equalsIgnoreCase(key)) {
            hasil = cari;
            break;
        }
    }

    if (hasil!=("")) {
        System.out.println(key);
    } else {
        System.out.println("makanan tidak ditemukan");
    }
}
}
