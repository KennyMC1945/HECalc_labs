package Animals;

public abstract class Animal {
    private boolean vegeterian;
    private String eats;
    private int noOfLegs;

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegeterian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}
