package pack_0208;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> sl = new ArrayList<String>();
		for(int i=0; i<4;i++) {
			System.out.print("이름을 입력하세요>>");
			sl.add(scan.nextLine());
		}
		String max = "";
		for(int i=0; i<4;i++) {
			System.out.print(sl.get(i)+" ");
			if(max.length() < sl.get(i).length())
				max = sl.get(i);
		}
		System.out.println();
		System.out.println("가장 긴 이름은 : "+max);
		
		scan.close();
	}

}
