

import java.util.ArrayList;
import java.util.Arrays;

/**
 1. Написать метод, который меняет два элемента массива местами (массив может быть любого
 ссылочного типа);
 2. Написать метод, который преобразует массив в ArrayList;
 3. Задача:
 a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
 фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
 и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
 коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
 равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
 апельсинами;
 f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
 объекты, которые были в первой;
 g. Не забываем про метод добавления фрукта в коробку.

 */

public class App {
    //Задание 1
    public  <A> A[] isChanging(A[] arr) {
        A per = null;
        for (int i = 0; i < arr.length; i++) {
            per = arr[1];
            arr[1] = arr[0];
            arr[0] = per;
        }
        return arr;
    }
    //Задание 2
    public  <A> ArrayList<A> transform(A[] arr) {
        final ArrayList<A> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Тип: " + arrayList.getClass().getName());

        return new ArrayList<A>(arrayList);
    }


    public static void main(String[] args) {

        //Задание 1
        String[] arr = new App().isChanging(new String[]{"1", "2", "3", "4", "5"});
        System.out.println(Arrays.toString(arr));
        Integer[] arr2 = new App().isChanging(new Integer[]{6, 7, 8, 9, 10});
        System.out.println(Arrays.toString(arr2));

        //Задание 2
        ArrayList<String> ints = new App().transform(new String[]{"1", "2", "3", "4", "5"});
        System.out.println(ints);
        ints.add("6");
        System.out.println(ints);

        ArrayList<Integer> ints2 = new App().transform(new Integer[]{2, 2, 2, 2, 2});
        System.out.println(ints2);
        ints2.add(3);
        System.out.println(ints2);



        //Задание 3


        BoxFruit<Apple> appleBoxFruit1 = new BoxFruit<Apple>();
        BoxFruit<Orange> orangeBoxFruit1 = new BoxFruit<Orange>();

        appleBoxFruit1.addFruit(new Apple("Айдаред",5));
        appleBoxFruit1.addFruit(new Apple("Гала",15));

        orangeBoxFruit1.addFruit(new Orange("Корольковые",6));
        orangeBoxFruit1.addFruit(new Orange("Марокко",8));

        BoxFruit<Apple> appleBoxFruit2 = new BoxFruit<Apple>();
        BoxFruit<Orange> orangeBoxFruit2 = new BoxFruit<Orange>();

        appleBoxFruit2.addFruit(new Apple("Антоновка",10));
        appleBoxFruit2.addFruit(new Apple("Симеринка",10));



        orangeBoxFruit2.addFruit(new Orange("Марокко",5));
        orangeBoxFruit2.addFruit(new Orange("Марокко",5));

        BoxFruit<Apple> appleBoxFruit3 = new BoxFruit<Apple>();


        appleBoxFruit1.getWeightFullPrint();
        orangeBoxFruit1.getWeightFullPrint();

        appleBoxFruit2.getWeightFullPrint();
        orangeBoxFruit2.getWeightFullPrint();

        appleBoxFruit1.compare(appleBoxFruit2);
        orangeBoxFruit1.compare(appleBoxFruit2);

        appleBoxFruit2.pourOverFruit(appleBoxFruit3);
        appleBoxFruit2.info();
        appleBoxFruit3.info();


    }
}