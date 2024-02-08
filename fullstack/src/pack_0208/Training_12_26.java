package pack_0208;

import java.util.HashSet;

public class Training_12_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> set = new HashSet<Book>();
		set.add(new Book(100,"어린왕자","쌩떽쥐베리",5));
		set.add(new Book(200,"행복한왕자","오스카와일드",10));
		set.add(new Book(300,"셜록홈즈","코난도일",8));
		for(Book book: set) {
			System.out.printf("%d %s %s %d\n"
					,book.id
					,book.title
					,book.author
					,book.quantity);
		}
	}

}
