package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao{

    List<Car> cars = new ArrayList<>(List.of(
         new Car("car1", 1234, "Owner1"),
         new Car("car2", 2345, "Owner2"),
         new Car("car3", 3456, "Owner3"),
         new Car("car4", 4567, "Owner4"),
         new Car("car5", 5678, "Owner5")
    ));
    @Override
    public List<Car> getSomeCars(Integer number) {
        return List.copyOf(cars).subList(0, number);
    }
    @Override
    public List<Car> getAllCars() {
        return List.copyOf(cars);
    }
}
