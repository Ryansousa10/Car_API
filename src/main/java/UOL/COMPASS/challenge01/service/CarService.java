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

        return carRepository.save(car);
    }
    public Car getCarById(Long idChassi) {

        return carRepository.findById(idChassi).orElse(null);
    }
}

//        1- Injeção de Dependência: A classe utiliza a injeção de dependência para acessar o CarRepository, o que é uma boa
//        prática para gerenciar a persistência de dados.
//
//        2- Registro de Carro: O método registerCar recebe um objeto Car como entrada e implementa a lógica para salvar o
//        carro no banco de dados usando o carRepository.save(car). Isso está de acordo com o requisito de registrar um carro
//        no banco de dados.
//
//        3- Busca de Carro por ID de Chassi: O método getCarById implementa a lógica para buscar um carro pelo ID de chassi
//        no banco de dados usando carRepository.findById(idChassi).orElse(null). Isso está de acordo com o requisito de buscar
//        um carro pelo ID de chassi.