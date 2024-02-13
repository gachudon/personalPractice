package pack_0213;

public class PrintTable {
	public synchronized void printTable(int n) {
		System.out.println(n+"단 출력");
		for(int i=1;i<10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
			try{Thread.sleep(500);}
			catch(InterruptedException e) {}
		}
	}
}
