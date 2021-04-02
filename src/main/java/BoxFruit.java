import java.util.*;

public class BoxFruit <T extends Fruit & Packable>{
    private final List<T> fruits;

    public BoxFruit() {
        fruits = new ArrayList<>();
    }

    public boolean addFruit(T fruit) {
        return fruits.add(fruit);
    }

    public void pourOverFruit(BoxFruit boxFruit) {
        if (!this.fruits.isEmpty()) {
            for (int i = 0; i < this.fruits.size(); i++) {
                boxFruit.addFruit(this.fruits.get(i));

            }

            this.fruits.removeAll(this.fruits);
        }
    }

    public float getWeightFull() {
        if (!fruits.isEmpty()){
            float sum = 0;
            for(int i = 0; i<fruits.size(); i++){
                sum += fruits.get(i).getWeightFruits();
            }
            return sum;
        }
        return 0;
    }
    public void getWeightFullPrint() {
        float sum = this.getWeightFull();
        if (sum != 0) {
            System.out.printf("Коробка фруктов - %s вес = %f \n", fruits, sum);
        } else
            System.out.println("Коробка пуста");
    }


    public boolean compare(BoxFruit boxFruit) {

        if (this.getWeightFull() == boxFruit.getWeightFull()) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    @Override
    public String toString() {
        return "Коробка с фруктами - {" +
                fruits +
                '}';
    }


    public void info() {
        System.out.println(toString());
    }

}
