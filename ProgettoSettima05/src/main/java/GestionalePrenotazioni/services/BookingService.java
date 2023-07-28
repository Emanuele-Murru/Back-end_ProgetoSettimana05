package GestionalePrenotazioni.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GestionalePrenotazioni.entities.Booking;
import GestionalePrenotazioni.entities.User;
import GestionalePrenotazioni.repositories.BookingRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepo;

	public void saveBooking(Booking booking) {
		User user = booking.getUser();
		if(!bookingRepo.existsByUserAndBookingDate(user, booking.getBookingDate())) {
						bookingRepo.save(booking);
			log.info(booking.getId() + " - " + booking.getBookingDate() + " - " + booking.getWorkspace() + " - " + booking.getUser()
			+ " => " + " Saved on DB!");
		} else {
			log.warn("This user {} already has a booking for this date {}" , user.getUsername(), booking.getBookingDate());
		}
	}
	
}
