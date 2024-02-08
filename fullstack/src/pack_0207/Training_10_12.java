package pack_0207;

public class Training_10_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = new String("abc");
//		Class clazz = str.getClass();
//		System.out.println(clazz);
//		System.out.println(clazz.getName());
//		System.out.println(clazz.getSimpleName());
		
		try {
			Class clazz = Class.forName("java.lang.Object");
			System.out.println(clazz);
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
