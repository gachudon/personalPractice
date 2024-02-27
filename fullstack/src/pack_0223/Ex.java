package pack_0223;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(b==d);
		System.out.println(e==f);
	}

}
