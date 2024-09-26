
import java.util.Scanner;

public class Latihan_Indifidu4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int usia;

        System.out.print("Masukkan usia anda: ");
        usia=sc.nextInt();

        if(usia>0 && usia<=12){
            System.out.print("usia anda adalah anak");
        }
        else if (usia>12 && usia<=19){
            System.out.print("usia anda adalah remaja");
        }
        else if (usia>19 && usia<=64){
            System.out.println("usia anda adalah dewasa");
        }
        else if (usia >64){
            System.out.print("usia anda adalah lansia");
        }

    }
}
