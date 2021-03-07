package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse1 = new Warehouse();
        Picker picker = new Picker(0, false, warehouse);
        Picker picker1 = new Picker(0, false, warehouse1);
        Courier courier = new Courier(0, false, warehouse);
        Courier courier1 = new Courier(0, false, warehouse1);

        businessProcess(picker);
        businessProcess(courier);

        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);
        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
        worker.doWork();
        worker.bonus();
    }
}
