
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String sValue=scan.nextLine();
        System.out.println("Give an integer:");
        int iValue=Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double dValue=Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bValue=Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + sValue);
        System.out.println("You gave the integer " + iValue);
        System.out.println("You gave the double " + dValue);
        System.out.println("You gave the boolean " + bValue);
    }
}
