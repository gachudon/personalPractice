package pack_0213;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"내이름은 코난","탐정이죠","범인은 바로 당신이야!"};
		Arrays.sort(strings,new Comparator<String>() {
			public int compare(String first, String second) {
				return first.length() - second.length();
			}
		});
		for(String s : strings)
			System.out.println(s);
	}

}
