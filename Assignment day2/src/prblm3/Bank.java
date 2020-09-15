package prblm3;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		System.out.println("Enter user name");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		System.out.print("Enter account type (savings/current): ");
		String accountType = sc.nextLine();
		if (accountType.equals("saving")) {
			System.out.print("Enter initial balance (>500): ");
			double initialBalance = sc.nextDouble();
			if (initialBalance < 500.0)
				{initialBalance = 500.0;}
			System.out.print("Enter maximum withdraw amount limit: ");
			double maxWithdrawAmt = sc.nextDouble();
			SavingAccount saving = new SavingAccount(username, maxWithdrawAmt, initialBalance);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("0: Exit");
				System.out.print("Enter your choice");
				int choice=sc.nextInt();
				switch(choice)
				{case 1 : {System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+saving.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double amount=sc.nextDouble();
					saving.deposit(amount);
					if(showBalance)
						System.out.println("Balance after deposit = "+saving.getAccountBalance());
				}
				
				case  2 : {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+saving.getAccountBalance());
					System.out.print("Enter amount  to withdraw: ");
					double amount=sc.nextDouble();
					saving.withdraw(amount);
					if(showBalance)
						System.out.println("Balance after withdraw= "+saving.getAccountBalance());
				}
				case 3: {
					System.out.println("Balance = "+saving.getAccountBalance());
				}
				case 0: {
					break;
				}
			}

		} }
		else if (accountType.equals("current")) {
			System.out.print("Enter initial balance: ");
			double initialBalance = sc.nextDouble();
		
			System.out.print("Enter trade license number: ");
			String tradeLicenseNumber = sc.nextLine();
			CurrentAccount c = new CurrentAccount(username,  initialBalance,tradeLicenseNumber);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("0: Exit");
				System.out.print("Enter your choice: ");
				int choice=sc.nextInt();
				switch(choice) {
				case 1 : {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+c.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double money=sc.nextDouble();
					c.deposit(money);
					if(showBalance)
						System.out.println("Balance after deposit = "+c.getAccountBalance());
					break;
				}
				case 2 :{
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+c.getAccountBalance());
					System.out.print("Enter amount of money to withdraw: ");
					double money=sc.nextDouble();
					c.withdraw(money);
					if(showBalance)
						System.out.println("Balance after withdraw= "+c.getAccountBalance());
					break;
				}
				case 3: {
					System.out.println("Balance = "+c.getAccountBalance());
					break;
				}
				case 0: {
					break;
				}
			}
		}}
		sc.close();
	}
}