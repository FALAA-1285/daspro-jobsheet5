import java.util.Scanner;

public class PemilihanBilangan03{
    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka =input.nextInt();
        String hasil;

        hasil=(angka%2==0)?"bilangan positif":"bilangan negatif";
        System.out.println("Bilangan "+angka+" adalah "+hasil);

    }
}