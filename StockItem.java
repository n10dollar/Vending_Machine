public class StockItem {

    private double cost;
    private String snackType;
    private String snackName;

    StockItem(double cost, String snackType, String snackName) {
        this.cost=cost;
        this.snackType=snackType;
        this.snackName=snackName;
    }

    public double getCost() {
        return cost;
    }

    public String getSnackType() {
        return snackType;
    }

    public String getSnackName() {
        return snackName;
    }

    @Override
    public String toString() {
        return String.format(snackType + " : " + snackName + " : $" + cost);
    }

}
