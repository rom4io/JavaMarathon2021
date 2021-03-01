package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(1986,"красный", "Java");
        Car car = new Car();
        car.setModel("Москвич");
        car.setAge(1974);
        car.setColor("Зеленый");
        car.info();
        System.out.println(car.yearDifference(2021) + " лет");
        bike.info();
        System.out.println(bike.yearDifference(2021) + " лет");

    }
}
