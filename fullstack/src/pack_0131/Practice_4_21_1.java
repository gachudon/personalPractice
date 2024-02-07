package pack_0131;

import java.util.Scanner;

public class Practice_4_21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String grade = "";
		
		System.out.print("학점을 입력하시오-->> ");
		grade = scan.next();
		
		switch(grade){
			case "A":
			case "B":
				System.out.println("참 잘했음");
				break;
			case "C":
			case "D":
				System.out.println("좀 더 노력해");
				break;
			default:
				System.out.println("다음 학기에 다시 만나요!");
				break;
		}
		
		scan.close();
	}

}
