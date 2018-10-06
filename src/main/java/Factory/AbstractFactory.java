package Factory;

import Interfaces.Car;
import Interfaces.Moto;

public interface AbstractFactory {
    Car createCar(String name, String model);
    Moto createMoto(String name, String model);
}
