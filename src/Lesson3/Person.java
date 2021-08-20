package Lesson3;

public class Person {
    private String name;
    private String dateOfbirth;
    private String identiny;

    public Person() {
    }

    public Person(String name, String dateOfbirth, String identiny) {
        this.name = name;
        this.dateOfbirth = dateOfbirth;
        this.identiny = identiny;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getIdentiny() {
        return identiny;
    }

    public void setIdentiny(String identiny) {
        this.identiny = identiny;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfbirth='" + dateOfbirth + '\'' +
                ", identiny='" + identiny + '\'' +
                '}';
    }
}
