package pack_0213;

public class PrintThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable pt = new PrintTable();
		PrintThread th1 = new PrintThread(pt,2);
		PrintThread th2 = new PrintThread(pt,5);
		th1.start(); th2.start();
	}

}
