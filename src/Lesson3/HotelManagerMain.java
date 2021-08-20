package Lesson3;

import java.util.Scanner;

public class HotelManagerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of guests: ");
        int size = scanner.nextInt();
        HotelManager hotelManager = new HotelManager(size);
        Hotel[] hotels = hotelManager.getHotels();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter guest information :" +(i+1));
            hotels[i] = hotelManager.inputHotelInfor(scanner);
        }
        hotelManager.displayHotelList();
        System.out.println("Enter the ID card of the guest that needs to be deleted:");
        String idetiny = scanner.nextLine();
        int index = hotelManager.findHotelById(idetiny);
        if (index == -1){
            System.out.println("Not found!!");
        }else {
            hotelManager.removeHotelInfo(index);
            hotelManager.displayHotelList();
        }
    }
}
