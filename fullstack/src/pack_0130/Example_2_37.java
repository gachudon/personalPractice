package pack_0130;

import java.util.Scanner;

public class Example_2_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		String address = "";
		int age = 0;
		double height = 0.0f;
		
		System.out.print("당신의 이름을 입력하세요-->>");
		name = scan.next();
		
		System.out.print("당신의 주소를 입력하세요-->>");
		address = scan.next();
		
		System.out.print("당신의 나이를 입력하세요-->>");
		age = scan.nextInt();
		
		System.out.print("당신의 키(cm)를 입력하세요-->>");
		height = scan.nextDouble();
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("주소 : %s\n", address);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.1f\n", height);
		
		scan.close();
	}

}
