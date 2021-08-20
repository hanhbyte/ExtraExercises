package Lesson2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Discount meat1 = new Meat("1", "meat1", LocalDate.of(2021, 7, 11), 50000, 20);
        Discount meat2 = new Meat("2", "meat2", LocalDate.of(2021, 7, 12), 55000, 18);
        Discount meat3 = new Meat("3", "meat3", LocalDate.of(2021, 7, 13), 45000, 30);
        Discount meat4 = new Meat("4", "meat4", LocalDate.of(2021, 7, 14), 65000, 25);
        Discount meat5 = new Meat("5", "meat5", LocalDate.of(2021, 7, 15), 56000, 24);
        Discount crip1 = new CrispyFlour("6", "crip6", LocalDate.of(2020, 9, 17), 15000, 15);
        Discount crip2 = new CrispyFlour("7", "crip7", LocalDate.of(2020, 12, 17), 18000, 18);
        Discount crip3 = new CrispyFlour("8", "crip8", LocalDate.of(2020, 8, 17), 20000, 18);
        Discount crip4 = new CrispyFlour("9", "crip9", LocalDate.of(2021, 4, 17), 19000, 19);
        Discount crip5 = new CrispyFlour("10", "crip10", LocalDate.of(2021, 6, 17), 17000, 17);
        Discount[] list = {meat1,meat2,meat3,meat4,meat5,crip1,crip2,crip3,crip4,crip5};
        List<Discount> _list= Arrays.asList(list);
        Manager manager = new Manager();
        manager.setListMaterial(_list);
        System.out.println("Chưa chiết khấu : "+manager.totalAmount());
        System.out.println("Đã chiết khấu : "+manager.totalDiscount());
        System.out.println("Chênh lệch : "+(manager.totalAmount()- manager.totalDiscount()));
    }
}
