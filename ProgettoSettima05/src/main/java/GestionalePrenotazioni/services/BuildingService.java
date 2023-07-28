package GestionalePrenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GestionalePrenotazioni.entities.Building;
import GestionalePrenotazioni.repositories.BuildingRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BuildingService {
	
	@Autowired
	private BuildingRepository buildingRepo;

	public void saveBuilding(Building building) {
		buildingRepo.save(building);
		log.info(building.getName() + " - " + building.getAddress() + " - " + building.getCity() + " => "
				+ "Saved on DB!");
	}
	
	
}
