public class Cat extends Animal{

    private int hoursSlept;

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит в " + location);
    }

    public Cat(String food, String location, int hoursSlept) {
        super(food, location);
        this.hoursSlept = hoursSlept;
    }


}
