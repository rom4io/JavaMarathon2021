package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Test3");
        System.out.printf(printResult(file) + "-->" + "%.3f", printResult(file));
    }

    public static double printResult(File file) {
        double ave = 0;
        double sum = 0;
        double counter = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] numbersStr = line.split(" ");
            for (String number : numbersStr) {
                sum += Integer.parseInt(number);
                counter++;
            }
            ave = sum / counter;
        }
        return ave;
    }
}



