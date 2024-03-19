package pack_0228;

import java.util.List;

public class WildCardEx {
	
	public static void printList(List<?>list) {
		for(Object item : list) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = List.of(1,2,3,4,5);
		System.out.println("숫자 리스트");
		printList(integers);
		
		List<String> strings = List.of("apple","orange","banana");
		System.out.println("문자열 리스트");
		printList(strings);
	}

}
