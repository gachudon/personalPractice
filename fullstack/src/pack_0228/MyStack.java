package pack_0228;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	
	private List<T> stack;
	public MyStack() {
		this.stack = new ArrayList<>();
	}
	
	public void push(T item) {
		stack.add(item);
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.remove(stack.size()-1);
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.get(stack.size()-1);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
//	private int tos;
//	private int[] stk;
//	private int capa;
//	
//	public class EmptyMyStackException extends RuntimeException{
//		public EmptyMyStackException(String msg) {super(msg);}
//	}
//	
//	public class OverflowMyStackException extends RuntimeException{
//		public OverflowMyStackException(String msg) {super(msg);}
//	}
//	
//	public MyStack(int capa) {
//		tos = 0;
//		this.capa = capa;
//		try {
//			stk = new int[capa];
//		} catch(OutOfMemoryError e) {
//			this.capa = 0;
//		}
//	}
//	
//	public int push(int element) throws OverflowMyStackException{
//		if(tos >= capa)
//			throw new OverflowMyStackException("스택이 가득 참");
//		return stk[tos++] = element;
//	}
//	
//	public int pop() throws EmptyMyStackException {
//		if(tos <= 0)
//			throw new EmptyMyStackException("스택이 비어 있음");
//		return stk[--tos];
//	}
//	public int peek() throws EmptyMyStackException{
//		if(tos <= 0)
//			throw new EmptyMyStackException("스택이 비어 있음");
//		return stk[tos-1];
//	}
//	
//	public int indexOf(int element) {
//		for(int i = tos-1;i>=0;i--)
//			if(stk[i]==element)
//				return i;
//		return -1;
//	}
//	
//	public void clear() {
//		tos = 0;
//	}
//	public int capacity() {
//		return capa;
//	}
//	
//	public int size() {
//		return tos;
//	}
//	
//	public boolean isEmpty() {
//		return tos <= 0;
//	}
//	
//	public boolean isFull() {
//		return tos >= capa;
//	}
//	
//	public void dump() {
//		if(tos <=0)
//			System.out.println("스택이 비어 있습니다.");
//		else {
//			for(int i=0;i<tos;i++)
//				System.out.print(stk[i]+" ");
//			System.out.println();
//		}
//	}
}

class EmptyStackException extends RuntimeException{
	public EmptyStackException() {
		super("Stack is empty");
		}
}