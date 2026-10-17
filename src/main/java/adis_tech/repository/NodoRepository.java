package adis_tech.repository;

import adis_tech.entity.Nodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NodoRepository extends JpaRepository<Nodo, Integer> {
}