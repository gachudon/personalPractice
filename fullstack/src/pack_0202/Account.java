package pack_0202;

public class Account {
//	int accountNo;
//	String name;
//	double balance;
//	
//	void insert(int a, String n, double amnt) {
//		accountNo = a;
//		name = n;
//		balance = amnt;
//	}
//	
//	void deposit(double amnt) {
//		balance += amnt;
//	}
//	
//	void withdraw(double amnt) {
//		balance -= amnt;
//	}
//	
//	void checkBalance() {
//		System.out.printf("%s님의 잔액은 %.1f원 입니다.\n", name, balance);
//	}
//	
//	void display() {
//		System.out.println("------------------------");
//		System.out.printf("계좌번호 : %d\n", accountNo);
//		System.out.printf("예금주 : %s\n",name);
//		System.out.printf("잔액 : %.1f원\n", balance);
//		System.out.println("------------------------");
//	}
	
	private String id;
	private String name;
	int balance;
	
	public Account() {
		this.id = "";
		this.name = "";
		this.balance = 0;
	}
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
		this.balance = 0;
	}
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int deposit(int amount) {
		balance +=amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		if(amount <= balance)
			balance -=amount;
		else
			System.out.println("출금액이 잔액초과");
		return balance;
	}
	
	public int transferTo(Account another,int amount) {
		if(amount <= balance) {
			balance -=amount;
			another.deposit(amount);
		}
		else
			System.out.println("송금액이 잔액초과");
		return balance;
	}
	
	
}
