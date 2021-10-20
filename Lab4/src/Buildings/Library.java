package Buildings;

public class Library extends Building {
    private int noOfBooks;
    private int noOfReadingTables;

    public Library(int noOfWindows, int noOfFloors, int noOfBooks, int noOfReadingTables) {
        super(noOfWindows, noOfFloors);
        this.noOfBooks = noOfBooks;
        this.noOfReadingTables = noOfReadingTables;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public int getNoOfReadingTables() {
        return noOfReadingTables;
    }
}
