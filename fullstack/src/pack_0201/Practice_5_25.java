package pack_0201;

import java.util.Scanner;

public class Practice_5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int theNumberOfStudents = 0;
		
		System.out.println("학생 수를 입력하세요");
		theNumberOfStudents = scan.nextInt();
		
		int[] score = new int[theNumberOfStudents];
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d번 학생의 점수를 입력하세요\n",i);
			score[i] = scan.nextInt();
		}
		
		System.out.printf("%d명의 학생 성적은 다음과 같습니다.\n",theNumberOfStudents);
		
		for(int i=0;i<score.length;i++)
			System.out.printf("%d ",score[i]);
		System.out.println();
		
		for(int i=0;i<score.length;i++) {
			if(score[i] >= 90)
				System.out.printf("%d번 학생의 등급은 A입니다.\n",i);
			else if(score[i] >= 80)
				System.out.printf("%d번 학생의 등급은 B입니다.\n",i);
			else if(score[i] >= 70)
				System.out.printf("%d번 학생의 등급은 C입니다.\n",i);
			else if(score[i] >= 60)
				System.out.printf("%d번 학생의 등급은 D입니다.\n",i);
			else
				System.out.printf("%d번 학생의 등급은 F입니다.\n",i);
		}
	}

}
