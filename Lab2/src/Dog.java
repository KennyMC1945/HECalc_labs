public class Dog extends Animal{
    private int learnedTricks;

    public Dog(String food, String location, int learnedTricks) {
        super(food, location);
        this.learnedTricks = learnedTricks;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака гавкает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Собака спит в " + location);
    }

}
