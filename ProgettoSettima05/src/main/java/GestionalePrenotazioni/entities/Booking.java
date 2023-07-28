package GestionalePrenotazioni.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Booking {
	@Id
	private UUID id;
	private LocalDate bookingDate;
	@ManyToOne
	private Workspace workspace;
	@ManyToOne
	private User user;
	
	private LocalDate expiryBookingDate;
}
