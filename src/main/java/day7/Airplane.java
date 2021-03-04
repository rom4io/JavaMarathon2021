package day7;

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String planeProducer) {
        producer = planeProducer;
    }

    public void setYear(int planeYear) {
        year = planeYear;
    }

    public void setLength(int planeLength) {
        length = planeLength;
    }

    public void setWeight(int planeWeight) {
        weight = planeWeight;
    }

    public void setFuel(int planeFuel) {
        fuel = planeFuel;
    }

    public int getFuel() {
        return fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year +
                ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        fuel = fuel + n;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length == airplane2.length) System.out.println("У самолетов одинаковая длина");
        else if (airplane1.length < airplane2.length) System.out.println(airplane2.producer +
                " длиннее, чем " + airplane1.producer + " на " + (airplane2.length - airplane1.length)+ " метров");
        else if (airplane1.length > airplane2.length) System.out.println(airplane1.producer +
                " длиннее, чем " + airplane2.producer + " на " + (airplane1.length - airplane2.length) + " метров");
    }
}
