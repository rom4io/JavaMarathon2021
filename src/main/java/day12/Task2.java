package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            number.add(i);
        }
        for (int i = 300; i <= 350; i++) {
            number.add(i);
        }
        for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i) + " ");
        }

    }
}
