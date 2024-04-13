import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int weight){
        items=new ArrayList<>();
        maxWeight=weight;
    }
    public void addItem(Item item){
        
        if(item.getWeight()+totalWeight()<=maxWeight){
            items.add(item);
        }
        
    }
    public String toString(){
        String formatItem="items";
        if(items.size()==1){
            formatItem="item";
        }
        if(items.isEmpty()){
            return "no items (0 kg)";
        }
        return items.size() + " " + formatItem + " (" + totalWeight() + " kg)";
    }
    public void printItems(){
        if(items.isEmpty()){
            System.out.println("no items (0 kg)");
            return;
        }
        for(Item i : items){
            System.out.println(i);
        }
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }
    
    public int totalWeight(){
        int sumWeight=0;
        for(Item i : items){
            sumWeight+=i.getWeight();
        }
        return sumWeight;
    }
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviest=items.get(0);
        for(int i=1;i<items.size();i++){
            if(items.get(i).getWeight()>heaviest.getWeight()){
                heaviest=items.get(i);
            }
        }
        return heaviest;
    }
}
