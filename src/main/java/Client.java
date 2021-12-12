import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Client {

    public static void main(String[] args) {
           System.out.println("welcome");
           //String [] fruits = {"apple" , "pineApple" , "melon"};
           //Collection<String> fruitsList = Arrays.asList("apple" , "pineApple" , "melon");
           StreamMachine streamMachine = new StreamMachine(buildList());
          // streamMachine.finderA();
           //streamMachine.finderB();
           streamMachine.finderC();
           streamMachine .streamOf();
    }

    private static Collection <Fruit> buildList(){
        return Arrays.asList(new Fruit("Melkon",20),new Fruit("apple",5) , new Fruit("pineApple", 10));
    }
}
