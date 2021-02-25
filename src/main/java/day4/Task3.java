package day4;

public class Task3 {
    public static void main(String[] args) {

        int[][] matrix = new int[12][8];

        for (int i = 0; i < matrix.length; i++) {
            for (int a = 0; a < matrix[i].length; a++) {
                matrix[i][a] = (int) (Math.random() * 50);
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
