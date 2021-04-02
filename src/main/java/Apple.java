public class Apple extends Fruit implements Packable {

    private float WEIGHT = 1.0f;

    public Apple(String kind, int number) {
        super(kind, number);
        setWeight(WEIGHT);
    }

    @Override
    public String toString() {
        return "Яблоки{ " +
                "Вид ='" + getKind() + '\'' +
                //", вес =" + WEIGHT +
                ", кол-во = " + getNumber() +
                '}';
    }

    @Override
    public void info() {
        System.out.println(toString());
    }

    public void pack() {

    }
}
