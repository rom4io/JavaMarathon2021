package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1");
        File file2 = new File("file2");
        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);


        for (int i = 0; i < 1000; i++) {
            double rand = (int) (Math.random() * 100);
            pw1.println(rand);
        }
        pw1.close();


    /*    BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
        while (reader.readLine() != null) {
            for (int i = 0; i < 50; i++) {
                int sum = 0;
                for (int q = 0; q < 20; q++) {
                    sum += Integer.parseInt(reader.readLine());
                }
                pw2.println(sum/20);
            }*/


        Scanner scanner = new Scanner(file1);
        while (scanner.hasNext()) {
            for (int i = 0; i < 50; i++) {
                double sum = 0;
                for (int q = 0; q < 20; q++) {
                    sum += Double.parseDouble(scanner.nextLine());
                }
                pw2.println(sum/20);
            }
            pw2.close();
        }
        scanner.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        while (scanner.hasNextLine()){
            sum += Double.parseDouble(scanner.nextLine());
        }
        System.out.println((int)sum);
        scanner.close();
    }
}


