package UOL.COMPASS.challenge01.exception;

import lombok.Getter;

@Getter
public class InvalidBrandException extends RuntimeException {
    private final String brand;

    public InvalidBrandException(String brand) {
        super("Invalid brand: " + brand);
        this.brand = brand;
    }
}