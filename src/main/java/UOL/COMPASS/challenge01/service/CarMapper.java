package UOL.COMPASS.challenge01.service;

import UOL.COMPASS.challenge01.dto.CarRequestDTO;
import UOL.COMPASS.challenge01.dto.CarResponseDTO;
import UOL.COMPASS.challenge01.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    public Car mapToEntity(CarRequestDTO requestDTO) {
        Car car = new Car();
        car.setBrand(requestDTO.getBrand());
        car.setColor(requestDTO.getColor());
        car.setModel(requestDTO.getModel());
        car.setFabricationYear(requestDTO.getFabricationYear());
        return car;
    }

    public CarResponseDTO mapToResponse(Car car) {
        CarResponseDTO responseDTO = new CarResponseDTO();
        responseDTO.setChassiId(car.getChassiId());
        responseDTO.setBrand(car.getBrand());
        responseDTO.setColor(car.getColor());
        responseDTO.setModel(car.getModel());
        responseDTO.setFabricationYear(car.getFabricationYear());
        return responseDTO;
    }
}

