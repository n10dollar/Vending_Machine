package VendingMachineFinal;

import VendingMachineFinal.SoldItem;

public class Receipt {

    private String itemName;
    private int quantity;
    private double totalDue;
    private int customerID;

    Receipt(SoldItem soldItem, int customerID) {
        itemName=soldItem.getName();
        quantity=soldItem.getQuantity();
        totalDue=soldItem.getCost()*quantity;
        this.customerID = customerID;
    }

    public int getCustomerID() { return customerID; }


    @Override
    public String toString() {
        return "Customer ID: " + customerID + "\n" +
                "The bill is: " + "\n" +
                "$" + totalDue + " for " +
                quantity + " " + itemName + "\n";
    }
}
