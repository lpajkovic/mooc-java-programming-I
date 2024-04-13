
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName=scanner.nextLine();
        
        try(Scanner fileScan=new Scanner(Paths.get(fileName))){
            while(fileScan.hasNextLine()){
                String line=fileScan.nextLine();
                
                String[] parts=line.split(",");
                String name=parts[0];
                int year=Integer.valueOf(parts[1]);
                String yearName="";
                if(year==1){
                    yearName="year";
                }else{
                    yearName="years";
                }
                
                System.out.println(name + ", age: " + year + " " + yearName);
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
