package pack_0208;

import java.util.HashSet;
import java.util.Set;

public class Training_12_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("conan",10));
		set.add(new Person("conan",10)); //같은 정보를 중복 저장 시도
		System.out.println("셋에 저장된 데이터 수 : "+set.size());
	}

}
