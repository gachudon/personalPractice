package pack_0208;

public class Student {
	private String name;
	private int id;
	private String phoneNo;
	
	public Student(String name, int id, String phoneNo) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", phoneNo=" + phoneNo + "]";
	}
}
