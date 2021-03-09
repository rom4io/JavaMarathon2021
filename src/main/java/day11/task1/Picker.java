package day11.task1;

public class Picker implements Worker {
    private final Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Picker(int salary, boolean isPayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "заработано: " + salary + " бонус: " + isPayed;
    }

    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);

    }


    public void bonus() {
        if (isPayed == false) {
            if (warehouse.getCountPickedOrders() == 10000) {
                salary += 70000;
                isPayed = true;
            }
        }

    }
}
