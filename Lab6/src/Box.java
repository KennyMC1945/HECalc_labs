import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit> {
    List<E> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public Box(List<E> items) {
        this.items = new ArrayList<>(items);
    }

    public void add(E item) {
        this.items.add(item);
    }

    public float getWeight() {
        float weight = 0;
        for (E item : this.items) {
            weight += item.getWeight();
        }
        return weight;
    }
    public boolean compare(Box box) {
        return box.getWeight() == this.getWeight();
    }

    public void moveItems(Box<E> box, int itemCount) {
        for (int i = 0; i<itemCount; i++)
            box.add(this.items.remove(0));
    }
}
