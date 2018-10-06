package Builders;

import Models.MotoDev;
import Models.MotoProd;

public class MotoDevBuilder {
    //Required fields
    private final String mName;
    private final String mModel;
    //Optional fields
    private String mDescription = "no Description";
    private int mYear = 2000;
    private int mPrice = 5000;

    public MotoDevBuilder(String name, String model) {
        mName = name;
        mModel = model;
    }

    public MotoDevBuilder setDescription(String description) {
        mDescription = description;
        return this;
    }

    public MotoDevBuilder setYear(int year) {
        mYear = year;
        return this;
    }

    public MotoDevBuilder setPrice(int price) {
        mPrice = price;
        return this;
    }

    public MotoDev createMoto() {
        return new MotoDev(mName, mModel, mDescription, mYear, mPrice);
    }

}