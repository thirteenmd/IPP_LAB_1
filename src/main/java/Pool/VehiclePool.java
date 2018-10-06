package Pool;

import Builders.CarDevBuilder;
import Builders.CarProdBuilder;
import Builders.MotoDevBuilder;
import Builders.MotoProdBuilder;
import Interfaces.Car;
import Interfaces.ClonableVehicles;
import Interfaces.Vehicle;
import Models.CarDev;
import Models.CarProd;
import Models.MotoProd;

import java.util.HashMap;
import java.util.Map;
//Object pool + prototype
public class VehiclePool {
    private static Map<Integer, Vehicle> defaultVehicles = new HashMap<>();

    public Vehicle getVehicle(int vehIndex) throws CloneNotSupportedException {
        ClonableVehicles clonableVehicles = (ClonableVehicles) defaultVehicles.get(vehIndex);
        return (Vehicle) clonableVehicles.clone();
    }

    public static void loadDefaultCars(){
        Vehicle vehicle1 = new CarDevBuilder("BMW", "Z4").setPrice(15000).setYear(2005).createCar();
        Vehicle vehicle2 = new CarProdBuilder("Nissan", "Micra").setPrice(6000).setYear(2008).createCar();
        Vehicle vehicle3 = new MotoDevBuilder("Suzuki", "Bandit").setPrice(15000).setYear(2015).createMoto();
        Vehicle vehicle4 = new MotoProdBuilder("Honda", "Hornet").setPrice(4000).setYear(2010).createMoto();

        defaultVehicles.put(1, vehicle1);
        defaultVehicles.put(2, vehicle2);
        defaultVehicles.put(3, vehicle3);
        defaultVehicles.put(4, vehicle4);
    }
}
