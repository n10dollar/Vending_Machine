package VendingMachineFinal;

public class Customer {

    private String customerName;
    private int customerID;

    Customer(String customerName) { this.customerName=customerName; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setCustomerID(int customerID) { this.customerID = customerID; }

    public String getCustomerName() {
        return customerName;
    }
    public int getCustomerID() { return customerID; }

}
