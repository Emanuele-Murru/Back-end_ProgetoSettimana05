package GestionalePrenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GestionalePrenotazioni.entities.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, String> {

}
