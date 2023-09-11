package UOL.COMPASS.challenge01.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
public class CarRequestDTO {
    @NotBlank(message = "Brand is required")
    @Pattern(regexp = "^(Ford|Chevrolet|BMW|Volvo)$", message = "Invalid brand")
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}


//   1 - O campo brand deve ser obrigatório (não em branco) - Isso é garantido pela anotação `@NotBlank`.

//   2 - O campo brand deve aceitar apenas marcas específicas (Ford, Chevrolet, BMW, Volvo) - Isso é validado pela anotação @Pattern,
//       que usa uma expressão regular para garantir que o valor do campo corresponda a uma das marcas especificadas.

//      O CarRequestDTO.java serve como um validador de dados de entrada de acordo com as regras estabelecidas no desafio.