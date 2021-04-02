public class Fruit {
    private String kind;
    private float weight;
    private int number;



    public Fruit(String kind, float weight, int number) {
        this.kind = kind;
        this.weight = weight;
        this.number = number;
    }
    public Fruit(String kind, int number) {
        this.kind = kind;
        this.weight = weight;
        this.number = number;
    }


    public String getKind() {
        return kind;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumber() {
        return number;
    }



    public void setWeight(float weight) {
        this.weight = weight;
    }


    public float getWeightFruits() {
        return weight * (float) number;
    }



    @Override
    public String toString() {
        return "Фрукты{ " +
                "Вид ='" + kind + '\'' +
                //", вес =" + weight +
                ", кол-во =" + number +
                '}';
    }

    public void info() {
        System.out.println(toString());
    }
}
