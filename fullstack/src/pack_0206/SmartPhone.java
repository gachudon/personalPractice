package pack_0206;

public class SmartPhone implements Alarm, Phone,Messenger {
	private String phoneNumber;
	@Override
	public void playMusic(String title) {
		// TODO Auto-generated method stub
		System.out.printf("[%s]이 재생됨\n", title);
	}

	@Override
	public void beep() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.println("삐이익~");
		}
	}

	@Override
	public void sendMessage(String phoneNumber, String msg) {
		// TODO Auto-generated method stub
		System.out.printf("[%s]로 메시지 전송 : %s\n", phoneNumber,msg);
	}

	@Override
	public void receiveMsg() {
		// TODO Auto-generated method stub
		System.out.println("메시지가 도착했음");
	}

	@Override
	public void call(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.printf("[%s]로 전화걸기 시도..rrr\n", phoneNumber);
	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("전화를 받음");
	}

}
