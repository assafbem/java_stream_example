import java.util.*;
import java.util.stream.Stream;

public final class StreamMachine {

    private final Collection<Fruit> fruits;
    private Stream<String> streamEmpty = Stream.empty();

    public StreamMachine (Collection fruits){
        this.fruits = fruits;

    }

     void finderA (){
        for (Fruit fruit: fruits){
            System.out.println(fruit);
        }
     }

    void finderB (){

        System.out.println(fruits.stream().count());
        fruits.stream()
                .filter(fruit -> fruit.getFruitName().contains("a"))
                .map(fruit -> fruit.getFruitName().charAt(2))
                .forEach(s -> System.out.println(s));
    }

    void finderC (){
       fruits.stream()
                .sorted(Comparator.comparingInt(Fruit::getSize))
             // .filter(fruit -> fruit.getFruitName().contains("a"))
                .map(fruit -> fruit.getFruitName().toUpperCase())
                .forEach(fruit -> System.out.println(fruit));
    }

    public Stream <String> streamOf (){

        Collection<String>  listOfStrings = Arrays.asList("tov" , "meod", "tov");
        streamEmpty = listOfStrings.stream();

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        streamOfCollection.distinct();
        streamOfCollection.forEach(s -> System.out.println(s));
        return streamOfCollection;
    }
}
