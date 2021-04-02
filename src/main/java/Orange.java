
public class Orange extends Fruit implements Packable {

    private float WEIGHT = 1.5f;

    public Orange(String kind, int number) {
        super(kind, number);
        setWeight(WEIGHT);
    }



    @Override
    public String toString() {
        return "Апельсины{ " +
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
        return;
    }
}
