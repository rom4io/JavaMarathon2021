package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[scanner.nextInt()];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        int vosem = 0;
        int odin = 0;
        int chet = 0;
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 8) vosem++;
            if (mas[i] == 1) odin++;
            if (mas[i] % 2 == 0) chet++;
            sum = sum + mas[i];
        }

        System.out.println("Длина массива: " + mas.length);
        System.out.println("Количество чисел больше 8: " + vosem);
        System.out.println("Количество чисел равных 1: " + odin);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество нечетных чисел: " + (mas.length - chet));
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
