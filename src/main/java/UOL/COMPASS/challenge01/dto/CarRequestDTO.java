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

    @Getter
    @NotBlank(message = "model is required")
    private String model;

    @NotBlank(message = "Fabrication year is required")
    private String fabricationYear;
}