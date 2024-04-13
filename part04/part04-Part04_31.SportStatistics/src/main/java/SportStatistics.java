
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file=scan.nextLine();
        System.out.println("Team:");
        String team=scan.nextLine();
        
        try(Scanner fileScan=new Scanner(Paths.get(file))){
            int numOfGames=0;
            int wins=0;
            int losses=0;
            while(fileScan.hasNextLine()){
                String[] parts=fileScan.nextLine().split(",");
                int homePoints=Integer.valueOf(parts[2]);
                int awayPoints=Integer.valueOf(parts[3]);
                if(parts[0].equals(team)){
                    numOfGames++;
                    if(homePoints>awayPoints){
                        wins++;
                    }else{
                        losses++;
                    }
                }else if(parts[1].equals(team)){
                    numOfGames++;
                    if(homePoints<awayPoints){
                        wins++;
                    }else{
                        losses++;
                    }
                }
                
            }
            System.out.println("Games: " + numOfGames);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
