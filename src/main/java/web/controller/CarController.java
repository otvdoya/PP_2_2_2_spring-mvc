package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping()
    public String printCar(ModelMap model,
                           @RequestParam(value = "count", required = false) Integer count) {
        CarService service = new CarServiceImpl();
        model.addAttribute("cars", service.getCars(count));
        return "cars";
    }

}
