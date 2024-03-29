package pack_0205;

public class Person {
	private String name;
	private String addr;
	
	public Person(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString() {
		return "Person[name="+name+", address="+addr+"]";
	}
}
