package pack_0216;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BookStore {

	public static HashMap<Book,Integer> cart;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		System.out.print("연락처를 입력하세요 : ");
		String phoneNo = scan.nextLine();
		
		Member member = new Member(name,phoneNo);
		cart = new HashMap<Book,Integer>();
		
		HashSet<Book> store = new HashSet<Book>(); 
		
		File file = new File("book.txt");
		FileReader fr = null; Scanner scanfile = null;
		
		Admin admin = new Admin("sam","222");
		
		try {
			
			fr = new FileReader(file);
			scanfile = new Scanner(new FileReader(file));
			
			while(scanfile.hasNext()) {
				
				store.add(new Book(scanfile.nextLine(),
						scanfile.nextLine(),
						Integer.parseInt(scanfile.nextLine()),
						scanfile.nextLine(),
						scanfile.nextLine(),
						scanfile.nextLine(),
						scanfile.nextLine()));
				
			}
			
			scanfile.close();fr.close();
			
		} catch(Exception e) {
			scan.close();
			return;
		}
		
		while(true) {
			int choice = 0;
			
			System.out.println("**********************************************");
			System.out.println("오늘의 선택, 코난문고");
			System.out.println("영원한 스테디셀러, 명탐정 코난시리즈를 만나보세요~");
			System.out.println("**********************************************");
			System.out.println("1. 고객정보 확인하기\t2. 장바구니 상품목록보기");
			System.out.println("3. 바구니에 항목 추가하기\t4. 장바구니의 항목 삭제하기");
			System.out.println("5. 장바구니 비우기\t6. 영수증 표시하기");
			System.out.println("7. 관리자 로그인\t8. 종료");
			System.out.println("**********************************************");
			System.out.print("메뉴번호를 선택해주세요 ");

			try {
			choice = Integer.parseInt(scan.nextLine());
			} catch(Exception e) {}
			
			if(choice == 1) {
				
				System.out.println("현재 고객정보 :");
				System.out.println(member.toString());
				
			}
			else if(choice ==2) {
				
				showCart();
				
			}
			else if(choice ==3) {
				
				Iterator<Book> it = store.iterator();
				while(it.hasNext()) {
					
					Book book = it.next();
					
					System.out.printf("%s|%s|%d|%s|%s|%s|%s\n",
							book.getBookId(),
							book.getTitle(),
							book.getUnitPrice(),
							book.getAuthor(),
							book.getDescription(),
							book.getCategory(),
							book.getReleaseDate());
					
				}
				
				System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
				String id = scan.nextLine();
				
				it = store.iterator();
				while(it.hasNext()) {
					
					Book book = it.next();
					if(book.getBookId().equals(id)) {
						
						System.out.println("장바구니에 추가하겠습니까? Y|N");
						if(scan.nextLine().equalsIgnoreCase("y")) {
							if(cart.get(book)== null) {
								cart.put(book, 1);
							}else {
								cart.put(book, cart.get(book)+1);
							}
							
							System.out.printf("%s 도서가 장바구니에 추가되었습니다.\n",id);
						}
					}
					
				}
				
			}
			else if(choice ==4) {
				
				showCart();
				if(!cart.isEmpty()) {
					System.out.print("장바구니에서 삭제할 도서의 ID를 입력하세요 : ");
					String id = scan.nextLine();
					
					for(Map.Entry<Book, Integer> m : cart.entrySet()) {
						if(m.getKey().getBookId().equals(id)) {
							System.out.println("장바구니의 항목을 하겠습니까? Y|N");
							if(scan.nextLine().equalsIgnoreCase("Y")) {
								Book book = m.getKey();
								cart.remove(book);
								System.out.printf("%s 장바구니에서 도서가 삭제되었습니다.\n",id);
								break;
							}
						}
					}
				}
				
			}
			else if(choice ==5) {
				showCart();
				System.out.println("장바구니를 비우시겠습니까? Y|N");
				if(scan.nextLine().equals("Y"))
					cart.clear();
			}
			else if(choice ==6) {
				String nm = member.getName();
				String pn = member.getPhoneNo();
				String address = "";
				
				System.out.println("배송받을 분은 고객정보와 같습니까? Y|N");
				if(scan.nextLine().equalsIgnoreCase("N")) {
					
					System.out.print("받는 사람 이름을 입력하세요 : ");
					nm = scan.nextLine();
					
					System.out.print("연락처를 입력하세요 : ");
					pn = scan.nextLine();
				}
					
				System.out.print("배송지를 입력해주세요 ");
				address = scan.nextLine();
				
				System.out.println("----------배송 받을 고객 정보----------");
				System.out.printf("고객명 : %s\t연락처 : %s\n", nm,pn);
				System.out.printf("배송지 : %s\t발송일 : %s\n", address,LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
				int sum = showCart();
				System.out.println("----------------------------------");
				System.out.printf("주문 총금액 : %d원\n", sum);
				System.out.println("----------------------------------");
			}
			else if(choice ==7) {
				System.out.println("관리자 정보를 입력하세요");
				System.out.print("아이디 : ");
				if (!admin.getId().equals(scan.nextLine())) continue;
				
				System.out.print("비밀번호 : ");
				if(!admin.getPassword().equals(scan.nextLine())) continue;
				
				System.out.println("도서 정보를 추가하겠습니까? Y|N");
				if(scan.nextLine().equalsIgnoreCase("Y")) {
					System.out.print("도서ID : ");
					String id = scan.nextLine();
					
					System.out.print("도서명 : ");
					String title = scan.nextLine();
					
					System.out.print("가격 : ");
					int unitPrice = Integer.parseInt(scan.nextLine());
					
					System.out.print("저자 : ");
					String author = scan.nextLine();
					
					System.out.print("설명 : ");
					String description = scan.nextLine();
					
					System.out.print("분야 : ");
					String category = scan.nextLine();
					
					System.out.print("출판일 : ");
					String releaseDate = scan.nextLine();
					
					store.add(new Book(id, title, unitPrice, author, description, category, releaseDate));
					try {
						FileWriter fw = new FileWriter(file);
						Iterator<Book> it = store.iterator();
						while(it.hasNext()) {
							Book book = it.next();
							fw.write(book.getBookId()+"\n");
							fw.write(book.getTitle()+"\n");
							fw.write(book.getUnitPrice()+"\n");
							fw.write(book.getAuthor()+"\n");
							fw.write(book.getDescription()+"\n");
							fw.write(book.getCategory()+"\n");
							fw.write(book.getReleaseDate()+"\n");
						}
						fw.close();
						System.out.println("새 도서 정보가 저장되었습니다.");
					} catch(Exception e) {}
				}
			}
			else if(choice ==8) {break;}
			
		}
		
		scan.close();
		
	}

	public static int showCart() {
		System.out.println("장바구니 상품 목록 :");
		System.out.println("----------------");
		System.out.println("도서ID|수량|합계");
		System.out.println("----------------");
		
		int sum = 0;
		
		if(!cart.isEmpty()) {
			for(Map.Entry<Book, Integer> m : cart.entrySet()) {
				sum += m.getKey().getUnitPrice()*m.getValue();
				System.out.printf("%s|%s|%s\n",
						m.getKey().getBookId(),
						m.getValue(),
						m.getKey().getUnitPrice()*m.getValue());
			}
		}
		return sum;
	}
	
}
