package pack_0228;

public class GenericEx {
		
	public static <T extends Number> double add(T num1, T num2) {
		double result = num1.doubleValue() + num2.doubleValue();
		return result;
	}
	public static void main(String[] args) {
		Integer iNum1 = 5;
		Integer iNum2 = 10;
		Double dNum1 = 7.5;
		Double dNum2 = 3.2;
		
		System.out.println("정수의 합: "+ add(iNum1, iNum2));
		System.out.println("실수의 합: "+ add(dNum1, dNum2));
	}
}
