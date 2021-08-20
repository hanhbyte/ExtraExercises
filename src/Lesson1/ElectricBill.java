package Lesson1;

public class ElectricBill extends Customer{
    private Customer customer;
    private int oldIndex;
    private int newIndex;
    private String price;

    public ElectricBill() {
    }

    public ElectricBill(Customer customer, int oldIndex, int newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElectricBill{" +
                "customer=" + customer +
                ", oldIndex='" + oldIndex + '\'' +
                ", newIndex='" + newIndex + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
