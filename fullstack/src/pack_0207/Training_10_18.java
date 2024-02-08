package pack_0207;

public class Training_10_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = 10;
		char c = '4';
		Double d = 3.14;
		System.out.println(Character.toLowerCase('A'));
		if(Character.isDigit(c))
			System.out.println(Character.getNumericValue(c));
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("10",16));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		System.out.println(Integer.toHexString(28));
		System.out.println(i.doubleValue());
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("44.13e-6"));
	}

}
