package ap.springframework.sfgpetclinic.services;

import java.util.Set;

import ap.springframework.sfgpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
	
}
