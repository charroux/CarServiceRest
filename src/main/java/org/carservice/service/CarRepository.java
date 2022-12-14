package org.carservice.service;

import org.carservice.persistence.CarJPA;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<CarJPA, Long> {

    List<CarJPA> findByPlateNumber(String plateNumber);

}