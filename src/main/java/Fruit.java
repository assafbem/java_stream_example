
public class Fruit {
    private String name;
    private int size;
    private Enum type;

    public Fruit (String name,int size){
        this.name = name;
        this.size = size;
    }
    public String getFruitName (){
        return this.name;
    }

    public int getSize() {
        return size;
    }
  }
