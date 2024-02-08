package pack_0208;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Training_12_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("코난");list.add("장미");
		list.add("미란");list.add("코난");
		
		HashSet<String> set = new HashSet<String>(list);
		set.add("키드");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
