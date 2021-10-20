package Buildings;

public abstract class Building {
    private int noOfWindows;
    private int noOfFloors;

    public Building(int noOfWindows, int noOfFloors) {
        this.noOfWindows = noOfWindows;
        this.noOfFloors = noOfFloors;
    }

    public int getNoOfWindows() {
        return noOfWindows;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }
}
