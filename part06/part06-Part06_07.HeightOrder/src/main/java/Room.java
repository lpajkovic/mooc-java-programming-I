import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personsInRoom;
    
    public Room(){
        this.personsInRoom=new ArrayList<>();
    }
    public void add(Person person){
        this.personsInRoom.add(person);
    }
    public boolean isEmpty(){
        return this.personsInRoom.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return this.personsInRoom;
    }
    public Person shortest(){
        if(isEmpty()){
            return null;
        }
        Person shortest=this.personsInRoom.get(0);
        for(int i=1;i<this.personsInRoom.size();i++){
            if(this.personsInRoom.get(i).getHeight()<shortest.getHeight()){
                shortest=this.personsInRoom.get(i);
            }
        }
        return shortest;
    }
    public Person take(){
        if(isEmpty()){
            return null;
        }
        Person shortest=shortest();
        this.personsInRoom.remove(shortest());
        return shortest;
    }
}
