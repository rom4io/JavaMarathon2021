package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            ;
        }
        while (scanner.hasNextLine()) {
            String person = scanner.nextLine();
            String[] persons = person.split(" ");
            if (Integer.parseInt(persons[1]) < 0) try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }

            Person person1 = new Person(persons[0],Integer.parseInt(persons[1]));

            people.add(person1);
        }
        return people;
    }
}