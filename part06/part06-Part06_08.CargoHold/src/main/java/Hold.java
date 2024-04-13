import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    public Hold(int max){
        maxWeight=max;
        suitcases=new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        int suitcasesWeight=0;
        for(Suitcase s: suitcases){
            suitcasesWeight+=s.totalWeight();
        }
        if(suitcasesWeight+suitcase.totalWeight()<=maxWeight){
            suitcases.add(suitcase);
        }
        
    }
    
    public String toString(){
        String suit="suitcases";
        if(suitcases.size()==1){
            suit="suitcase";
        }
        int suitcasesWeight=0;
        for(Suitcase s: suitcases){
            suitcasesWeight+=s.totalWeight();
        }
        return suitcases.size() + " " + suit + " (" + suitcasesWeight + " kg)";
    }
    public void printItems(){
        for(Suitcase s : suitcases){
            for(Item i : s.getItems()){
                System.out.println(i);
            }
        }
    }
}
