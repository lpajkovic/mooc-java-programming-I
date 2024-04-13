
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName="";
        int yearSum=0;
        int yearNums=0;
        while(true){
            String input=scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            String[] data=input.split(",");
            yearSum+=Integer.valueOf(data[1]);
            yearNums++;
            if(data[0].length()>longestName.length()){
                longestName=data[0];
            }
            
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double)yearSum/yearNums));
    }
}
