package pack_0130;

import java.util.Scanner;

public class Practice_3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int speed = 0;
		int hour = 0;
		
		System.out.print("주행 속도(km/h) : ");
		speed = scan.nextInt();
		
		System.out.print("주행 시간(h) : ");
		hour = scan.nextInt();
		
		System.out.printf("주행 이동 거리(km) : %d\n", speed*hour);
		
		scan.close();
	}

}
