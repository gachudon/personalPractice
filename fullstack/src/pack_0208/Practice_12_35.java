package pack_0208;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice_12_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("love", "사랑");
		map.put("apple", "사과");
		map.put("baby", "아기");
		Scanner scan = new Scanner(System.in);
		String s = "";
		while(true) {
			System.out.print("찾고 싶은 단어는? ");
			s = scan.nextLine();
			if(s.equals("-1")) break;
			for(Map.Entry<String, String> entry : map.entrySet()) {
				if(entry.getKey().equals(s)) {
					System.out.println(entry.getValue());
					break;
				}
			}
		}
		
		scan.close();
	}

}
