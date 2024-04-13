
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest=0;
        String oldestName="";
        while(true){
            String input=scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            String[] data=input.split(",");
            if(Integer.valueOf(data[1])>oldest){
                oldest=Integer.valueOf(data[1]);
                oldestName=data[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
