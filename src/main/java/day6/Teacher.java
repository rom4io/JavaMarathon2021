package day6;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String teachName) {
        name = teachName;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String teachSubject) {
        subject = teachSubject;
    }

    public String getSubject() {
        return subject;
    }

    void evaluate(Student student) {
        int number = 2 + (int) (Math.random() * 4);

        String estimation = null;
        if (number == 2) estimation = "неудовлетворительно";
        else if (number == 3) estimation = "удовлетворительно";
        else if (number == 4) estimation = "хорошо";
        else if (number == 5) estimation = "отлично";

        System.out.println("Преподаватель " + name + " оценила студента с именем " + student.getName()+ " по предмету " + subject + " на оценку " + estimation + ".");
    }
}

