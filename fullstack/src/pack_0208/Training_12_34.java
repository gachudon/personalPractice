package pack_0208;

import java.util.HashMap;
import java.util.Map;

public class Training_12_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Book> map = new HashMap<Integer, Book>();
		map.put(1, new Book(100,"어린왕자","쌩떽쥐베리",5));
		map.put(2, new Book(200,"행복한왕자","오스카와일드",10));
		map.put(3, new Book(300,"셜록홈즈","코난도일",8));
		for(Map.Entry<Integer,Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book book = entry.getValue();
			System.out.println(key+"의 세부 항목");
			System.out.printf("%d %s %s %d\n"
					,book.id
					,book.title
					,book.author
					,book.quantity);
			System.out.println("------------------");
			
		}
	}

}
