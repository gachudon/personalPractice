package pack_0208;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice_12_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> il = new ArrayList<Integer>();
		int i = 0;
		while(true) {
			System.out.print("점수를 입력하세요 : ");
			i = scan.nextInt();
			if(i<0) break;
			il.add(i);
		}
		System.out.println("학생들의 성적 : "+il);
		
		for(int j=0;j<il.size();j++) {
			System.out.printf("%d 학생의 성적은 %d점이며 학점은 %s이다\n", j,il.get(j),getGrade(il.get(j)));
		}
		
		scan.close();
	}
	
	public static String getGrade(Integer score) {
		if(score>=90)
			return "A";
		else if(score>=80)
			return "B";
		else if(score>=70)
			return "C";
		else if(score>=60)
			return "D";
		else
			return "F";
	}

}
