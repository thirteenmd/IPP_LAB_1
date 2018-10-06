package Factory;

import Builders.CarProdBuilder;
import Builders.MotoProdBuilder;
import Interfaces.Car;
import Interfaces.Moto;

public class ProductionFactory implements AbstractFactory  {
    public Car createCar(String name, String model) {
        return new CarProdBuilder(name, model).createCar();
    }

    public Moto createMoto(String name, String model) {
        return new MotoProdBuilder(name, model).createMoto();
    }
}
