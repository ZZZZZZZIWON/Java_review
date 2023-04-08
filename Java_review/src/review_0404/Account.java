package review_0404;

public class Account {
	private String owner;
	private long balance;
	
	public Account() {
		System.out.println("Account Information");
	}
	
	public Account(String owner) {
		this.owner = owner;
	}

	public Account(long balance) {
		this.balance = balance;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
		System.out.println("Owner : " + owner);
		System.out.println("Balance : " + balance);
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long Deposit(long amount) {
		balance = balance + amount;
		System.out.println("+ " + amount + "��");
		System.out.println("balance : " + balance + "��");
		return balance;
	}
	
	public long Withdraw(long amount) {
		if(balance<amount) {
			System.out.println("�ܾ��� �����մϴ�.");
		}
		else {
		balance = balance - amount;
		System.out.println("- " + amount + "��");
		System.out.println("balance : " + balance + "��");}
		return balance;
	}
	
//	public static void main(String[] args) {
//		Account account = new Account();
//		account.setOwner("������");
//		account.setBalance(100000);
//		System.out.println("Owner : " + account.getOwner());
//		System.out.println("Balance : " + account.getBalance() + "��");
//		
//		account.Deposit(20000);
//		
//	}
}

	class AccountTest{
		public static void main(String[] args) {
			Account AW = new Account();
			Account AW2 = new Account("������",10000);
			
		}
	}
