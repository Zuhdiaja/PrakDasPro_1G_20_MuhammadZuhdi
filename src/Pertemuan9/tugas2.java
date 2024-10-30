package Pertemuan9;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPoliteknik, cabor, atlet1 = "", atlet2 = "", atlet3 = "", atlet4 = "", atlet5 = "";

        System.out.print("masukkan jumlah politeknik = ");
        int jmlPoliteknik = sc.nextInt();
        sc.nextLine();

        System.out.println();

        for (int i = 1; i <= jmlPoliteknik; i++) {
            System.out.print("nama poltek = ");
            namaPoliteknik = sc.nextLine();

            for (int j = 1; j <= 4; j++) {
                System.out.print("cabor olahraga : ");
                cabor = sc.nextLine();

                for (int k = 1; k <= 5; k++) {
                    System.out.print("masukkan atlit ke-" + k + " = ");

                    if (k == 1) {
                        atlet1 = sc.nextLine();
                    } else if (k == 2) {
                        atlet2 = sc.nextLine();
                    } else if (k == 3) {
                        atlet3 = sc.nextLine();
                    }else if (k == 4) {
                        atlet4 = sc.nextLine();
                    }else if (k == 5) {
                        atlet5 = sc.nextLine();
                    }
                }

                    System.out.println(namaPoliteknik + " cabor: " + cabor);
                    System.out.println("Atlet yang mengikuti : ");
                    System.out.println("1. " + atlet1);
                    System.out.println("2. " + atlet2);
                    System.out.println("3. " + atlet3);
                    System.out.println("4. " + atlet4);
                    System.out.println("5. " + atlet5);

            }

        }
    }
}
