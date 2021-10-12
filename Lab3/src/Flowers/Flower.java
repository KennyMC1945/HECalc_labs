package Flowers;

public abstract class Flower {
    static int flowerCount = 0;

    public Flower() {
        flowerCount+=1;
    }

    public abstract double getPrice();

    public static int getFlowerCount() {
        return flowerCount;
    }
}
