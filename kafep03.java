
import java.util.Scanner;

public class kafep03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan menu: ");
        menu=sc.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup=sc.next().charAt(0);
        System.out.print("Memasukkan jumlah: ");
        jumlah=sc.nextInt();
        System.out.print("Masukkan keaggotaan (true/false): ");
        keanggotaan=sc.nextBoolean();
        

        double hargamenu=0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargamenu=12000;
                break;
            case "teh":
                hargamenu=7000;
                break;
            case "coklat":
                hargamenu=20000;
                break;
        }
        double totalharga = hargamenu * jumlah;

        switch (ukuranCup) {
            case 's':
                break;
            case 'm':
                totalharga+=0.25*totalharga;
                break;
            case 'l':
            totalharga+=0.4*totalharga;
                break;
            default:
            System.out.println("Size yang dipilih tidak tersria  ");
            return;
        }
        double diskon = keanggotaan? 0.1:0;
        double nominalBayar= totalharga-(diskon*totalharga);

        System.out.println("Item pembelian: " +jumlah+" "+ menu +" dengan ukuran cup "+ukuranCup);
        System.out.println("Nominal bayar: "+nominalBayar);

    }
    
}
