import java.util.Scanner;

public class TextUI {
    private SimpleDictionary simpleDictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command=scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(command.equals("add")){
                System.out.println("Word:");
                String word=scanner.nextLine();
                System.out.println("Translation: ");
                String translation=scanner.nextLine();
                simpleDictionary.add(word, translation);
            }else if(command.equals("search")){
                System.out.println("To be translated: ");
                String translated=scanner.nextLine();
                if(simpleDictionary.translate(translated)==null){
                    System.out.println("Word " + translated + " was not found");
                }else{
                    System.out.println("Translation: " + simpleDictionary.translate(translated));
                }
            }
            else{
                System.out.println("Unknown command");
            }
        }
        
    }
}
