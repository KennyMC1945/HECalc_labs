import FootWear.*;

import java.util.List;
import java.util.Random;

public class Lab4Main {
    public static void main(String[] args){
        List<FootWear> wardrobe = List.of(
            new Shoes(42),
            new Boots(42),
            new Trainers(42)
        );
        int index = Math.abs(new Random().nextInt() % 3);
        FootWear boots = wardrobe.get(index);

        if (boots instanceof Shoes) {
            System.out.println("I'm wearing shoes");
        } else if (boots instanceof Boots) {
            System.out.println("I'm wearing boots");
        } else if (boots instanceof Trainers) {
            System.out.println("I'm wearing trainers");
        }
    }
}
