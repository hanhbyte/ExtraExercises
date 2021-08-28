package Lesson4.controller;

import Lesson4.model.Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassController {
    private List<Classes> classesList = new ArrayList<>();
    private StudentController studentController = new StudentController();

    public ClassController(){
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    public void showAll(){
        Iterator var1 = this.classesList.iterator();
        while (var1.hasNext()){
            Classes classes = (Classes)var1.next();
            System.out.println(classes);
        }
    }

    public void addNew(Classes classes){
        this.classesList.add(classes);
    }

    public void updateById(String id, Classes classes){
        int index = this.findById(id);
        if (index != -1){
            this.classesList.set(index, classes);
        }else {
            System.out.println("This student ID is not available");
        }
    }

    public void removeById(String id){
        int index =this.findById(id);
        if (index != -1){
            this.classesList.remove(index);
        }else {
            System.out.println("This student ID is not available");
        }
    }

    public int findById(String id){
        int index = -1;
        for (int i = 0; i < this.classesList.size(); i++) {
            if (((Classes)this.classesList.get(i)).getId().equals(id)){
                index = i;
                break;
            }
        }
        return  index;
    }

    public Classes findById(int index){
        return (Classes)this.classesList.get(index);
    }

    public void showNumberOfStudentInClass(){
        Iterator var1 = this.classesList.iterator();
        while (var1.hasNext()){
            Classes classes = (Classes)var1.next();
            int count = this.studentController.countStudentInClass(classes);
            System.out.println("Class "+classes.getName()+" with "+ count + "stuents");
        }
    }
}
