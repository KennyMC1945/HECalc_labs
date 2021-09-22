public class Aspirant extends Student{

    private String studyName;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String studyName) {
        super(firstName, lastName, group, averageMark);
        this.studyName = studyName;
    }

    @Override
    public double getScholarship() {
        return (averageMark == 5) ? 200 : 180;
    }
}
