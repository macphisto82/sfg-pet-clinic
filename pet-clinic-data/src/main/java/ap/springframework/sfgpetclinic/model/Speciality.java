package ap.springframework.sfgpetclinic.model;

public class Speciality extends BaseEntity {

	private static final long serialVersionUID = 2924551864721126385L;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
