package Pertemuan6;
import java.util.Scanner;

public class tugasP6_3_20 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        String merek, kategori;
        byte ukuran;

        System.out.print("Masukkan merek (converse/Sketcher/nike): ");
        merek = input20.nextLine();
        System.out.print("Masukkan kategori: ");
        kategori = input20.nextLine();
        System.out.print("Masukkan ukuran: ");
        ukuran = input20.nextByte();

        if (merek.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        System.out.println("Harga: 800.000");
                    } else {
                        System.out.println("Ukuran tidak valid untuk kategori Slip On.");
                    }
                } else {
                    System.out.println("Ukuran tidak valid untuk kategori Slip On.");
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        System.out.println("Harga: 1.200.000");
                    } else {
                        System.out.println("Ukuran tidak valid untuk kategori High Top.");
                    }
                } else {
                    System.out.println("Ukuran tidak valid untuk kategori High Top.");
                }
            } else {
                System.out.println("Kategori tidak valid untuk merek Converse.");
            }

        } else if (merek.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        System.out.println("Harga: 1.000.000");
                    } else {
                        System.out.println("Ukuran tidak valid untuk kategori Woman.");
                    }
                } else {
                    System.out.println("Ukuran tidak valid untuk kategori Woman.");
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        System.out.println("Harga: 1.800.000");
                    } else {
                        System.out.println("Ukuran tidak valid untuk kategori Man.");
                    }
                } else {
                    System.out.println("Ukuran tidak valid untuk kategori Man.");
                }
            } else {
                System.out.println("Kategori tidak valid untuk merek Sketcher.");
            }

        } else if (merek.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kid")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        System.out.println("Harga: 750.000");
                    } else {
                        System.out.println("Ukuran tidak valid untuk kategori kid.");
                    }
                } else {
                    System.out.println("Ukuran tidak valid untuk kategori kid.");
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        System.out.println("Harga: 1.500.000");
                    } else {
                        System.out.println("Ukuran tidak valid untuk kategori Adult.");
                    }
                } else {
                    System.out.println("Ukuran tidak valid untuk kategori Adult.");
                }
            } else {
                System.out.println("Kategori tidak valid untuk merek Nike.");
            }
        
        } else {
            System.out.println("Merek tidak valid.");
        }
    }
}
