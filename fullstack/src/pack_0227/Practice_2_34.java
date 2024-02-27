package pack_0227;

public class Practice_2_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(1);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(6);
		linkedList.add(7);
		linkedList.add(8);
		System.out.println(linkedList.toString());
		System.out.println("--------------------");
		if(linkedList.insert(3, 100)) {
			System.out.println("데이터가 3인 노드 다음에 100 삽입하기");
			System.out.println(linkedList.toString());
		}
	}

}
