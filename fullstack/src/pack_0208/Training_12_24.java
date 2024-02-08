package pack_0208;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Training_12_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		set.add(scan.next());
		set.add(scan.next());
		set.add(scan.next());
		
		for(String str:set)
			System.out.println(str);
		
		scan.close();
	}

}
