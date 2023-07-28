package GestionalePrenotazioni.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GestionalePrenotazioni.entities.User;
import GestionalePrenotazioni.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public void saveUser(User user) {
		userRepo.save(user);
		log.info(user.getUsername() + " - " + user.getNameAndSurname() + " - " + user.getEmail() + " => " + " Saved on DB!");
	}
	
	public User findUserByUsername(String username) {
		Optional<User> optionalUser = userRepo.findById(username);
		
		return optionalUser.get();
	}
}
