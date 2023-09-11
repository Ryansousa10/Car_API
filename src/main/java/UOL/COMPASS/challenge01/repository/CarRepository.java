package UOL.COMPASS.challenge01.repository;

import UOL.COMPASS.challenge01.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Métodos de consulta
}




//        1- Extensão de JpaRepository: A interface CarRepository estende JpaRepository<Car, Long>, o que é apropriado para
//        realizar operações de acesso ao banco de dados relacionadas aos carros. A primeira classe genérica, Car, é a entidade
//        que você deseja gerenciar, e a segunda classe genérica, Long, é o tipo da chave primária da entidade.
//
//        2- Anotação @Repository: A anotação @Repository está presente, indicando que esta é uma classe de repositório
//        gerenciada pelo Spring.
//
//        3- Métodos de Consulta: Atualmente, a interface não define métodos de consulta personalizados além dos que são
//        fornecidos automaticamente pelo Spring Data JPA. Isso é apropriado, pois você pode usar os métodos gerados
//        automaticamente para realizar operações CRUD básicas em entidades Car. Se você precisar de métodos de consulta
//        personalizados, pode adicioná-los a esta interface, seguindo a convenção de nomenclatura adequada do Spring Data JPA.
//
//        4- Configuração Básica: O código fornecido representa a configuração básica de um repositório e deve ser suficiente
//        para executar operações básicas de CRUD em entidades Car.
