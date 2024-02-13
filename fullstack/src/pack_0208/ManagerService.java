package pack_0208;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManagerService {
	
	private List<Worker> workers;
	
	public ManagerService() {
		workers = new ArrayList<Worker>();
	}
	
	public void addWorker(Worker worker) {
		workers.add(worker);
	}
	
	public void showAllSalaryInfo() {
		Iterator<Worker> it = workers.iterator();
		while(it.hasNext()) {
			Worker tmp = it.next();
			if(tmp instanceof PermanentWorker) {
				PermanentWorker ptmp = (PermanentWorker)tmp;
				ptmp.showSalaryInfo();
			}
			else if(tmp instanceof SalesWorker) {
				SalesWorker stmp = (SalesWorker)tmp;
				stmp.showSalaryInfo();
			}
			else {
				TemporaryWorker ttmp = (TemporaryWorker)tmp;
				ttmp.showSalaryInfo();
			}
		}
	}
	
	public void showSalaryInfo(String name) {
		Iterator<Worker> it = workers.iterator();
		while(it.hasNext()) {
			Worker tmp = it.next();
			if(!tmp.name.equals(name)) continue;
			
			if(tmp instanceof PermanentWorker) {
				PermanentWorker ptmp = (PermanentWorker)tmp;
				ptmp.showSalaryInfo();
				return;
			}
			else if(tmp instanceof SalesWorker) {
				SalesWorker stmp = (SalesWorker)tmp;
				stmp.showSalaryInfo();
				return;
			}
			else {
				TemporaryWorker ttmp = (TemporaryWorker)tmp;
				ttmp.showSalaryInfo();
				return;
			}
		}
	}
	
	public void showTotalSalary() {
		Iterator<Worker> it = workers.iterator();
		int sum = 0;
		while(it.hasNext()) {
			Worker tmp = it.next();
			if(tmp instanceof PermanentWorker) {
				PermanentWorker ptmp = (PermanentWorker)tmp;
				sum += ptmp.getPay();
			}
			else if(tmp instanceof SalesWorker) {
				SalesWorker stmp = (SalesWorker)tmp;
				sum += stmp.getPay();
				
			}
			else {
				TemporaryWorker ttmp = (TemporaryWorker)tmp;
				ttmp.showSalaryInfo();
				sum += ttmp.getPay();
			}
		}
		System.out.println("모든 사원들의 급여 총액은 : "+sum+"원");
	}
}
