package Lesson4.model;

import Lesson4.model.Classes;

public class Student {
    private String idStudent;
    private String nameStudent;
    private String birthDay;
    private double markl;
    private Classes classes;

    public Student(String id, String name, String birthDay, double mark) {
    }

    public Student(String idStudent, String nameStudent, String birthDay, double markl, Classes classes) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.birthDay = birthDay;
        this.markl = markl;
        this.classes = classes;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public double getMarkl() {
        return markl;
    }

    public void setMarkl(double markl) {
        this.markl = markl;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", markl=" + markl +
                ", classes=" + classes +
                '}';
    }
}
