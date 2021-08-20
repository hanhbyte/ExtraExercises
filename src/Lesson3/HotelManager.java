package Lesson3;

import java.util.Scanner;

public class HotelManager {
    private Hotel[] hotels;

    public HotelManager(int size){
        hotels = new Hotel[size];
    }

    public HotelManager(Hotel[] hotels){
        this.hotels = hotels;
    }

    public Hotel[] getHotels(){
        return  hotels;
    }

    public void setHotels(Hotel[] hotels){
        this.hotels = hotels;
    }

    public void removeHotelInfo(int index){
        Hotel[] newHotel = new Hotel[this.hotels.length -1];
        for (int i = 0; i < newHotel.length; i++) {
            if (i < index){
                newHotel[i] = this.hotels[i];
            }else {
                newHotel[i] = this.hotels[i + 1];
            }
        }
        this.hotels = newHotel;
    }

    public int findHotelById(String identiny){
        int index = 1;
        for (int i = 0; i < this.hotels.length; i++) {
            if (this.hotels[i].getPerson().getIdentiny().equals(identiny)) {
                index = i;
                break;
            }
        }
        return  index;
    }

    public void displayHotelList(){
        for (Hotel hotel : this.hotels){
            System.out.println(hotel);
        }
    }

    public Hotel inputHotelInfor(Scanner scanner){
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

    public Person inputPersonInfor(Scanner scanner){
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
