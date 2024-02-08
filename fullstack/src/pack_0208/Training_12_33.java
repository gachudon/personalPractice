package pack_0208;

import java.util.HashMap;
import java.util.Map;

public class Training_12_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m = new HashMap<String, Integer>();
		String[] sample = {"to", "be","or","not","to","be","is","a","problem"};
		//문자열에 포함된 단의 빈도를 카운트
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a,(freq==null)?1:freq+1);
		}
		System.out.println(m.size()+"단어가 있습니다.");//7
		System.out.println(m.containsKey("to"));//true
		System.out.println(m.isEmpty());//false;
		System.out.println(m);//{not=1,to=2,...}
	}

}
