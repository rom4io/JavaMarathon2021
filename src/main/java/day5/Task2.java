package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(5, "красный", "Java");

        System.out.println("Модель мотоцикла: "+ bike.getModel() + ", цвет: " + bike.getColor() + ", возраст: " + bike.getAge());

    }
}

class Motorbike {
    int age;
    String color;
    String model;
    public Motorbike (int age, String color, String model) {
        this.age = age;
        this.color=color;
        this.model = model;
    }

    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }

}
