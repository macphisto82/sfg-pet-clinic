package ap.springframework.sfgpetclinic.model;

public class Person extends BaseEntity {

	private static final long serialVersionUID = 8908065082230719829L;
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
