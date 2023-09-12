package UOL.COMPASS.challenge01.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
public class CarRequestDTO {
    @NotBlank(message = "Brand is required")
    @Pattern(regexp = "^(Ford|Chevrolet|BMW|Volvo)$", message = "Invalid brand")
    private String brand;

    @NotBlank(message = "Color is required")
    private String color;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Fabrication year is required")
    private String fabrication_year;

//        getters and setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFabricationYear() {
        return fabrication_year;
    }

    public void setFabricationYear(String fabrication_year) {
        this.fabrication_year = fabrication_year;
    }
}


//        CarRequestDTO:
//
//        Esta classe é um DTO (Data Transfer Object) usado para receber dados de entrada da solicitação HTTP para registrar um novo carro.
//        Contém campos que representam os atributos de um carro, como marca, cor, nome e ano de fabricação.
//        Inclui anotações de validação para garantir que os dados de entrada atendam aos critérios estabelecidos, como marca válida.