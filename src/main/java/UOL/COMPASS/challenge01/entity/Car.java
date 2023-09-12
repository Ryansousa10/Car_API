package UOL.COMPASS.challenge01.entity;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chassi")
    private Long id_chassi;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String fabricationYear;

    public Long getId_chassi() {
        return id_chassi;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(String fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

}



//        1- Anotações JPA: A classe Car é anotada com @Entity, indicando que ela é uma entidade gerenciada pelo JPA
//        (Java Persistence API). Ela também possui anotações para a chave primária (@Id) e a estratégia de geração de
//        chave (@GeneratedValue), que são típicas em entidades JPA.
//
//        2- Atributos: A classe possui os atributos id e brand, que correspondem aos campos da entidade que você deseja
//        persistir. O atributo id é a chave primária e é gerado automaticamente.
//
//        3- Validação de Dados: A classe não executa validação de dados, mas você pode adicionar validações adicionais
//        conforme necessário em sua camada de serviço ou controle, dependendo dos requisitos específicos do seu aplicativo.
//
//        4- Mapeamento de Colunas: A anotação @Column(nullable = false) na propriedade brand garante que esse campo não seja
//        nulo no banco de dados, o que é uma validação importante.
