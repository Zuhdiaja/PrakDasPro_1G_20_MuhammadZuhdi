package semester2.Pertemuan1;
import java.util.Scanner;
public class tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char [][] kota = {
            {'B','A','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
    };

    System.out.print("masukkan kode plat: ");
    char kode = sc.next().charAt(0);

    for (int i = 0; i < kota.length; i++) {
        if (KODE[i] == kode) {
            System.out.println(kota[i]);
        }
    }
        }
}
