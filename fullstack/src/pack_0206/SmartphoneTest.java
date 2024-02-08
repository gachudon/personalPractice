package pack_0206;

public class SmartphoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarm a = new SmartPhone();
		a.playMusic("비의 랩소디");
		a.beep();
		
		SmartPhone sp = new SmartPhone();
		sp.playMusic("상어송");
		sp.call("010-1111-1111");
		sp.sendMessage("010-2222-2222", "내이름은 코난. 나는 탐정이죠");
	}

}
