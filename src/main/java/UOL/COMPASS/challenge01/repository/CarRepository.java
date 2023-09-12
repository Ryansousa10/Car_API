package UOL.COMPASS.challenge01.repository;

import UOL.COMPASS.challenge01.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Métodos de consulta
}




//        CarRepository:
//
//        Esta é uma interface Spring Data JPA que estende JpaRepository. Isso fornece métodos prontos para acessar o banco de dados relacionado à entidade Car.
//        Não é necessário fornecer uma implementação, pois o Spring Data JPA cuida disso.