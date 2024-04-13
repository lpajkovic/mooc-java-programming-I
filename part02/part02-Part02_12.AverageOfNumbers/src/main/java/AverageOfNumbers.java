
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfNums=0;
        int numOfNums=0;
        
        while(true){
            System.out.println("Give a number:");
            int num=Integer.valueOf(scanner.nextLine());
            
            if(num==0){
                break;
            }else{
                sumOfNums+=num;
                numOfNums++;
            }
        }
        
        double avg=(double)sumOfNums/numOfNums;
        
        System.out.println("Average of the numbers: " + avg);
    }
}
