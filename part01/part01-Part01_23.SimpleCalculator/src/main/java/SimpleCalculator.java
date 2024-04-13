
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int zbr=first+second;
        int od=first-second;
        int umn=first*second;
        double dij=(double)first/second;
        
        System.out.println(first + " + " + second + " = " + zbr);
        System.out.println(first + " - " + second + " = " + od);
        System.out.println(first + " * " + second + " = " + umn);
        System.out.println(first + " / " + second + " = " + dij);
    }
}
