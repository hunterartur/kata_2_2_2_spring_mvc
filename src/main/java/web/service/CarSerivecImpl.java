package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarSerivecImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("kia", "rio", 220));
        cars.add(new Car("bmv", "x5", 240));
        cars.add(new Car("moskvich", "412", 180));
        cars.add(new Car("lada", "granta", 200));
        cars.add(new Car("porshe", "caen", 300));
        cars.add(new Car("kia", "rio", 220));
        cars.add(new Car("bmv", "x5", 240));
        cars.add(new Car("moskvich", "412", 180));
        cars.add(new Car("lada", "granta", 200));
        cars.add(new Car("porshe", "caen", 300));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return ((count < 1) || (count >= 5)) ? cars : cars.stream().limit(count).collect(Collectors.toList());
    }
}
