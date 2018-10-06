package Builders;

import Models.CarDev;
import Models.CarProd;

public class CarProdBuilder {
    //Required fields
    private final String mName;
    private final String mModel;
    //Optional fields
    private String mDescription = "no Description";
    private int mYear = 2000;
    private int mPrice = 5000;

    public CarProdBuilder(String name, String model) {
        mName = name;
        mModel = model;
    }

    public CarProdBuilder setDescription(String description) {
        mDescription = description;
        return this;
    }

    public CarProdBuilder setYear(int year) {
        mYear = year;
        return this;
    }

    public CarProdBuilder setPrice(int price) {
        mPrice = price;
        return this;
    }

    public CarProd createCar() {
        return new CarProd(mName, mModel, mDescription, mYear, mPrice);
    }

}