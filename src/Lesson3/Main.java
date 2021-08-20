package Lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of guests: ");
        int size = scanner.nextInt();
        Hotel[] hotels = new Hotel[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter guest information :" +(i+1));
            hotels[i] = inputHotelInfor(scanner);
        }
        displayHotelList(hotels);
        System.out.println("Enter the ID card of the guest that needs to be deleted: ");
        String identiny = scanner.nextLine();
        int index = fínHotelByIdentiny(identiny, hotels);
        if (index == -1){
            System.out.println("Can't find customers to rent!!");
        }else {
            hotels = removeHotelInfor(index, hotels);
            displayHotelList(hotels);
        }
    }

    public static Hotel[] removeHotelInfor(int index, Hotel[] hotels){
        Hotel[] newHotel = new Hotel[hotels.length -1];
        for (int i = 0; i < newHotel.length; i++) {
            if (i < index){
                newHotel[i] = hotels[i];
            }else {
                newHotel[i] = hotels[i+1];
            }
        }
        return newHotel;
    }

    public static int fínHotelByIdentiny(String identiny, Hotel[] hotels){
        int index = -1;
        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i].getPerson().getIdentiny().equals(identiny)){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void displayHotelList(Hotel[] hotels){
        for (Hotel hotel : hotels){
            System.out.println(hotel);
        }
    }

    public static Hotel inputHotelInfor(Scanner scanner){
        System.out.println("Number of days : ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Type of room : ");
        String type = scanner.nextLine();
        System.out.println("Room Rates : ");
        double price = scanner.nextDouble();
        System.out.println("User's Personal Information: ");
        Person person = inputPersonInfor(scanner);
        return new Hotel(day, type, price, person);
    }

    public static  Person inputPersonInfor(Scanner scanner){
        System.out.println("Input name :");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Input date of birth : ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Input id card: ");
        String identiny = scanner.nextLine();
        return new Person(name, dateOfBirth, identiny);
    }
}
