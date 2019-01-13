package ap.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity {

	private static final long serialVersionUID = 2673688096268007123L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
