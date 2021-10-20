public class Pract1Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1,2,5);
        System.out.println("Круг находящийся в точке (" + circle.getX() + "," + circle.getY() + ") имеет площадь равную "+ circle.area());
    }
}
