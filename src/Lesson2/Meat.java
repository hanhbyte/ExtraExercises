package Lesson2;

import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat() {
        super();
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public double getRealMoney() {
        LocalDate timeCheck = LocalDate.now();
        if (timeCheck.isAfter(getExpiryDate()) || timeCheck.isBefore(manufacturingDate)) {
            return 0;
        } else if (timeCheck.plusDays(3).isAfter(getExpiryDate()))
            return getAmount() * 0.5;
        else if (timeCheck.plusDays(5).isAfter(getExpiryDate()))
            return getAmount() * 0.7;
        else return getAmount() * 0.9;
    }

//    public static void main(String[] args) {
//        Meat checken1 = new Meat("1", "meat1", LocalDate.of(2021, 7, 13), 50000, 20);
//        Meat checken2 = new Meat("2", "meat2", LocalDate.of(2021, 7, 15), 50000, 20);
//        Meat checken3 = new Meat("3", "meat3", LocalDate.of(2021, 7, 18), 50000, 20);
//        System.out.println(checken1.getRealMoney());
//        System.out.println(checken2.getRealMoney());
//        System.out.println(checken3.getRealMoney());
//    }
}
