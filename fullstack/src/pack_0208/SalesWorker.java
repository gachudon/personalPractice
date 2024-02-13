package pack_0208;

public class SalesWorker extends PermanentWorker {
	
	public int salesAmount;
	public double bonusRatio;
	
	public SalesWorker(String name, int salary, int salesAmount, double bonusRatio) {
		super(name, salary);
		this.salesAmount = salesAmount;
		this.bonusRatio = bonusRatio;
	}
	
	public int getPay() {
		int bonus = (int)((double)salesAmount*bonusRatio);
		return super.getPay()+bonus;
	}
	
	public void showSalaryInfo() {
		showName();
		System.out.println(" --> 급여 : "+this.getPay());
		
	}
}
