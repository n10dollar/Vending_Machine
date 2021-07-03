public class Receipt {

    private double cost;
    private String snackType;
    private String snackName;

    Receipt(double cost, String snackType, String snackName) {
        this.cost=cost;
        this.snackType=snackType;
        this.snackName=snackName;
    }

    @Override
    public String toString() {
        return String.format("Bought: " + snackType + " called " + snackName + "\n" + "Total: $" + cost);
    }

}
