import java.util.ArrayList;

public class Stack {
    private ArrayList<String> elements;
    
    public Stack(){
        this.elements=new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return elements.isEmpty();
    }
    public void add(String value){
        elements.add(value);
    }
    public ArrayList<String> values(){
        return elements;
    }
    public String take(){
        String elementToReturn=elements.get(elements.size()-1);
        elements.remove(elements.size()-1);
        return elementToReturn;
    }
}
