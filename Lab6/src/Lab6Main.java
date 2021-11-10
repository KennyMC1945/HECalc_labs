import java.util.Arrays;

public class Lab6Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>(Arrays.asList(
            new Apple(), new Apple(), new Apple(),new Apple()
        ));
        Box<Orange> orangeBox = new Box<>(Arrays.asList(
            new Orange(),new Orange(),new Orange(),new Orange()
        ));
        Box<Apple> appleBox2 = new Box<>(Arrays.asList(
            new Apple(), new Apple(), new Apple()
        ));

        System.out.println("Вес первой коробки яблок: "+appleBox1.getWeight());
        System.out.println("Вес второй коробки яблок: "+appleBox2.getWeight());
        System.out.println("Вес коробки апельсинов: "+orangeBox.getWeight());

        System.out.println("Сравнение коробки яблок и апельсинов: " + appleBox1.compare(orangeBox));

        appleBox1.moveItems(appleBox2, 3);

        System.out.println("Вес второй коробки яблок пересыпания: "+appleBox2.getWeight());
        System.out.println("Сравнение коробки яблок и апельсинов: " + appleBox2.compare(orangeBox));

        // ------ Коллекция ------

        MyCollection<String> coll = new MyCollection<>();
        coll.add("Word A");
        coll.add("Word B");
        coll.add("Word C");
        coll.add("Word D");
        System.out.println("Размер массива: " + coll.getSize());
        System.out.println("Второй элемент: " + coll.get(1));

        coll.remove(1);
        System.out.println("Размер массива после удаления: " + coll.getSize());
        System.out.println("Новый второй элемент: " + coll.get(1));

        coll.remove("Word C");
        System.out.println("Размер массива после удаления: " + coll.getSize());
        System.out.println("Новый второй элемент: " + coll.get(1));

        coll.clear();
        System.out.println("Размер массива после очистки: " + coll.getSize());



    }
}
