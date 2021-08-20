package Lesson1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ElectricBillManager electricBillManager = new ElectricBillManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.println("Enter your selection: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :{
                    showElectricList(electricBillManager);
                    break;
                }
                case 2:{
                    addElectricBill(electricBillManager, scanner);
                    break;
                }
                case 3:{
                    updateElectricBill(electricBillManager, scanner);
                    break;
                }
                case 4:{
                    removeElectricBill(electricBillManager, scanner);
                    break;
                }
                case 0:{
                    System.exit(0);
                    break;
                }
            }
        }while (choice >= 0 && choice < 5);
    }

    private static void removeElectricBill(ElectricBillManager electricBillManagement, Scanner scanner) {
        System.out.println("Xóa hóa đơn");
        System.out.println("Nhập vị trí muốn xóa:");
        int index = scanner.nextInt();
        if (index < 0 || index >= electricBillManagement.getElectricBills().size()) {
            System.out.println("Vị trí không hợp lệ");
        } else {
            electricBillManagement.removeElectricBill(index);
        }
    }

    private static void updateElectricBill(ElectricBillManager electricBillManagement, Scanner scanner) {
        System.out.println("Chỉnh sửa thông tin hóa đơn");
        System.out.println("Nhập vị trí muốn sửa:");
        int index = scanner.nextInt();
        if (index < 0 || index >= electricBillManagement.getElectricBills().size()) {
            System.out.println("Vị trí không hợp lệ");
        } else {
            scanner.nextLine();
            ElectricBill electricBill = inputElectricBill(scanner);
            electricBillManagement.updateElectricBillInfo(index, electricBill);
        }
    }

    private static void addElectricBill(ElectricBillManager electricBillManagement, Scanner scanner) {
        System.out.println("Thêm hóa đơn");
        scanner.nextLine();
        ElectricBill electricBill = inputElectricBill(scanner);
        electricBillManagement.addElectricBill(electricBill);
    }

    private static void showElectricList(ElectricBillManager electricBillManagement) {
        System.out.println("Danh sách hóa đơn");
        electricBillManagement.showElectricBill();
    }

    private static ElectricBill inputElectricBill(Scanner scanner) {
        Customer customer = inputCustomer(scanner);
        System.out.println("Nhập số điện cũ:");
        int oldIndex = scanner.nextInt();
        System.out.println("Nhập số điện mới:");
        int newIndex = scanner.nextInt();
        ElectricBill electricBill = new ElectricBill(customer, oldIndex, newIndex);
        return electricBill;
    }

    private static Customer inputCustomer(Scanner scanner) {
        System.out.println("Nhập họ tên khách hàng:");
        String name = scanner.nextLine();
        System.out.println("Nhập số nhà:");
        int idHouser = scanner.nextInt();
        System.out.println("Nhập số điện:");
        int idElectricMeter = scanner.nextInt();
        Customer customer = new Customer(name, idHouser, idElectricMeter);
        return customer;
    }

    private static void menu() {
        System.out.println("MENU");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm hóa đơn");
        System.out.println("3. Chỉnh sửa hóa đơn");
        System.out.println("4. Xóa hóa đơn");
        System.out.println("0. Thoát");
    }
}
