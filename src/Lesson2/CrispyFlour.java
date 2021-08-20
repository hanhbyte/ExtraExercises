package Lesson2;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private int quantity = 0;

    public CrispyFlour() {
        super();
    }

    public CrispyFlour(String id, String name,
                       LocalDate manufacturingDate,
                       int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                '}';
    }

    @Override
    public double getRealMoney() {
        LocalDate timeCheck= LocalDate.now();
        if (timeCheck.isAfter(getExpiryDate()))
            return 0;
        else if (timeCheck.plusMonths(2).isAfter(getExpiryDate()))
            return getAmount() * 0.6;
        else if (timeCheck.plusMonths(4).isAfter(getExpiryDate()))
            return getAmount() * 0.8;
        else
            return getAmount() * 0.95;
    }
}
