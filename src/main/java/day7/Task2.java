package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int diff = (Player.MAX_STAMINA - 90);

        Player player1 = new Player(random.nextInt(diff) + 90);
        Player player2 = new Player(random.nextInt(diff) + 90);
        Player.info();
        Player player3 = new Player(random.nextInt(diff) + 90);
        Player player4 = new Player(random.nextInt(diff) + 90);
        Player player5 = new Player(random.nextInt(diff) + 90);
        Player.info();
        Player player6 = new Player(random.nextInt(diff) + 90);

        Player.info();
        //System.out.println(player2.getStamina());

        Player player7 = new Player(random.nextInt(diff) + 90);
        for (int i = 0; i <=100; i++) {
            player2.run();
        }

        Player.info();


    }
}
