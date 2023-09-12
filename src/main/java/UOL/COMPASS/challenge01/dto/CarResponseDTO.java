package UOL.COMPASS.challenge01.dto;
public class CarResponseDTO {
    private Long id_chassi;
    private String brand;

    public CarResponseDTO(Long id_chassi, String brand) {
        this.id_chassi = id_chassi;
        this.brand = brand;

    }

    public Long getId_chassi() {
        return id_chassi;
    }

    public void setId_chassi(Long id_chassi) {
        this.id_chassi = id_chassi;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
//        CarResponseDTO:
//
//        Esta classe é outro DTO, mas é usada para representar a resposta da API após o registro de um carro ou ao buscar um carro por ID.
//        Contém campos para o ID do chassi e a marca do carro, que são os principais dados retornados.