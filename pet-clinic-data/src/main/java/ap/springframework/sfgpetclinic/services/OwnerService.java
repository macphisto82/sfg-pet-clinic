package ap.springframework.sfgpetclinic.services;

import ap.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
	
}
