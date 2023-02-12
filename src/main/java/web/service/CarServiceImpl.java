package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.dao.CarDao;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;
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
