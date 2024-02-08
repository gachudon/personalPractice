package pack_0208;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice_12_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		
		System.out.println("이름, 아이디, 전화번호 순으로 입력하시오.");
		String name;
		int id;
		String phoneNo;
		for(int i=0;i<4;i++) {
			name = scan.next();
			id = scan.nextInt();
			phoneNo = scan.next();
			map.put(name, new Student(name,id,phoneNo));
		}
		
		System.out.println("등록된 학생의 수 : "+map.size());
		for(Map.Entry<String, Student> entry:map.entrySet()) {
			System.out.println(entry.getValue().toString());
		}
		
		scan.close();
	}

}

//conan 1 010-1111-1111
//rose 2 010-2222-2222
//ran 3 010-3333-3333
//kid 4 010-4444-4444