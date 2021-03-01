package day6;

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

    public void info(){
        System.out.println ("Это автомобиль");
    }
    int yearDifference(int inputYear){
        return Math.abs(inputYear - age);
    }
}

