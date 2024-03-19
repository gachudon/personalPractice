package pack_0228;

import java.util.Scanner;

public class QueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MyQueue s = new MyQueue(10);
		while(true) {
			System.out.println("현재 데이터 수: "+s.size()+"/"+s.capacity());
			System.out.println("(1)인큐 (2)디큐 (3)피크 "+"(4)덤프 (0)종료:");
			int menu = scan.nextInt();
			if(menu == 0) break;
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				x = scan.nextInt();
				s.enque(x);
//				System.out.printf("현재 데이터 수 : %d/%d\n",s.size(),s.capacity());
				break;
			case 2:
				System.out.printf("디큐한 데이터는 %d임\n", s.deque());
//				System.out.printf("현재 데이터 수 : %d/%d\n",s.size(),s.capacity());
				break;
			case 3:
				s.peek();
//				System.out.printf("현재 데이터 수 : %d/%d\n",s.size(),s.capacity());
				break;
			case 4:
				s.dump();
//				System.out.printf("현재 데이터 수 : %d/%d\n",s.size(),s.capacity());
				break;
			}
		}
	}

}
