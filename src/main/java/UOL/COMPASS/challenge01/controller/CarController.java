package UOL.COMPASS.challenge01.controller;

import UOL.COMPASS.challenge01.dto.CarRequestDTO;
import UOL.COMPASS.challenge01.dto.CarResponseDTO;
import UOL.COMPASS.challenge01.entity.Car;
import UOL.COMPASS.challenge01.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;
    @PostMapping
    public ResponseEntity<?> registerCar(@Valid @RequestBody CarRequestDTO requestDTO) {
        // Verificar se a marca é válida
        String brand = requestDTO.getBrand();
        if (!isValidBrand(brand)) {
            return ResponseEntity.badRequest().body("Invalid brand: " + brand);
        }
        // Converter o DTO de requisição para uma entidade Car
        Car car = new Car();
        car.setBrand(brand);
        car.setColor(requestDTO.getColor());
        car.setName(requestDTO.getName());
        car.setFabricationYear(requestDTO.getFabricationYear());
        try {
            carService.registerCar(car);
            // Converter a entidade salva em um DTO de resposta
            CarResponseDTO responseDTO = new CarResponseDTO(car.getChassiId(), car.getBrand(), car.getColor(), car.getName(), car.getFabricationYear());
            // Configurar outros campos do DTO de resposta conforme necessário
            return ResponseEntity.ok(responseDTO);
        } catch (Exception e) {
            // Tratar exceções (por exemplo, campos nulos) e retornar erros adequados
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
    @GetMapping("/{idChassi}")
    public ResponseEntity<CarResponseDTO> getCarByIdChassi(@PathVariable Long idChassi) {
        // Chamar o serviço para buscar o carro pelo ID e retorne a resposta adequada
        Car car = carService.getCarByIdChassi(idChassi);
        if (car == null) {
            // Retornar uma resposta 404 (Not Found) se o carro não for encontrado
            return ResponseEntity.notFound().build();
        }
        // Converter a entidade encontrada em um DTO de resposta
        CarResponseDTO responseDTO = new CarResponseDTO(car.getChassiId(), car.getBrand(), car.getColor(), car.getName(), car.getFabricationYear());
        // Configurar outros campos do DTO de resposta conforme necessário
        return ResponseEntity.ok(responseDTO);
    }
    private boolean isValidBrand(String brand) {
        // Verificar se a marca está entre as marcas permitidas
        return "Ford".equals(brand) || "Chevrolet".equals(brand) || "BMW".equals(brand) || "Volvo".equals(brand);
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
