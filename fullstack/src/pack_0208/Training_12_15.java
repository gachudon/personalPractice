package pack_0208;

import java.util.LinkedList;

public class Training_12_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> people = new LinkedList<String>();
		people.add("코난");
		people.addFirst("장미");
		people.addLast("미란");
		System.out.println(people);
		
		people.add(1,"키드");
		System.out.println(people);
		people.set(2, "유탐정");
		System.out.println(people);
		people.removeFirst();
		people.removeLast();
		System.out.println(people);
		
		people.remove(1);
		System.out.println(people);
		System.out.println(people.size());
		System.out.println(people.get(0));
		System.out.println(people.contains("키드"));
		System.out.println(people.indexOf("키드"));
	}

}
