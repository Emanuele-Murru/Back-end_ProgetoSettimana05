package GestionalePrenotazioni.BeansConfiguration;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import GestionalePrenotazioni.entities.Booking;
import GestionalePrenotazioni.entities.Building;
import GestionalePrenotazioni.entities.User;
import GestionalePrenotazioni.entities.Workspace;
import GestionalePrenotazioni.utils.WorkspaceType;

@Configuration
public class BeansConfig {
	
	@Bean("user1")
	public User user1() {
		return User.builder().username("emanuele.murru").nameAndSurname("Emanuele Murru").email("manu@manu.com")
				.build();
	}
	
	@Bean("building1")
	public Building building1() {
		return Building.builder().name("Roxy Bar").address("Via le dita dal naso").city("Cagliari").build();
	}
	
	@Bean("workspace1")
	public Workspace workspace1() {
		return Workspace.builder().id(UUID.randomUUID()).description("Cozy and Quiet").type(WorkspaceType.OPENSPACE).maxCapacity(30).building(building1()).build();
	}
	
	@Bean("booking1")
	public Booking booking1() {
		return Booking.builder().id(UUID.randomUUID()).bookingDate(LocalDate.of(2023, 7, 18)).workspace(workspace1()).user(user1()).build();
	}
	
	@Bean("user2")
	public User user2() {
		return User.builder().username("luca.quaglino").nameAndSurname("Luca Quaglino").email("luca@quaglino.com")
				.build();
	}
	
	@Bean("building2")
	public Building building2() {
		return Building.builder().name("Amazon").address("Piazza la bomba e scappa").city("Milano").build();
	}
	
	@Bean("workspace2")
	public Workspace workspace2() {
		return Workspace.builder().id(UUID.randomUUID()).description("Professional and equipped").type(WorkspaceType.OPENSPACE).maxCapacity(40).building(building2()).build();
	}
	
	@Bean("booking2")
	public Booking booking2() {
		return Booking.builder().id(UUID.randomUUID()).bookingDate(LocalDate.of(2023, 7, 25)).workspace(workspace2()).user(user2()).build();
	}
	
	@Bean("user3")
	public User user3() {
		return User.builder().username("manuel.centini").nameAndSurname("Manuel Centini").email("manuel@centini.com")
				.build();
	}
	
	@Bean("building3")
	public Building building3() {
		return Building.builder().name("Apple").address("Via a casino").city("Roma").build();
	}
	
	@Bean("workspace3")
	public Workspace workspace3() {
		return Workspace.builder().id(UUID.randomUUID()).description("Professional and very tech").type(WorkspaceType.OPENSPACE).maxCapacity(10).building(building3()).build();
	}
	
	@Bean("booking3")
	public Booking booking3() {
		return Booking.builder().id(UUID.randomUUID()).bookingDate(LocalDate.of(2023, 7, 25)).workspace(workspace3()).user(user3()).build();
	}
}
