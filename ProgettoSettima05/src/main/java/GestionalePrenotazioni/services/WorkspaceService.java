package GestionalePrenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GestionalePrenotazioni.entities.Workspace;
import GestionalePrenotazioni.repositories.WorkspaceRepository;
import GestionalePrenotazioni.utils.WorkspaceType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class WorkspaceService {

	@Autowired
	private WorkspaceRepository workspaceRepo;

	public void saveWorkspace(Workspace workspace) {

		workspaceRepo.save(workspace);
		log.info(workspace.getId() + " - " + workspace.getDescription() + " - " + workspace.getType() + " - "
				+ workspace.getMaxCapacity() + " - " + workspace.getBuilding() + " => " + " Saved on DB!");
	}

	public List<Workspace> findWorkspaceByCity(String city) {
		List<Workspace> workspaces = workspaceRepo.findByCity(city);

		if (workspaces.isEmpty()) {
			log.info("NO worskpaces found in this city");
		} else {
			log.info("Workspaces found fot this country {}", city);
			for (Workspace workspace : workspaces) {
				log.info("ID: {}, Description: {}, Type: {}, Max Capacity: {}, Building: {}", workspace.getId(),
						workspace.getDescription(), workspace.getType(), workspace.getMaxCapacity(),
						workspace.getBuilding().getCity());
			}
		}
		return workspaces;
	}
	
	public List<Workspace> findWorkspaceByType(WorkspaceType type) {
		List<Workspace> workspaces = workspaceRepo.findByType(type);

		if (workspaces.isEmpty()) {
			log.info("No workspaces found with this type {}", type);
		} else {
			log.info("Workspaces founds for this type {}: ", type);
			for (Workspace workspace : workspaces) {
				log.info("ID: {}, Descrizione: {}, Type: {}, Max Capacity: {}, Building: {}", workspace.getId(),
						workspace.getDescription(), workspace.getType(), workspace.getMaxCapacity(),
						workspace.getBuilding().getCity());
			}
		}

		return workspaces;
	}
}
