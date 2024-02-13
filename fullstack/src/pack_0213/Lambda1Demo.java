package pack_0213;

import java.util.Arrays;

public class Lambda1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"내이름은 코난","탐정이죠","범인은 바로 당신이야!"};
		
		Arrays.sort(strings, (first, second)->first.length()-second.length());
		
		for(String s : strings)
			System.out.println(s);
	}

}
