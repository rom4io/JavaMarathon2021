package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] matrix = new int[12][8];
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int a = 0; a < matrix[i].length; a++) {
                matrix[i][a] = rand.nextInt(50);
            }
        }
        int index = 0;
        int s = 0;
        for (int i = 0; i < matrix.length; i++) {
            int d = 0;
            for (int a = 0; a < matrix[i].length; a++) {
                d = matrix[i][a];
            }
            if (d > s) {
                index = i;
                s = d;
            }
        }
        System.out.println(index);
    }
}
