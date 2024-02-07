package pack_0131;

import java.util.Scanner;

public class Practice_4_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int start = 0;
		int finish = 0;
		
		System.out.print("구구단의 시작단 입력--> ");
		start = scan.nextInt();
		
		System.out.print("구구단의 끝단 입력--> ");
		finish = scan.nextInt();
		if(start < finish) {
			for(int i=1;i<10;i++,System.out.println()) {
				for(int dan=start;dan<finish+1;dan++) {
					System.out.printf("%d * %d = %d\t", dan,i,dan*i);
				}
			}
		} else {
			for(int i=1;i<10;i++,System.out.println()) {
				for(int dan=start;dan>finish-1;dan--) {
					System.out.printf("%d * %d = %d\t", dan,i,dan*i);
				}
			}
		}
		
		scan.close();
	}

}
