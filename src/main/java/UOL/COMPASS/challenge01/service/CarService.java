package UOL.COMPASS.challenge01.service;

import UOL.COMPASS.challenge01.entity.Car;
import UOL.COMPASS.challenge01.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    public Car registerCar(Car car) {
        // Implementar a lógica de validação de dados do carro

        // Salvar o carro no banco de dados
        return carRepository.save(car);
    }
    public Car getCarById(Long idChassi) {
        // Implementar a lógica para buscar um carro pelo ID de chassi no banco de dados
        return carRepository.findById(idChassi).orElse(null);
    }
}
