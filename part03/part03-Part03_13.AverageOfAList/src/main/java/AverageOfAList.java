
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> nums=new ArrayList<>();
        int sum=0;
        while(true){
            int input=Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;
            }
            nums.add(input);
            sum+=input;
        }
        
        System.out.println("Average: " + (double)sum/nums.size());
        
    }
}
