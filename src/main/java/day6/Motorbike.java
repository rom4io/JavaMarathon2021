package day6;


class Motorbike {
    private int age;
    private String color;
    private String model;

    public Motorbike(int age, String color, String model) {
        this.age = age;
        this.color = color;
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void  info(){
        System.out.println("Это мотоцикл");
    }
    int yearDifference(int inputYear){
        return Math.abs(inputYear - age);
    }

}
