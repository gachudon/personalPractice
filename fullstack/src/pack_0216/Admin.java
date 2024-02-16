package pack_0216;

public class Admin extends Person {
	
	private String id;
	private String password;
	
	public Admin(String name, String phoneNo) {
		super(name, phoneNo);
		id = "Admin";
		password = "1234";
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	
}
