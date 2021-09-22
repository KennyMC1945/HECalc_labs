public class Horse extends Animal {
    private double speed;

    public Horse(String food, String location, double speed) {
        super(food, location);
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржёт");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит в " + location);
    }


}
