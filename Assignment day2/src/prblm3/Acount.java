package prblm3;

public class Acount {
	private String memberName;
	private String accountNumber;
	private double accountBalance;
	public Acount(String memberName, double accountBalance)
	{ this.accountNumber = 10000 + (int)(Math. random ()*89999) + "";
	 this.memberName = memberName;
	 this.accountBalance=accountBalance;
	 
		
	}
	public void deposit(double amount)
	{
		this.accountBalance +=amount;
	}
	public String getMemberName() {
		return memberName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
