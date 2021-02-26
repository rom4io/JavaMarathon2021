package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        Random rand = new Random();

        for (int i=0; i< mas.length; i++){
            mas[i] = rand.nextInt(10000);
        }
        int sum = 0;
        int index = 0;

        for (int i = 1; i< mas.length-1; i++){
            if (sum<(mas[i-1]+mas[i]+mas[i+1])){
                sum = (mas[i-1]+mas[i]+mas[i+1]);
                index = i-1;
            }

        }
        System.out.println(sum);
        System.out.println(index);
    }
}
