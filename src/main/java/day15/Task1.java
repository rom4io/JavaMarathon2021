package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        File file1 = new File("src/main/resources/missing_shoes.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        while (scanner.hasNextLine()) {
            String object = scanner.nextLine();
            String[] model = object.split(";");
            if (Integer.parseInt(model[2]) == 0) {
                pw.println(new Objects(model[0], Integer.parseInt(model[1]), Integer.parseInt(model[2])));
            }
        }
        pw.close();
        scanner.close();
    }
}
