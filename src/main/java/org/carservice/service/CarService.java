package org.carservice.service;

import org.carservice.web.Car;
import org.carservice.web.CarNotFoundException;

import java.util.List;

public interface CarService {
    public void addCar(Car car);
    public void rent(String plateNumber) throws CarNotFoundException;
    public void getBack(String plateNumber) throws CarNotFoundException;
    public List<Car> carToBeRented();
}
