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

//    1- Marca e ID: O DTO contém os campos id e brand, que são os campos exigidos para a resposta. O construtor recebe esses
//    campos e configura os getters e setters correspondentes.
//
//    2- Validação de Dados: O DTO não executa validação de dados, pois sua principal responsabilidade é transportar os dados
//    de resposta. A validação de dados é geralmente realizada nas classes de entrada, como o CarRequestDTO, e nas camadas de
//    serviço ou controle, conforme apropriado.
//
//    3- Sem campos nulos: O DTO não contém anotações para garantir que os campos não sejam nulos, mas isso pode ser tratado
//    em outros lugares, como na camada de serviço ou controle, conforme necessário.
