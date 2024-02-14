package pack_0214;

public class Account {
	
	private String id;		// 계좌번호
	private String name;	// 고객명
	private int balance;	// 잔액
	
	public Account() {
		balance = 0;
	}

	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}
