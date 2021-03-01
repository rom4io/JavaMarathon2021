package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Онотоле");
        Teacher larisa = new Teacher("Лариса Ванна", "вскрытие трупов");
        larisa.evaluate(student);
    }
}
