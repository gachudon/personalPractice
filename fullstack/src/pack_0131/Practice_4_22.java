package pack_0131;

import java.util.Scanner;

public class Practice_4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID = "conan";
		final String PASSWORD = "1111";
		
		Scanner scan = new Scanner(System.in);
		
		String inputId = "";
		String inputPassword = "";
		
		System.out.print("사용자의 아이디 입력 : ");
		inputId = scan.nextLine();
		
		System.out.print("사용자의 패스워드 입력 : ");
		inputPassword = scan.nextLine();
		
		if(!inputId.equals(ID))
			System.out.println("등록된 사용자가 아닙니다. 회원 정보를 확인하세요");
		else if(!inputPassword.equals(PASSWORD))
			System.out.println("비밀번호가 틀렸습니다.");
		else
			System.out.println("로그인에 성공하셨습니다.");
		
		scan.close();
	}

}
