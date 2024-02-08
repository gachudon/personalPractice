package pack_0208;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person) obj;
			return person.getName().equals(name) && person.getAge() == age;
		}
		else
			return false;
		}
	
	@Override
	public int hashCode() {
		return name != null ? name.hashCode():0;
	}
}
