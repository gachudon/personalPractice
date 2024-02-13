package pack_0213;

public class PrintThread extends Thread {
	PrintTable pt;
	int n;
	PrintThread(PrintTable pt, int n){
		this.pt = pt; this.n = n;
	}
	public void run() {
		pt.printTable(n);
	}
}
