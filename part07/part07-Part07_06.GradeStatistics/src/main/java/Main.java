
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister gradeRegister=new GradeRegister();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        while(true){
            System.out.println("Enter point totals, -1 stops:");
            int input=Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;
            }
            if(input>=0 && input<=100){
                gradeRegister.addGradeBasedOnPoints(input);
            }
        }
        
        System.out.println("Point average (all): " + gradeRegister.averageOfPoints());
        double passingAvg=gradeRegister.averageOfPointsPassing();
        if(passingAvg==-2){
            System.out.println("Point average (passing): -");
        }else{
            System.out.println("Point average (passing): " + passingAvg);
        }
        System.out.println("Pass percentage: " + gradeRegister.passingPercentage()*100);
        
        System.out.println("Grade distribution:");
        gradeRegister.printGradeDistribution();
    }
    
    
}
