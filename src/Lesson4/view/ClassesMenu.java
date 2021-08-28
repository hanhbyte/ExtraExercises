package Lesson4.view;

import Lesson4.controller.ClassController;
import Lesson4.model.Classes;

public class ClassesMenu {
    private ClassController classController = new ClassController();

    public ClassesMenu(){
    }

    public void run(){
        int choice;
        do {
            this.menu();
            System.out.println("Input force select : ");
            choice = Main.scanner.nextInt();
            Main.scanner.nextLine();
            switch (choice){
                case 1:
                    this.showAllClass();
                    break;
                case 2:
                    this.addNewClass();
                    break;
                case 3:
                    this.updateClassInfo();
                    break;
                case 4:
                    this.removeClass();
                    break;
                case 5:
                    this.addStudentToClass();
                    break;
                case 6:
                    this.showStudentInClass();
            }
        }while (choice != 0);
    }

    private void showStudentInClass(){
        this.classController.showNumberOfStudentInClass();
    }

    private void addStudentToClass(){
        System.out.println("Enter the class code you want to add students to: ");
        String id = Main.scanner.nextLine();
        int index = this.classController.findById(id);
        if (index == -1){
            System.out.println("This class code is not available!");
        }else {
            StudentMenu.studentController.showAll();
            Classes classes = this.classController.findById(index);
            System.out.println("Enter the student ID you want to add in the class: ");
            String studentId = Main.scanner.nextLine();
            int studenIndex = StudentMenu.studentController.findById(studentId);
            StudentMenu.studentController.addStudentToClass(studenIndex, classes);
        }
    }

    private void removeClass(){
        System.out.println("Enter the class code to edit : ");
        String id = Main.scanner.nextLine();
        this.classController.removeById(id);
    }

    private void updateClassInfo(){
        System.out.println("Enter the class code to edit : ");
        String id = Main.scanner.nextLine();
        Classes classes = this.inputClassFromKeyBoard();
        this.classController.updateById(id, classes);
    }

    private void addNewClass(){
        Classes classes = this.inputClassFromKeyBoard();
        this.classController.addNew(classes);
    }

    private Classes inputClassFromKeyBoard(){
        System.out.println("Enter class code : ");
        String id = Main.scanner.nextLine();
        System.out.println("Enter class name : ");
        String name = Main.scanner.nextLine();
        return new Classes(id, name);
    }

    private void showAllClass(){
        this.classController.showAll();
    }

    private void menu(){
        System.out.println("CLASSROOM MANAGEMENT");
        System.out.println("1. Show class list");
        System.out.println("2. Add a new class");
        System.out.println("3. Edit class information");
        System.out.println("4. Delete class");
        System.out.println("5. Add students to the classroom");
        System.out.println("6. Thống kê mỗi lớp có bao nhiêu sinh viên");
        System.out.println("0. EXIT");
    }
}
