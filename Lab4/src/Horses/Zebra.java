package Horses;

public class Zebra extends Horse{
    private int noOfWhiteStripes;

    public Zebra(float maxSpeed, int noOfWhiteStripes) {
        super(maxSpeed);
        this.noOfWhiteStripes = noOfWhiteStripes;
    }

    public int getNoOfWhiteStripes() {
        return noOfWhiteStripes;
    }
}
