package Builders;

import Models.CarDev;

public class CarDevBuilder {
    //Required fields
    private final String mName;
    private final String mModel;
    //Optional fields
    private String mDescription = "no Description";
    private int mYear = 2000;
    private int mPrice = 5000;

    public CarDevBuilder(String name, String model) {
        mName = name;
        mModel = model;
    }

    public CarDevBuilder setDescription(String description) {
        mDescription = description;
        return this;
    }

    public CarDevBuilder setYear(int year) {
        mYear = year;
        return this;
    }

    public CarDevBuilder setPrice(int price) {
        mPrice = price;
        return this;
    }

    public CarDev createCar() {
        return new CarDev(mName, mModel, mDescription, mYear, mPrice);
    }

}