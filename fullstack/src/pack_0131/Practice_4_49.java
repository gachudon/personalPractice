package pack_0131;

public class Practice_4_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countdown(10);
	}
	
	public static void countdown(int param) {
		System.out.println("카운트다운 시작~");
		for(int i = param;i>-1;i--) {
			System.out.printf("%d..\n", i);
		}
		System.out.println("발사!!");
	}

}
