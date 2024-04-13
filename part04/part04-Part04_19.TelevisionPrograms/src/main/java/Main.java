import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int maxDur=0;
        while(true){
            String name=scanner.nextLine();
            if(name.isEmpty()){
                System.out.println("Program's maximum duration?");
                maxDur= Integer.valueOf(scanner.nextLine());
                break;
            }
            System.out.println("Duration: ");
            int duration=Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name,duration));
        }
        
        for(TelevisionProgram t : programs){
            if(t.getDuration()<=maxDur){
                System.out.println(t);
            }
        }
    }
}
