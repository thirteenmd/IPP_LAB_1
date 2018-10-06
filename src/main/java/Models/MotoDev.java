package Models;

import Interfaces.Car;
import Interfaces.ClonableVehicles;
import Interfaces.Moto;

//Model
public class MotoDev extends ClonableVehicles implements Moto {
    //Required fields
    private final String name;
    private final String model;
    //Optional fields
    private String description;
    private int year;
    private int price;

    public MotoDev(String name, String model, String description, int year, int price) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarDev{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


    public void drive() {
        System.out.println(this.toString() + " - moto dev drive");

    }
}
