package pack_0208;

public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerService manager = new ManagerService();
		manager.addWorker(new PermanentWorker("코난",3000));
		manager.addWorker(new PermanentWorker("장미", 3500));
		manager.addWorker(new TemporaryWorker("알바1", 9, 100));
		manager.addWorker(new TemporaryWorker("알바2", 8, 70));
		manager.addWorker(new SalesWorker("판매왕",1000,200000,0.01));
		manager.addWorker(new SalesWorker("판매신입",1000,50000,0.01));
		manager.showAllSalaryInfo();
		manager.showSalaryInfo("코난");
		manager.showTotalSalary();
	}

}
