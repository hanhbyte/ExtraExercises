package Lesson4.view;

import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public Main(){
    }

    public static void main(String[] args) {
        ClassesMenu classesMenu = new ClassesMenu();
        StudentMenu studentMenu = new StudentMenu();

        int choice;
        do {
            menu();
            System.out.println("Enter selection: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    classesMenu.run();
                    break;
                case 2:
                    studentMenu.run();
                    break;
            }
        }while (choice != 0);
    }

    private static void menu(){
        System.out.println("MANAGEMENT MENU");
        System.out.println("1. Classroom Management");
        System.out.println("2. Student Management");
        System.out.println("0. EXIT");
    }

    static {
        scanner = new Scanner(System.in);
    }
}
