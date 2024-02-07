package pack_0131;

public class Practice_4_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("2와 3의 합은 %d\n", add(2,3));
		System.out.printf("2와 3의 차는 %d\n", minus(2,3));
		System.out.printf("2와 3의 곱은 %d\n", multi(2,3));
		System.out.printf("2 나누기 3은 %f\n", divide(2.0f,3.0f));
	}
	
	public static int add(int i, int j) {
		return i+j;
	}
	
	public static int minus(int i, int j) {
		return i-j;
	}
	
	public static int multi(int i, int j) {
		return i*j;
	}
	
	public static double divide(double i, double j) {
		return i/j;
	}

}
