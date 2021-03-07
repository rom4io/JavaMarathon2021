package day11.task1;

public class Courier implements Worker {
    private final Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Courier(int salary, boolean isPayed, Warehouse warehouse) {
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
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }


    public void bonus() {
        if (isPayed == false) {
            if (warehouse.getCountDeliveredOrders() == 10000) {
                salary += 50000;
                isPayed = true;
            } else System.out.println("Бонус пока не доступен");
        } else System.out.println("Бонус уже выплачен");

    }

}
