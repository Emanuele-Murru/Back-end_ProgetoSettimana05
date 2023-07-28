package GestionalePrenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import GestionalePrenotazioni.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
