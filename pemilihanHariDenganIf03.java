
import java.util.Scanner;

public class pemilihanHariDenganIf03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int angka;

        System.out.print("Masukkan input bilangan bulat : ");
        angka=input.nextInt();

        if(angka>=1&&angka<=5){
            System.out.println(angka+ " is a weekday");
        }else if(angka>=6&&angka<=7){
            System.out.println(angka+" is a weekend");
        }else{
            System.out.println("invalid number");
        }
    }
    
}
