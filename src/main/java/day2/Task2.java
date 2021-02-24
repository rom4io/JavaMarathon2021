package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a + 1; i < b; i++) {
            if (a >= b) System.out.println("Некорректный ввод");
            else if (i % 10 == 0) ;
            else if (i % 5 == 0) System.out.println(i);
        }

    }
}
