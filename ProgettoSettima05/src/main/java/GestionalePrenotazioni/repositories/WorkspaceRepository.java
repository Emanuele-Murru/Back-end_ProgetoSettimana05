package GestionalePrenotazioni.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import GestionalePrenotazioni.entities.Workspace;
import GestionalePrenotazioni.utils.WorkspaceType;

public interface WorkspaceRepository extends JpaRepository<Workspace, UUID> {

	List<Workspace> findByCity(String cityBuilding);

	List<Workspace> findByType(WorkspaceType type);
}
