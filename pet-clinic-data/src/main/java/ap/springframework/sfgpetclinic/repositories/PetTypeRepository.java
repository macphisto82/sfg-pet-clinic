package ap.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ap.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
