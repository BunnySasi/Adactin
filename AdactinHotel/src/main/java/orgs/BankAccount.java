package orgs;

public class BankAccount implements BankFunctionality {

	private String name;
	private Double currentBalance;
	private int minimumBalance;

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void setBalance(double money) {
		// TODO Auto-generated method stub
		this.currentBalance = money;
	}

	@Override
	public void setMinBalance(int min) {
		// TODO Auto-generated method stub
		this.minimumBalance = min;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		System.out.println("\n CustomerName: " + name + "\n Customer Balance: " + currentBalance
				+ "\n Customer Minimum Balance: " + minimumBalance);
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.setName("Hello");
		account.setMinBalance(1000);
		account.setBalance(200000);
		account.displayAll();
	}

}
