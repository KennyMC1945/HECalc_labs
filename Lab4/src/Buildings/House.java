package Buildings;

public class House extends Building {

    private boolean hasGarage;

    public House(int noOfWindows, int noOfFloors, boolean hasGarage) {
        super(noOfWindows, noOfFloors);
        this.hasGarage = hasGarage;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }
}
