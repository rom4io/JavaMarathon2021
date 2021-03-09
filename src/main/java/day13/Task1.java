package day13;

public class Task1 {
    public static void main(String[] args) {
        User usera = new User("qwerty");
        User userb = new User("asdfg");
        User userc = new User("zxcvb");

        usera.sendMessage(userb, "Првет!!!");
        usera.sendMessage(userb, "Как дела?");
        usera.sendMessage(usera, "Привет!!!");
        usera.sendMessage(usera, "Все хорошо");
        usera.sendMessage(usera, "Ты как?");
        userc.sendMessage(usera, "Привет!");
        userc.sendMessage(usera, "Это Zxcvb");
        userc.sendMessage(usera, "Как ты?");
        usera.sendMessage(userc, "О, какие люди");
        usera.sendMessage(userc, "Сколько лет, сколько зим");
        usera.sendMessage(userc, "Займи денег");
        userc.sendMessage(usera, "Да вообще то сам хотел занять(((");

        MessageDatabase.showDialog(usera, userc);
    }
}
