package ap.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ap.springframework.sfgpetclinic.model.Vet;
import ap.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
