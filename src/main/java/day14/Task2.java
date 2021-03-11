package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");

        System.out.println(parseFileToStringList(file));

    }

    public static List<String> parseFileToStringList(File file) {
        Scanner scanner = null;
        List<String> people = new ArrayList<>();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] person = str.split(" ");
            if (Integer.parseInt(person[1]) < 0) try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
                return null;
            }
            people.add(str);
        }
        scanner.close();
        return people;
    }
}

