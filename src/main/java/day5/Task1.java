package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Москвич");
        car1.setAge(37);
        car1.setColor("Зеленый");

        Car car2 = new Car();
        car2.setModel("Иж");
        car2.setAge(28);
        car2.setColor("синий");

        System.out.println("Модель машины: " + car1.getModel() + ", цвет: " + car1.getColor() + ", возраст: " + car1.getAge());
        System.out.println("Модель машины: " + car2.getModel() + ", цвет: " + car2.getColor() + ", возраст: " + car2.getAge());

    }
}

class Car {
    private String model;
    private int age;
    private String color;

    public String getModel() {
        return model;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int carAge) {
        age = carAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String carColor) {
        color = carColor;
    }
}

