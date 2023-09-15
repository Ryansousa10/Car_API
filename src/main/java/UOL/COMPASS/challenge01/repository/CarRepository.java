package UOL.COMPASS.challenge01.repository;

import UOL.COMPASS.challenge01.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Métodos de consulta
}