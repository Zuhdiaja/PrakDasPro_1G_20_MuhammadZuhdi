package Pertemuan7;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi = 0, total = 0, totalBayar =0, i =1;
    
        System.out.println("1. Mobil 2. Motor 0. Keluar");
        
        do{
            System.out.print("Masukkan jenis kendaraan ke " + i + " : ") ;
            jenis = sc.nextInt();

            if (jenis ==1 || jenis ==2){
                System.out.print("Masukkan durasi : ");
                durasi = sc.nextInt();
                
                if (durasi > 5){
                    total += 12500;
                } else if (jenis ==1){
                    total += durasi * 3000;
                } else if (jenis ==2){
                    total += durasi * 2000;
                }
                
                i++;
                
            }else if (jenis != 0) {
                System.out.println("Invalid sc jenis kendaraan ulang '1' atau '2' '0' untuk keluar program");
            }
            
            
        }while (jenis !=0);
        System.out.println("Anda keluar dari program");
        totalBayar += total;
        System.out.println("Total tarif parkir : " + totalBayar);

    }
}
