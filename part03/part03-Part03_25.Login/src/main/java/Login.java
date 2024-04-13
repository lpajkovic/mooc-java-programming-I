
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String usr=scanner.nextLine();
        System.out.print("Enter password: ");
        String ps=scanner.nextLine();
        
        if(usr.equals("alex") && ps.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        }else if(usr.equals("emma") && ps.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }
    }
}
