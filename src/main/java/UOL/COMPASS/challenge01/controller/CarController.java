package UOL.COMPASS.challenge01.controller;

import UOL.COMPASS.challenge01.dto.CarRequestDTO;
import UOL.COMPASS.challenge01.dto.CarResponseDTO;
import UOL.COMPASS.challenge01.entity.Car;
import UOL.COMPASS.challenge01.exception.InvalidBrandException;
import UOL.COMPASS.challenge01.service.CarMapper;
import UOL.COMPASS.challenge01.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    private final CarMapper carMapper;

    @PostMapping
    public ResponseEntity<?> registerCar(@Valid @RequestBody CarRequestDTO requestDTO) {
        try {
            Car car = carMapper.mapToEntity(requestDTO);
            Car savedCar = carService.registerCar(car);
            CarResponseDTO responseDTO = carMapper.mapToResponse(savedCar);
            return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
        } catch (InvalidBrandException e) {
            return ResponseEntity.badRequest().body("Invalid brand: " + e.getBrand());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @GetMapping("/{idChassi}")
    public ResponseEntity<CarResponseDTO> getCarByIdChassi(@PathVariable Long idChassi) {
        Car car = carService.getCarByIdChassi(idChassi);
        if (car == null) {
            return ResponseEntity.notFound().build();
        }
        CarResponseDTO responseDTO = carMapper.mapToResponse(car);
        return ResponseEntity.ok(responseDTO);
    }
}

/*        CarController:

        Esta classe é um controlador Spring que lida com as solicitações HTTP relacionadas a carros.
        Possui dois métodos principais:
        registerCar: Lida com solicitações POST para registrar novos carros. Realiza validações na entrada, como a marca,
        e chama o serviço para salvar o carro no banco de dados.
        getCarByIdChassi: Lida com solicitações GET para recuperar informações de um carro com base no ID do chassi. Chama
        o serviço para buscar o carro no banco de dados.
 */
