package UOL.COMPASS.challenge01.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;

@Data
public class CarRequestDTO {
    @NotBlank(message = "Brand is required")
    @Pattern(regexp = "^(Ford|Chevrolet|BMW|Volvo)$", message = "Invalid brand")
    private String brand;

    @NotBlank(message = "Color is required")
    private String color;

    @NotBlank(message = "Name is required")
    private String name;

    //        getters and setters
    @Getter
    @NotBlank(message = "Fabrication year is required")
    private String fabricationYear;
}


//        CarRequestDTO:
//
//        Esta classe é um DTO (Data Transfer Object) usado para receber dados de entrada da solicitação HTTP para registrar um novo carro.
//        Contém campos que representam os atributos de um carro, como marca, cor, nome e ano de fabricação.
//        Inclui anotações de validação para garantir que os dados de entrada atendam aos critérios estabelecidos, como marca válida.