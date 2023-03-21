public class Car {
    public String brand;
    public String model;
    public int age;
    public int kilometrePerHour;

    public Car(String brand, String model, int age, int kilometrePerHour) {
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.kilometrePerHour = kilometrePerHour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKilometrePerHour() {
        return kilometrePerHour;
    }

    public void setKilometrePerHour(int kilometrePerHour) {
        this.kilometrePerHour = kilometrePerHour;
    }
}
