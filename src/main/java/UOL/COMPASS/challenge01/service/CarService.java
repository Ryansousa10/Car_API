package UOL.COMPASS.challenge01.service;

import UOL.COMPASS.challenge01.entity.Car;
import UOL.COMPASS.challenge01.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public Car registerCar(Car car) {
        // Validar a marca
        String brand = car.getBrand();
        if (!isValidBrand(brand)) {
            throw new IllegalArgumentException("Invalid brand: " + brand);
        }
        // Validar campos nulos
        validateCarFields(car);
        return carRepository.save(car);
    }

    public Car getCarByIdChassi(Long idChassi) {
        return carRepository.findById(idChassi).orElse(null);
    }

    private boolean isValidBrand(String brand) {
        return "Ford".equals(brand) || "Chevrolet".equals(brand) || "BMW".equals(brand) || "Volvo".equals(brand);
    }

    private void validateCarFields(Car car) {
        if (car == null || car.getBrand() == null || car.getModel() == null || car.getColor() == null || car.getFabricationYear() == null) {
            throw new IllegalArgumentException("Car fields cannot be null");
        }
    }
}

//      CarService:
//
//      Esta classe é o serviço subjacente que realiza a lógica de negócios relacionada a carros.
//      O método registerCar recebe um objeto Car como entrada, valida os dados (marca e campos não nulos)
//      e salva o carro no banco de dados.
//      O método getCarByIdChassi permite buscar um carro no banco de dados com base no ID do chassi.
//      Os métodos isValidBrand e validateCarFields auxiliam nas verificações e validações necessárias.