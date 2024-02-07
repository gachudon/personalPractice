package pack_0131;

import java.util.Scanner;

public class Practice_4_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		System.out.print("점수를 입력하시오-->>");
		score = scan.nextInt();
		if(score>=80)
			System.out.println("축하합니다! 합격입니다.");
		
		scan.close();
	}

}
