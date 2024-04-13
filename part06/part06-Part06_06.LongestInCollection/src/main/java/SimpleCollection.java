
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        String longestObject="";
        if(this.elements.isEmpty()){
            longestObject=null;
            return longestObject;
        }
        for(String s : this.elements){
            if(s.length()>longestObject.length()){
                longestObject=s;
            }
        }
        return longestObject;
    }

}
