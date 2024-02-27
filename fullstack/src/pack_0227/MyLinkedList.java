package pack_0227;

public class MyLinkedList {
	private Node head;
	public MyLinkedList() {
		head = null;
	}
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = newNode;
	}
	public boolean remove(int data) {
		Node current = head;
		if(head ==null) return false;
		if(current.data==data) {
			head=head.next; return true;
		}
		while(current.next!=null) {
			if(current.next.data==data) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public boolean insert(int key, int data) {
		Node current = head;
		if(head == null) return false;
		if(current.data == key) {
			Node tmp = current.next.next;
			current.next.next = new Node(data);
			current.next.next.next = tmp;
			return true;
		}
		while(current.next!= null) {
			if(current.next.data == key) {
				Node tmp = current.next.next;
				current.next.next = new Node(data);
				current.next.next.next = tmp;
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public String toString() {
		if(head == null) {return "[]";}
		Node temp = head;
		String str="[";
		while(temp.next!=null) {
			str+=temp.data+",";
			temp=temp.next;
		}
		str+=temp.data;
		return str+"]";
	}
}
