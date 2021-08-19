package VendingMachineFinal;

public class SoldItem {

    private String name;
    private int quantity;
    private double cost;

    SoldItem(StockItem item, int quantity) {
            name=item.getName();
            this.quantity=quantity;
            cost=item.getCost();
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getCost() { return cost; }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
               "quantity: " + quantity + "\n" +
               "cost per: " + cost + "\n";
    }
}
