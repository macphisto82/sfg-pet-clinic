package ap.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ap.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
	
}