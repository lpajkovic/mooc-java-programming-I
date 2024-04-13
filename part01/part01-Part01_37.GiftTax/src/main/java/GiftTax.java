
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double value=Double.valueOf(scan.nextLine());
        double tax;
        if(value<5000.0){
            System.out.println("No tax!");
        }else if(value>=5000.0 && value<=25000.0){
            tax=100+(value-5000.0)*0.08;
            System.out.println("Tax: " + tax);
        }else if(value>=25000.0 && value<=55000.0){
            tax=1700+(value-25000.0)*0.10;
            System.out.println("Tax: " + tax);
        }else if(value>=55000.0 && value<=200000.0){
            tax=4700+(value-55000.0)*0.12;
            System.out.println("Tax: " + tax);
        }else if(value>=200000.0 && value<=1000000.0){
            tax=22100+(value-200000.0)*0.15;
            System.out.println("Tax: " + tax);
        }else{
            tax=142100+(value-1000000.0)*0.17;
            System.out.println("Tax: " + tax);
        }
    }
}
