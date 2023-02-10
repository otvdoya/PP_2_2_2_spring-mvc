package web.dao;

import web.model.Car;
import java.util.List;

public interface CarDao {

    List<Car> getSomeCars(Integer number);
    List<Car> getAllCars();

}
