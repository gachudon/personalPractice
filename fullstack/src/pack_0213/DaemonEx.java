package pack_0213;

public class DaemonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true);
		
		at.start();
		try {Thread.sleep(3000);}
		catch(InterruptedException e) {}
		System.out.println("메인쓰레드 종료");
	}

}
