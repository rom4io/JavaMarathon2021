package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[100];

        for (int i=0; i< mas.length; i++){
            mas[i] = (int)(Math.random()*10000);
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
