package pack_0201;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" abcd"); String b = new String(",efg");
		
		a = a.concat(b); System.out.println(a);
		
		a = a.trim(); System.out.println(a);
		
		a = a.replace("ab", "12"); System.out.println(a);
		
		String s[] = a.split(",");
		for(int i=0;i<s.length;i++)
			System.out.println("분리된 "+ i + "번 문자열: "+s[i]);
		
		a = a.substring(3); System.out.println(a);
		
		char c = a.charAt(2); System.out.println(c);
	}

}
