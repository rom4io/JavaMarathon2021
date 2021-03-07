package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Москвич");
        cars.add("Лада");
        cars.add("Иж");
        cars.add("Камаз");
        cars.add("ЗИЛ");

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();
        cars.add(3, "Мерседес");
        cars.remove(0);
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }
    }
}
