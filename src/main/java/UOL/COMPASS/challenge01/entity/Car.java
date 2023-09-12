package UOL.COMPASS.challenge01.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chassiId;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String color;

    @Column(name = "\"fabricationYear\"")
    private String fabricationYear;
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
