package Lesson4.controller;

import Lesson4.model.Classes;
import Lesson4.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentController implements DoAll<Student> {
    private List<Student> students = new ArrayList<>();

    public StudentController() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void showAll() {
        Iterator var1 = this.students.iterator();
        while (var1.hasNext()) {
            Student student = (Student) var1.next();
            System.out.println(student);
        }
    }

    public void addNew(Student student){
        this.students.add(student);
    }

    public void updateById(String id, Student student){
        int index = this.findById(id);
        if (index != 1){
            this.students.set(index, student);
        }else{
            System.out.println("This student ID is not available.");
        }
    }

    public void removeById(String id){
        int index = this.findById(id);
        if (index != 1){
            this.students.remove(index);
        }else {
            System.out.println("This student ID is not available");
        }
    }

    public int findById(String id){
        int index = -1;
        for (int i = 0; i < this.students.size(); i++) {
            if (((Student)this.students.get(i)).getIdStudent().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void addStudentToClass(int index, Classes classes){
        Student student = (Student)this.students.get(index);
        student.setClasses(classes);
        this.students.set(index, student);
    }

    public int countStudentInClass(Classes classes){
        int count = 0;
        for (int i = 0; i < this.students.size(); i++) {
            Student student =(Student) this.students.get(i);
            if (student.getClasses().getId().equals(classes.getId())){
                ++count;
            }
        }
        return count;
    }
}
