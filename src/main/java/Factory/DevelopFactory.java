package Factory;

import Builders.CarDevBuilder;
import Builders.MotoDevBuilder;
import Interfaces.Car;
import Interfaces.Moto;


public class DevelopFactory implements AbstractFactory {

    public Car createCar(String name, String model) {
        return new CarDevBuilder(name, model).createCar();
    }

    public Moto createMoto(String name, String model) {
        return new MotoDevBuilder(name, model).createMoto();
    }
}
