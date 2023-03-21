import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 10, 400);
        Car car2 = new Car("Mercedes", "GLB", 2, 260);
        String string1 = "Ivan";
        String string2 = "Tosho";
        int result = string1.compareTo(string2);
        Integer int1 = 10;
        Integer int2 = 20;

        System.out.println(int1.compareTo(int2));

        Garage garage = new Garage(car1, car2);
        for (Car car : garage) {
            System.out.println(car.getBrand());

        }

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        for (Car car : cars) {
            System.out.println(car.getAge());
        }

    }
}