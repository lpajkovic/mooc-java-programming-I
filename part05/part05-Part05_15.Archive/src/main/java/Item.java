import java.util.Objects;

public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier() {
        return identifier;
    }
    
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return this.identifier.equals(item.identifier);
    }
    
}
