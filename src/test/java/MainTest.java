import Builders.CarDevBuilder;
import Builders.MotoProdBuilder;
import Interfaces.Car;
import Interfaces.Moto;
import Models.CarDev;
import Models.MotoProd;
import Pool.VehiclePool;
import Singleton.ShoppingCart;
import Factory.AbstractFactory;
import Factory.FactoryProducer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void checkBuilder() {
        CarDev carDev1 = new CarDevBuilder("BMW", "Z4").setPrice(15000).setYear(2005).createCar();
        carDev1.drive();

        MotoProd motoProd = new MotoProdBuilder("BMW", "Z4").setPrice(15000).setYear(2005).createMoto();
        motoProd.drive();
    }

    @Test
    void checkFactory() {
        //dev
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory devFactory = factoryProducer.getFactory("dev");

        Car devCar = devFactory.createCar("BMW", "Z4");
        devCar.drive();

        //prod
        AbstractFactory prodFactory = factoryProducer.getFactory("prod");

        Moto prodMoto = prodFactory.createMoto("BMW", "Z4");
        prodMoto.drive();
    }

    @Test
    void checkObjectPool() throws CloneNotSupportedException {
        VehiclePool vehiclePool = new VehiclePool();
        vehiclePool.loadDefaultCars();

        Assert.assertNotEquals(vehiclePool.getVehicle(1).hashCode(),vehiclePool.getVehicle(1).hashCode());

        vehiclePool.getVehicle(1).drive();
        vehiclePool.getVehicle(2).drive();
        vehiclePool.getVehicle(3).drive();
        vehiclePool.getVehicle(4).drive();

    }

    @Test
    void checkSingleton() throws CloneNotSupportedException {
        VehiclePool vehiclePool = new VehiclePool();
        vehiclePool.loadDefaultCars();

        ShoppingCart shoppingCart = ShoppingCart.getInstance();

        shoppingCart.addVehicle(vehiclePool.getVehicle(1));
        shoppingCart.addVehicle(vehiclePool.getVehicle(3));

        ShoppingCart shoppingCart2 = ShoppingCart.getInstance();
        Assert.assertEquals(shoppingCart.hashCode(),shoppingCart2.hashCode());

        System.out.println(shoppingCart.getVehicles().toString());


    }
}