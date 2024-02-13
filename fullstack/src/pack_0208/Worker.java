package pack_0208;

public abstract class Worker implements Employee {
	
	protected String name;
	
	public Worker(String name) {
		this.name = name;
	}
	
	@Override
	public void showName() {
		System.out.print("이름 : "+name);
	}
}
