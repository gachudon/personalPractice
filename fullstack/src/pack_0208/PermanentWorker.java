package pack_0208;

public class PermanentWorker extends Worker {
	
	public int salary;
	
	public PermanentWorker(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void showSalaryInfo() {
		// TODO Auto-generated method stub
		showName();
		System.out.println(" --> 급여 : "+this.getPay());
	}

}
