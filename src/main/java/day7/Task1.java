package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Як", 1974, 13,3);
        Airplane plane2 = new Airplane("Су", 2013, 37, 32);

        Airplane.compareAirplanes(plane1, plane2);

    }
}