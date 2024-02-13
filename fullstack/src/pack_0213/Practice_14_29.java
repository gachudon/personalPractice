package pack_0213;

public class Practice_14_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoteCounting[] vts = {new VoteCounting(1),new VoteCounting(2),new VoteCounting(3)};
		for(int i=0;i<3;i++) {
			vts[i].start();
		}
		for(int i=0;i<3;i++) {
			try {
			vts[i].join();
			}catch(InterruptedException e) {}
		}
		System.out.println("프로그램 종료");
	}

}
