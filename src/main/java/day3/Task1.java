package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String city = reader.readLine();
            if (city.equals("Stop")) break;
            else if (city.equals("Москва")) System.out.println("Россия");
            else if (city.equals("Владивосток")) System.out.println("Россия");
            else if (city.equals("Ростов")) System.out.println("Россия");
            else if (city.equals("Рим")) System.out.println("Италия");
            else if (city.equals("Милан")) System.out.println("Италия");
            else if (city.equals("Турин")) System.out.println("Италия");
            else if (city.equals("Ливерпуль")) System.out.println("Англия");
            else if (city.equals("Манчестер")) System.out.println("Англия");
            else if (city.equals("Лондон")) System.out.println("Англия");
            else if (city.equals("Берлин")) System.out.println("Германия");
            else if (city.equals("Мюнхен")) System.out.println("Германия");
            else if (city.equals("Кёльн")) System.out.println("Германия");
            else System.out.println("Неизвестная страна");
        }
    }
}

