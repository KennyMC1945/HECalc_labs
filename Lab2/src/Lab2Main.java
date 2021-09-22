import java.util.Arrays;
import java.util.List;

public class Lab2Main {
    public static void main(String[] args) {
        // Задача 1
        List<Student> students = Arrays.asList(
                new Student("Ivan", "Ivanov", "BPM2012", 4),
                new Aspirant("Petr", "Dzerzhinskiy", "ZPW2012", 5, "Research of biological enemies"),
                new Student("Chris", "Pratt", "BPM2021", 5),
                new Aspirant("Anton", "Chehov", "ZWE2012", 4.5, "Psychology of spores")
        );

        students.forEach(s -> System.out.println(s.getScholarship()));

        // Задача 2
        List<Animal> animals = Arrays.asList(
                new Dog("Кость", "Будка", 2),
                new Cat("Рыба", "Кровать", 20),
                new Horse("Морковь", "Конюшня", 40)
        );
        Vet vet = new Vet();

        animals.forEach(vet::treatAnimal);
    }
}
