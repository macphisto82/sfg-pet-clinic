package ap.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ap.springframework.sfgpetclinic.model.Pet;
import ap.springframework.sfgpetclinic.services.PetService;

@Service
@Profile({"default", ",map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Pet save(Pet object) {
		return super.save(object);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}


}