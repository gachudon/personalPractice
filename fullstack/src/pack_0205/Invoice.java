package pack_0205;

public class Invoice {
	private int id; // 상품 아이디
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmountDiscount() {
		return amount - amount*(double)customer.getDiscount()/100;
	}
	
	public String toString() {
		return "Invoice[id="+id+", customer="+customer.toString()+", amount="+amount+"]";
	}
	
}
