package ap.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ap.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
