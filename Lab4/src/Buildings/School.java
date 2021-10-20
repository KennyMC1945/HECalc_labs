package Buildings;

/**
 * todo Document type School
 */
public class School extends Building {

    private int noOfRooms;

    public School(int noOfWindows, int noOfFloors, int noOfRooms) {
        super(noOfWindows, noOfFloors);
        this.noOfRooms = noOfRooms;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }
}
