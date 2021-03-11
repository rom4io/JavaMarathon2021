package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {

        File file = new File("test3");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        String line = scanner.nextLine();
        String[] numbersStr = line.split(" ");
        int[] numbers = new int[10];
        int counter = 0;
        int sum = 0;

        for (String number : numbersStr) {
            sum  += Integer.parseInt(number);
            counter++;
        }
        if (counter != 10) try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

        for (int i=0; i< numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}
