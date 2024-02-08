package pack_0202;

public class Employee {
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percent) {
		salary*=1.0+(double)percent/100;
		return salary;
	}
	
	public String toString() {
		return "Employee[id="+ id +", name="+name+", salary="+salary+"]";
	}
}
