package Singleton;

import Interfaces.Vehicle;

import java.util.ArrayList;
import java.util.List;

//Singleton (Eager)
public class ShoppingCart {
    private static final ShoppingCart INSTANCE = new ShoppingCart();

    private List<Vehicle> mVehicles = new ArrayList<>();

    private ShoppingCart() {
    }

    public static ShoppingCart getInstance() {
        return INSTANCE;
    }

    public List<Vehicle> getVehicles() {
        return mVehicles;
    }

    public void addVehicle(Vehicle vehicle){
        mVehicles.add(vehicle);
    }
}
