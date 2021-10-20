package Horses;

/**
 * todo Document type Donkey
 */
public class Donkey extends Horse {
    private float maxWeight;

    public Donkey(float maxSpeed, float maxWeight) {
        super(maxSpeed);
        this.maxWeight = maxWeight;
    }

    public float getMaxWeight() {
        return maxWeight;
    }
}
