
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        ArrayList<String> fileLines=new ArrayList<>();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner fileScan=new Scanner(Paths.get(file))){
            boolean flag=false;
            while(fileScan.hasNextLine()){
                if(fileScan.nextLine().equals(searchedFor)){
                    System.out.println("Found!");
                    flag=true;
                }
            }
            if(!flag){
                System.out.println("Not found.");
            }
        } catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        

    }
}
