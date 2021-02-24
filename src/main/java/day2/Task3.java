package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int floor = 0;
        while (floor < b) {
            if (a > b) System.out.print("Некорректный ввод");
            floor = a++;
            if (a % 5 == 0 && a != b && a%10!=0) System.out.print(a + " ");
        }
    }
}
