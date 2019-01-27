package ap.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import ap.springframework.sfgpetclinic.model.Speciality;
import ap.springframework.sfgpetclinic.services.SpecialtiesService;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtiesService {

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

}
