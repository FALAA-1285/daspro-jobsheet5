
import java.util.Scanner;

public class PemilihanHari {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String dayName, Daytype;

        System.out.print("Input day name: ");
        dayName=input.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                Daytype = "weekday";
                break;
            case "saturday":
            case "sunday":
                Daytype = "weekend";
                break;
                
            default:
                Daytype = "invalid day name";               
        }
        
        System.out.println(dayName+" is a "+Daytype);
    }
}
