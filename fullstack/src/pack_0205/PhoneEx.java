package pack_0205;

public class PhoneEx {

	public static void main(String[] args) {
		// 객체 생성
		DmbCellPhone phone = new DmbCellPhone("은하수폰","실버",10);
		// 상속받은 부모 필드
		System.out.printf("모델 : %s\n",phone.model);
		System.out.printf("색상 : %s\n", phone.color);
		// 자식의 필드
		System.out.printf("채널 : %s\n", phone.channel);
		// 상속받은 부모 메소드 호출
		phone.bell();
		phone.send("여보세요");
		phone.receive("안녕하세요! 저는 코난이에요");
		phone.hangup();
		// 자식의 메소드 호출
		phone.turnOnDmb();
		phone.changeChannel(20);
		phone.turnOffDmb();
	}

}
