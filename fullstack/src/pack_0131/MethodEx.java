package pack_0131;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		int num = method2();
		System.out.println("method2가 반환한 값은"+num);
	}
	public static void method1() {
		System.out.println("나는 void 형 메소드");
	}
	public static int method2() {
		System.out.println("나는 반환값이 있는 메소드");
		return 1;
	}

}
