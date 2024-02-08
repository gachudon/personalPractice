package pack_0205;

public class DmbCellPhone extends CellPhone{
	int channel;
	DmbCellPhone(String model, String color, int channel){
		this.model = model; this.color = color; this.channel = channel;
	}
	void turnOnDmb() {System.out.printf("%d번 DMB 방송 수신을 시작한다.\n", channel);}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.printf("채널을 %d번으로 바꾼다.\n", channel);
	}
	void turnOffDmb() {System.out.println("DMB 방송 수신을 종료한다.\n");}
}
