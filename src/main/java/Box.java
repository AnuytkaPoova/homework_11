
import java.util.ArrayList;
import java.util.List;


public abstract class Box <T> {
    private final List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public boolean addFruit(T fruit) {
        return fruits.add(fruit);
    }

    public T pourOverFruit(T fruit) {
        return null;
    }

    public T getWeight() {
        return null;
    }

    public boolean compare(T fruit) {

        return false;
    }


}
