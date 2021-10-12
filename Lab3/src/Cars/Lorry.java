package Cars;

public class Lorry extends Car {
    public Lorry(String model, String carClass, double weight, Engine engine) {
        super(model, carClass, weight, engine);
    }

    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }


}
