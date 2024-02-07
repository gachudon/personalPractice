package pack_0131;

import java.util.Scanner;

public class Practice_4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double usage = 0.0f;
		
		System.out.print("전기 사용량을 입력하세요-->> ");
		usage = scan.nextDouble();
		
		if(usage <=200) {
			System.out.printf("사용량 : %.1f kmh\n",usage);
			System.out.println("기본요금 : 910 원");
			System.out.println("단가 : 99.3 원");
			System.out.printf("전기 요금: %.1f 원\n",910+99.3*usage);
		} else if (usage <=400) {
			System.out.printf("사용량 : %.1f kmh\n",usage);
			System.out.println("기본요금 : 1600 원");
			System.out.println("단가 : 187.9 원");
			System.out.printf("전기 요금: %.1f 원\n",1600+187.9*usage);
		} else {
			System.out.printf("사용량 : %.1f kmh\n",usage);
			System.out.println("기본요금 : 7300 원");
			System.out.println("단가 : 280.6 원");
			System.out.printf("전기 요금: %.1f 원\n",7300+280.6*usage);
		}
		
		scan.close();
	}

}
