package prblm3;

public class CurrentAccount extends Acount {
	private String tradeLicenseNumber;
public CurrentAccount(String memberName, double accountBalance,String tradeLicenseNumber) {
		super(memberName, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
		// TODO Auto-generated constructor stub
	}
public double getBalance()
{
	return getAccountBalance();}

public void withdraw(double amount)
{ if(amount<=this.getAccountBalance())
{this.setAccountBalance(this.getAccountBalance()-amount);}
	}

}
