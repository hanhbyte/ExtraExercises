package Lesson4.view;

import Lesson4.controller.StudentController;
import Lesson4.model.Student;

public class StudentMenu {
    public static StudentController studentController = new StudentController();

    public StudentMenu(){
    }

    public void run(){
        int choice;
        do {
            this.menu();
            System.out.println("Enter your selection:");
            choice = Main.scanner.nextInt();
            Main.scanner.nextLine();
            switch (choice){
                case 1:
                    this.showAllStudent();
                    break;
                case 2:
                    this.addNewStudent();
                    break;
                case 3:
                    this.updateStudent();
                    break;
                case 4:
                    this.removeStudent();
                    break;
            }
        }while (choice != 0);
    }

    private void removeStudent(){
        System.out.println("Enter the class code to edit : ");
        String id = Main.scanner.nextLine();
        studentController.removeById(id);
    }

    private void updateStudent(){
        System.out.println("Enter the class code to edit : ");
        String id = Main.scanner.nextLine();
        Student student = this.inputStudentKeyFromBoard();
        studentController.updateById(id, student);
    }

    private void addNewStudent() {
        Student student = this.inputStudentKeyFromBoard();
        studentController.addNew(student);
    }

    private Student inputStudentKeyFromBoard(){
        System.out.println("Enter class code : ");
        String id = Main.scanner.nextLine();
        System.out.println("Enter class name : ");
        String name = Main.scanner.nextLine();
        System.out.println("Enter date of birth: ");
        String birthDay = Main.scanner.nextLine();
        System.out.println("Enter score : ");
        double mark = Main.scanner.nextDouble();
        Main.scanner.nextLine();
        Student student = new Student(id, name , birthDay, mark);
        return student;
    }

    private void showAllStudent(){
        studentController.showAll();
    }

    private void menu(){
        System.out.println("STUDENT MANAGEMENT");
        System.out.println("1. Display the list of students");
        System.out.println("2. Add students");
        System.out.println("3. Updating student information");
        System.out.println("4.Delete students");
        System.out.println("5. Sort");
        System.out.println("6. Show the top 5 students");
        System.out.println("0. EXIT");
    }
}
