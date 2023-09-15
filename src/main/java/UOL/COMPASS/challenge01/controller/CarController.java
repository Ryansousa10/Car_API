package UOL.COMPASS.challenge01.controller;

import UOL.COMPASS.challenge01.dto.CarRequestDTO;
import UOL.COMPASS.challenge01.dto.CarResponseDTO;
import UOL.COMPASS.challenge01.entity.Car;
import UOL.COMPASS.challenge01.exception.InvalidBrandException;
import UOL.COMPASS.challenge01.exception.InvalidChassiIdException;
import UOL.COMPASS.challenge01.service.CarMapper;
import UOL.COMPASS.challenge01.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    private final CarMapper carMapper;

    @PostMapping
    public ResponseEntity<Object> registerCar(@Valid @RequestBody CarRequestDTO requestDTO) {
        try {
            Car car = carMapper.mapToEntity(requestDTO);
            Car savedCar = carService.registerCar(car);
            CarResponseDTO responseDTO = carMapper.mapToResponse(savedCar);
            return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
        } catch (InvalidBrandException e) {
            // Lançar uma exceção ResponseStatusException com status 404
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid brand: " + e.getBrand());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @GetMapping("/{chassiId}")
    public ResponseEntity<Object> getCarByChassiId(@PathVariable Long chassiId) {
        try {
            Car car = carService.getCarByChassiId(chassiId);
            if (car == null) {
                throw new InvalidChassiIdException("Car with chassi id " + chassiId + " not found.");
            }
            CarResponseDTO responseDTO = carMapper.mapToResponse(car);
            return ResponseEntity.ok(responseDTO);
        } catch (InvalidChassiIdException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
}
