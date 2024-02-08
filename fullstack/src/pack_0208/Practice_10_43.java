package pack_0208;

public class Practice_10_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Sam","Rhee","Kim"};
		String[] records = {"1111","2222","3333"};
		ArrayedGeneralBook gb = new ArrayedGeneralBook(names,records);
		System.out.println(gb.names());
		gb.add("Allan", "4444");
		gb.print();
		//Allan4444\nKim3333\nRhee2222\nSam1111\n
		System.out.println("현재 저장된 데이터의 크기 : "+ gb.size(names)); //4
		gb.add("Alex", "5555");
		System.out.println("현재 저장된 데이터의 크기 : "+ gb.size(names)); //5
		gb.print(); //Alex5555\nAllan4444\nKim3333\nRhee2222\nSam1111\n
		System.out.println(gb.nameExist("Alex")); //true
		gb.remove("Alex", "5555");
		gb.remove("Sam", "1111");
		gb.print(); //Allan4444\nKim3333\nRhee2222\n
		System.out.println("현재 저장된 데이터의 크기 : "+gb.size(names)); //3
		String foundRecord = gb.get("Allan");
		System.out.println(foundRecord); //4444
		
		
	}

}
