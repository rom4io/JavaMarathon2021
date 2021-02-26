package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }

        int max = 0;
        int min = 10000;
        int zeroNumb = 0;
        int zeroSum = 0;

        for (int mas : numbers) {
            if (mas > max) max = mas;
            if (mas < min) min = mas;
            if (mas % 10 == 0) {
                zeroNumb++;
                zeroSum = zeroSum + mas;
            }

        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + zeroNumb);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + zeroSum);
    }
}
