package Pertemuan13;

public class Kafe20 {

    public static void menu(String namaPelanggan, boolean isMember, String KodePromo) {
        System.out.println("selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        System.out.println("======== MENU RESTO KAFE ========");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 28,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    
        if (KodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("mendapatkan diskon 50%");
        } else if(KodePromo.equalsIgnoreCase(("DISKON30"))) {
            System.out.println("mendapatkan diskon 30%");
        } else  {
            System.out.println("INVALID");
        }
    }

        public static void main(String[] args){
            menu("Andi", true, "DISKON50");
            System.out.println();
            menu("Andi", true, "DISKON30");
            System.out.println();
            menu("Andi", true, "");
        }

}
