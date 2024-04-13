public class Bird {
    private String name;
    private String nameInLatin;
    private int observation;
    
    public Bird(String name, String nameInLatin){
        this.name=name;
        this.nameInLatin=nameInLatin;
        observation=0;
    }
    
    public String getName() {
        return name;
    }
    
    public String getNameInLatin() {
        return nameInLatin;
    }
    
    public int getObservation() {
        return observation;
    }
    
    public void setObservation() {
        this.observation+=1;
    }
    
    @Override
    public String toString() {
        return name + " (" + nameInLatin + "): " + observation + " observations";
    }
}
