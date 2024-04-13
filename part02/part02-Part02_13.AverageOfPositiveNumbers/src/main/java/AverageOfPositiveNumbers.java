
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfNums=0;
        int numOfNums=0;
        
        while(true){
            
            int num=Integer.valueOf(scanner.nextLine());
            
            if(num==0){
                break;
            }else if (num>0){
                sumOfNums+=num;
                numOfNums++;
            }
        }
        
        double avg=(double)sumOfNums/numOfNums;
        if(numOfNums==0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(avg);
        }
        
    }
}
