package Lesson1;

public class Customer {
    private String name;
    private String idHouse;
    private String idElectricMeter;

    public Customer(String name, int idHouser, int idElectricMeter) {
    }

    public Customer(String name, String idHouse, String idElectricMeter) {
        this.name = name;
        this.idHouse = idHouse;
        this.idElectricMeter = idElectricMeter;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(String idHouse) {
        this.idHouse = idHouse;
    }

    public String getIdElectricMeter() {
        return idElectricMeter;
    }

    public void setIdElectricMeter(String idElectricMeter) {
        this.idElectricMeter = idElectricMeter;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", idHouse='" + idHouse + '\'' +
                ", idElectricMeter='" + idElectricMeter + '\'' +
                '}';
    }
}
