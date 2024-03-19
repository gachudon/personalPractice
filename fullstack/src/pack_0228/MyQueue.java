package pack_0228;

public class MyQueue {
	private int[] que;
	private int capa;
	private int front;
	private int rear;
	private int num;
	
	public class EmptyMyQueueException extends RuntimeException{
		public EmptyMyQueueException(String msg) {super(msg);}
	}
	
	public class OverflowMyQueueException extends RuntimeException{
		public OverflowMyQueueException(String msg) {super(msg);}
	}
	
	public MyQueue(int capa) {
		num = front = rear = 0;
		this.capa = capa;
		try {
			que = new int[capa];
		}catch(OutOfMemoryError e) {
			this.capa = 0;
		}
	}
	
	public int enque(int element) throws OverflowMyQueueException{
		
		if(num>=capa)
			throw new OverflowMyQueueException("큐가 가득 참");
		que[rear++] = element;
		num++;
		if(rear == capa)
			rear = 0;
		return element;
	}
	
	public int deque() throws EmptyMyQueueException{
		if(num <= 0)
			throw new EmptyMyQueueException("큐가 비어 있음");
		int x = que[front++];
		num--;
		if(front == capa)
			front = 0;
		return x;
	}
	
	public int peek() throws EmptyMyQueueException{
		if(num <= 0)
			throw new EmptyMyQueueException("큐가 비어 있음");
		return que[front];
	}
	
	public int indexOf(int x) {
		for (int i=0;i<num;i++) {
			int idx = (i+front)%capa;
			if(que[idx]==x)
				return idx;
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear= 0;
	}
	
	public int capacity() {return capa;}
	public int size() {return num;}
	public boolean isEmpty() {return num<=0;}
	public boolean isFull() {return num>= capa;}
	public void dump() {
		if(num<=0)
			System.out.println("큐가 비어있음.");
		else {
			for(int i=0;i<num;i++)
				System.out.print(que[i+front%capa]+" ");
			System.out.println();
		}
	}
}
