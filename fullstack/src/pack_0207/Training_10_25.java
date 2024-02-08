package pack_0207;

public class Training_10_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		sb.append("is pencil");	//문자열 덧붙이기
		System.out.println(sb);
		
		sb.insert(7, "my");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}

}
