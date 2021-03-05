package day9.Task1;

public class Student extends Human {
    private final String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот студент с именем " + super.getName());
    }
}
