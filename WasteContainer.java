public class WasteContainer {
    private String type;
    private int capacity;
    private int currentFill;

    public WasteContainer(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.currentFill = 0;
    }

    public boolean isFull() {
        return currentFill >= capacity;
    }

    public String getType() {
        return type;
    }

    public void fill(int amount) {
        currentFill += amount;
    }

    public void empty() {
        currentFill = 0;
        System.out.println(type + " waste container emptied.");
    }
}
