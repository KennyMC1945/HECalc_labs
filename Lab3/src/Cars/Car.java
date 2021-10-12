package Cars;

public abstract class Car {
    String model;
    String carClass;
    double weight;
    Engine engine;

    public Car(String model, String carClass, double weight, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    abstract void start();
    abstract void stop();
    void turnRight(){
        System.out.println("Поворот направо");
    }
    void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Модель: "+model);
        System.out.println("Класс: " + carClass);
        System.out.println("Вес: " + weight);
        System.out.println("Мощность двигателя: " + engine.power);
        System.out.println("Производитель двигателя: " + engine.manufacturer);
    }
}

