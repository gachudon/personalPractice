package pack_0208;

import java.util.HashSet;
import java.util.Iterator;

public class Training_12_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();

//		set.add("one");
//		set.add("two");
//		set.add("three");
//		set.add("four");
				
		set.add("코난");set.add("장미");set.add("미란");
		set.add("키드");set.add("유탐정");set.add("장미");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
