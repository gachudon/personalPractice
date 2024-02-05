package pack_0130;

import java.util.Scanner;

public class Practice_2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int totalSec = 0;
		int sec = 0;
		int min = 0;
		int hour = 0;
		
		System.out.print("시간을 초단위로 입력하세요 : ");
		totalSec = scan.nextInt();
		
		min = totalSec/60;
		sec = totalSec%60;
		hour = min/60;
		min = min%60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다",totalSec,hour,min,sec);
		
		scan.close();
	}

}
