package UOL.COMPASS.challenge01.dto;

import lombok.Data;

@Data
public class CarResponseDTO {
    private Long chassiId;
    private String brand;
    private String color;
    private String name;
    private String fabricationYear;

    public CarResponseDTO(Long chassiId, String brand, String color, String name, String fabricationYear) {
        this.chassiId = chassiId;
        this.brand = brand;
        this.color = color;
        this.name = name;
        this.fabricationYear = fabricationYear;
    }
}

//        CarResponseDTO:
//
//        Esta classe é outro DTO, mas é usada para representar a resposta da API após o registro de um carro ou ao buscar um carro por ID.
//        Contém campos para o ID do chassi e a marca do carro, que são os principais dados retornados.