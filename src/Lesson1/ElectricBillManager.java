package Lesson1;

import Lesson2.Meat;

import java.util.ArrayList;
import java.util.List;

public class ElectricBillManager {
    private List<ElectricBill> electricBills = new ArrayList<>();

    public void showElectricBill() {
        for (ElectricBill electricBill : electricBills) {
            System.out.println(electricBill);
        }
    }

    public void addElectricBill(ElectricBill electricBill) {
        electricBills.add(electricBill);
    }

    public void removeElectricBill(int index) {
        electricBills.remove(index);
    }

    public void updateElectricBillInfo(int index, ElectricBill electricBill) {
        electricBills.set(index, electricBill);
    }

    public List<ElectricBill> getElectricBills() {
        return electricBills;
    }

}
