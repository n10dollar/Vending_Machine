package VendingMachineFinal;

public class StockItem {

    private String name;
    private int quantity;
    private double cost;

    StockItem(String name, int quantity, double cost) {
        this.name=name;
        this.quantity=quantity;
        this.cost=cost;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getCost() { return cost; }

    public void increaseQuantityBy(int quantityIncrease) { quantity += quantityIncrease; }
    public void decreaseQuantityBy(int quantityDecrease) { quantity -= quantityDecrease; }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
               "quantity: " + quantity + "\n" +
               "cost per: " + cost + "\n";
    }
}
