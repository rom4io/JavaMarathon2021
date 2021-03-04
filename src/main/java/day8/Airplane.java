package day8;

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public void setProducer (String planeProducer){
        producer = planeProducer;
    }
    public void setYear (int planeYear){
        year = planeYear;
    }
    public void setLength (int planeLength){
        length = planeLength;
    }
    public void setWeight (int planeWeight){
        weight = planeWeight;
    }
    public void setFuel (int planeFuel){
        fuel = planeFuel;
    }
    public int getFuel(){
        return fuel;
    }
    void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year +
                ", длина: "+length+", вес: "+weight+", количество топлива в баке: " + fuel);
    }
    public void fillUp(int n){
        fuel = fuel+n;
    }

    public String toString(){
        return "Изготовитель: " + producer + ", год выпуска: " + year +
                ", длина: "+length+", вес: "+weight;
    }
}
