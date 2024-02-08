package pack_0205;

import java.util.Scanner;

public class Practice_7_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i=0;
		Book[] book = new Book[10];
		int j=0;
		int fcount=0;
		
		while(true) {
			System.out.println("1.도서 정보 입력|2.도서 목록 보기|3.검색하기(제목)|4.수량정보(여성작가수량/보유도서수량)|5.프로그램종료");
			i = scan.nextInt();
			if(i==1) {
				System.out.println("책제목, 저자, 이메일, 성별, 가격, 수량 순으로 입력하시오-->>");
				String title = scan.next();
				String name = scan.next();
				String email = scan.next();
				String gender = scan.next();
				double price = scan.nextDouble();
				int qty = scan.nextInt();
				
				Author author = new Author(name,email,gender);
				book[j] = new Book(title, author, price, qty);
				if(gender.equals("f")) fcount++;
				j++;
			}
			else if(i==2) {
				for(int k=0;k<j;k++) {
					System.out.println(book[k].toString());
				}
			}
			else if(i==3) {
				System.out.print("제목을 입력하세요-->> ");
				String title = scan.nextLine();
				for(int k=0;book[k]!=null;k++) {
					if(book[k].getTitle().equals(title)) {
						book[k].toString();
						break;
					}
				}
			}
			else if(i==4) {
				System.out.printf("여성작가도서/총보유도서 : (%d/%d)\n", fcount,j);
			}
			else {
				break;
			}
		}
		scan.close();
	}

}
