package day15;

public class Objects {
    private String name;
    private int size;
    private int quantity;

    public Objects(String name, int size, int quantity) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", size=" + size +
                ", quantity=" + quantity +
                "\n";
    }
}
