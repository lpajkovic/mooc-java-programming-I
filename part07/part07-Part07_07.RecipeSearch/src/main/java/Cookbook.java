import java.util.ArrayList;

public class Cookbook {
    private ArrayList<Recipe> recipes;
    
    public Cookbook(){
        this.recipes=new ArrayList<>();
    }
    
    public void addRecipe(Recipe r){
        this.recipes.add(r);
    }
    
    public void printRecipes(){
        System.out.println();
        System.out.println("Recipes:");
        for(Recipe r : recipes){
            System.out.println(r);
        }
    }
    
    public void findRecipeByWord(String word) {
        System.out.println();
        System.out.println("Recipes:");
        for(Recipe r : recipes){
            if(r.getName().contains(word)){
                System.out.println(r);
            }
        }
    }
    
    public void findRecipeByCookingTime(int time) {
        System.out.println();
        System.out.println("Recipes:");
        for(Recipe r : recipes){
            if(r.getCookingTime()<=time){
                System.out.println(r);
            }
        }
    }
    
    public void findRecipesWithIngredient(String ingredient) {
        System.out.println();
        System.out.println("Recipes:");
        boolean flag=false;
        for(Recipe r: recipes){
            if(r.getIngredients().contains(ingredient)){
                System.out.println(r);
            }
        }
    }
}
