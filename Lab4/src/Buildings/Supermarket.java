package Buildings;

/**
 * todo Document type Supermarket
 */
public class Supermarket extends Building {

    private boolean hasParking;

    public Supermarket(int noOfWindows, int noOfFloors, boolean hasParking) {
        super(noOfWindows, noOfFloors);
        this.hasParking = hasParking;
    }

    public boolean isHasParking() {
        return hasParking;
    }
}
