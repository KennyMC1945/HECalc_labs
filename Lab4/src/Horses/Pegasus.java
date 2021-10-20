package Horses;

public class Pegasus extends Horse {
    private float wingsLength;
    private float maxHeight;

    public Pegasus(float maxSpeed, float wingsLength, float maxHeight) {
        super(maxSpeed);
        this.wingsLength = wingsLength;
        this.maxHeight = maxHeight;
    }

    public float getWingsLength() {
        return wingsLength;
    }

    public float getMaxHeight() {
        return maxHeight;
    }
}
