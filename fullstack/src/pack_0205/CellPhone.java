package pack_0205;

public class CellPhone {
	String model;
	String color;
	void powerOn() {System.out.println("전원을 켠다.");}
	void powerOff() {System.out.println("전원을 끈다.");}
	void bell() {System.out.println("벨이 울린다.");}
	void send(String message) {System.out.printf("발신자 : %s\n", message);}
	void receive(String message) {System.out.printf("수신자 : %s\n", message);}
	void hangup() {System.out.println("전화를 끊는다.");}
}
