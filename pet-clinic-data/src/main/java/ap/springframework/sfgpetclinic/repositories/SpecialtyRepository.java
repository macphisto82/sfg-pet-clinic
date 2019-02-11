package ap.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ap.springframework.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {

}
