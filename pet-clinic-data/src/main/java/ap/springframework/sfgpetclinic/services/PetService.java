package ap.springframework.sfgpetclinic.services;

import java.util.Set;

import ap.springframework.sfgpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
