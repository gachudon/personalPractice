package pack_0208;

public class TemporaryWorker extends Worker {
	
	public int payPerHour;
	public int workTime;
	
	public TemporaryWorker(String name, int payPerHour, int workTime) {
		super(name);
		this.payPerHour = payPerHour;
		this.workTime = workTime;
	}

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return payPerHour*workTime;
	}

	@Override
	public void showSalaryInfo() {
		// TODO Auto-generated method stub
		showName();
		System.out.println(" --> 급여 : "+this.getPay());
	}

}
