
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int numofNums=0;
        
        try(Scanner input=new Scanner(Paths.get(file))){
            while(input.hasNextLine()){
                int num=Integer.valueOf(input.nextLine());
                if(num>=lowerBound && num<=upperBound){
                    numofNums++;
                }
            }
            System.out.println("Numbers: " + numofNums);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
