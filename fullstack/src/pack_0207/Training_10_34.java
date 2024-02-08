package pack_0207;

import java.util.Calendar;

public class Training_10_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		System.out.println("현재는 : "+calendar.getTime());
		calendar.add(Calendar.DATE,-15);
		System.out.println("15일 전은 : "+calendar.getTime());
		calendar.add(Calendar.MONTH, 4);
		System.out.println("4개월 후는 : "+ calendar.getTime());
		calendar.add(Calendar.YEAR,2);
		System.out.println("2년 후는 : "+ calendar.getTime());
	}
}
