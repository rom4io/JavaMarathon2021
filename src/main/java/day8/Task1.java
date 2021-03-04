package day8;

public class Task1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String s = null;
        for (int i = 0; i <= 20000; i++) {
            s += i + " ";
        }
        System.out.println(s);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;

        long start1 = System.currentTimeMillis();
        StringBuilder q = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            q.append(i + " ");
        }
        System.out.println(q);
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println(timeConsumedMillis);
        System.out.println(timeConsumedMillis1);
        System.out.println("На "+ (timeConsumedMillis - timeConsumedMillis1)+ " мс быстрее");
    }

}
