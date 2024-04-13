
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archiveList=new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop");
            String identifier=scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop");
            String name=scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            Item i=new Item(identifier,name);
            if(!(archiveList.contains(i))){
                archiveList.add(i);
            }
        }
        
        System.out.println("==Items==");
        for(Item i : archiveList){
            System.out.println(i.getIdentifier() + ": " + i.getName());
        }

    }
}
