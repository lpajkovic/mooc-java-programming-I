import java.util.ArrayList;

public class Recipe {
    private ArrayList<String> ingredients;
    private String name;
    private int cookingTime;
    
    public Recipe(ArrayList<String> ingredients, String name, int cookingTime) {
        this.ingredients = ingredients;
        this.name = name;
        this.cookingTime = cookingTime;
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCookingTime() {
        return cookingTime;
    }
    
    
    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
}
