package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;
import web.dao.CarDao;
import java.util.List;

public class CarServiceImpl implements CarService{

    private CarDao carDao = new CarDaoImpl();
    @Override
    public List<Car> getCars(Integer number) {
        try {
            if (number < carDao.getAllCars().size()) {
                return carDao.getSomeCars(number);
            }
        } catch (NullPointerException e) {
            return carDao.getAllCars();
        }
        return carDao.getAllCars();
    }

}
