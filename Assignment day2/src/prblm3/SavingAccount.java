package prblm3;

public class SavingAccount extends Acount {
	private int interest = 5;
	private double max_withdraw_amt;

	public SavingAccount(String memberName,double max_withdraw_amt, double accountBalance) {
		super(memberName, accountBalance);
		this.max_withdraw_amt = max_withdraw_amt;		// TODO Auto-generated constructor stub
	}
	public double getBalance()
	{ 
		return this.interest+ this.getAccountBalance();
		
	}
	public void withdraw(double amount)
	{
		if(amount<max_withdraw_amt&& this.getAccountBalance()-amount>500)
		{this.setAccountBalance(this.getAccountBalance()-amount);
			
		}
	}

}
