package Builders;

import Models.CarProd;
import Models.MotoProd;

public class MotoProdBuilder {
    //Required fields
    private final String mName;
    private final String mModel;
    //Optional fields
    private String mDescription = "no Description";
    private int mYear = 2000;
    private int mPrice = 5000;

    public MotoProdBuilder(String name, String model) {
        mName = name;
        mModel = model;
    }

    public MotoProdBuilder setDescription(String description) {
        mDescription = description;
        return this;
    }

    public MotoProdBuilder setYear(int year) {
        mYear = year;
        return this;
    }

    public MotoProdBuilder setPrice(int price) {
        mPrice = price;
        return this;
    }

    public MotoProd createMoto() {
        return new MotoProd(mName, mModel, mDescription, mYear, mPrice);
    }

}