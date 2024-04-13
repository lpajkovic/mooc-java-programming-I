import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    private Cookbook cookbook;
    private Scanner scanner;
    
    public UserInput(){
        this.cookbook=new Cookbook();
        this.scanner=new Scanner(System.in);
    }
    
    public void start(){
        System.out.println("File to read: ");
        String file=scanner.nextLine();
        
        try(Scanner sc=new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String recipeName=sc.nextLine();
                int cookingTime=Integer.valueOf(sc.nextLine());
                ArrayList<String> tempIngredients=new ArrayList<>();
                while(sc.hasNextLine()){
                    String ingredient=sc.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    tempIngredients.add(ingredient);
                }
                cookbook.addRecipe(new Recipe(tempIngredients,recipeName,cookingTime));
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipe by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        
        while(true){
            System.out.println();
            System.out.println("Enter command:");
            String command=scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }else if(command.equals("list")){
                cookbook.printRecipes();
            }else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String word=scanner.nextLine();
                cookbook.findRecipeByWord(word);
            }else if(command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time=Integer.valueOf(scanner.nextLine());
                cookbook.findRecipeByCookingTime(time);
            }else if(command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient=scanner.nextLine();
                cookbook.findRecipesWithIngredient(ingredient);
            }
            
            
        }
    }
    
    

}
