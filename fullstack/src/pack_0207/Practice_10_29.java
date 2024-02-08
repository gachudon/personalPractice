package pack_0207;

import java.util.StringTokenizer;

public class Practice_10_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer st = new StringTokenizer(s,"/");
		int count = st.countTokens();
		
		for(int i=0;i<count;i++) {
			System.out.println(st.nextToken());
		}
	}

}
