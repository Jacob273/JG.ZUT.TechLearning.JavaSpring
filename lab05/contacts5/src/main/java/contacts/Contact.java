package contacts;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Contact {
	@NotNull
	@Size(min = 3, max = 30)
	private String firstName;
	
	@NotNull
	@Size(min = 3, max = 30)
	private String lastName;
	
	@Pattern(regexp="\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")
	private String email;
	
	/**
	 Following shall match:
	        +48 123 456 789 
		    123456789
			123 456 789 
			123-456-789
			(+48) 123 456 789
			+48123456789
			0048123456789
				
		code taken from: https://stackoverflow.com/questions/45281440/regular-expression-for-a-polish-phone-number
	 */
	@Pattern(regexp="(?<!\\w)(\\(?(\\+|00)?48\\)?)?[ -]?\\d{3}[ -]?\\d{3}[ -]?\\d{3}(?!\\w)")
	private String phone;
	private Long id;

	public Contact() {
	}
	
	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	public Contact(Long id, String firstName, String lastName, String email, String phone) {
		this(firstName, lastName, email, phone);
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
