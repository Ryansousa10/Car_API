package UOL.COMPASS.challenge01.dto;
public class CarResponseDTO {
    private Long id;
    private String brand;

    public CarResponseDTO(Long id, String brand) {
        this.id = id;
        this.brand = brand;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}


