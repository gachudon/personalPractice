package pack_0214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice_15_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int manu = 0;
		String s = "";
		ArrayList<Member> addrBook = new ArrayList<Member>();
		FileReader fr = null; FileWriter fw = null;
		BufferedReader in = null; BufferedWriter out = null;
		
		try {
			fr = new FileReader("contact.txt");
//			fw = new FileWriter("contact.txt");
			in = new BufferedReader(fr);
//			out = new BufferedWriter(fw);
			while((s = in.readLine()) != null) {
				String[] info = s.split(" ");
				addrBook.add(new Member(info[0],info[1],info[2]));
			}
			in.close();
			fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println(s);
		while(true) {
			System.out.println("===================================================================");
			System.out.println("1. 전화번호 추가 2. 전화번호 조회 3. 전화번호 삭제 4. 전화번호 목록 5. 연락처파일로 저장 6. 프로그램 종료");
			System.out.println("===================================================================");
			System.out.print("메뉴를 선택하세요>> ");
			manu = scan.nextInt();
			scan.nextLine();
			
			if(manu == 1) {
				System.out.println("이름, 전화번호, 주소 순으로 입력하세요");
				s = scan.nextLine();
				String[] info = s.split(" ");
				addrBook.add(new Member(info[0],info[1],info[2]));
			} else if(manu == 2) {
				System.out.print("조회할 회원의 이름을 입력하세요>> ");
				s = scan.nextLine();
				int flag = 0;
				for(int i=0;i<addrBook.size();i++) {
					if(addrBook.get(i).getName().equals(s)) {
						flag = 1;
						System.out.println(addrBook.get(i).toString());
						break;
					}
				}
				if(flag == 0) System.out.println("존재하지 않는 회원입니다.");
			} else if(manu == 3) {
				System.out.print("삭제할 회원의 이름을 입력하세요>> ");
				s = scan.nextLine();
				int flag = 0;
				for(int i=0;i<addrBook.size();i++) {
					if(addrBook.get(i).getName().equals(s)) {
						flag = 1;
						addrBook.remove(i);
						System.out.println("해당멤버를 삭제했습니다.");
						break;
					}
				}
				if(flag == 0) System.out.println("존재하지 않는 회원입니다.");
			} else if(manu == 4) {
				System.out.printf("목록에 저장된 회원 수는 %d명입니다.\n", addrBook.size());
				for(int i=0;i<addrBook.size();i++)
					System.out.println(addrBook.get(i).toString());
			} else if(manu == 5) {
				try {
					fw = new FileWriter("contact.txt");
					out = new BufferedWriter(fw);
					for(int i=0;i<addrBook.size();i++) {
						out.write(addrBook.get(i).toString()+"\n");
					}
					out.close(); fw.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			} else if(manu == 6){
				break;
			} else {}
		}
		scan.close();
	}

}
