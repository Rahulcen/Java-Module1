package oopsday2.atm;

public class BankOfAmericaa implements BankingIface {
	
	private Account account=new Account();

	@Override
	
	public double withdraw(double amount) {
		account.setBalance(account.getBalance()-amount);
		return account.getBalance();
		// TODO Auto-generated method stub
		//return 0;
	}

	@Override
	public double deposit(double amount) {
		account.setBalance(account.getBalance()+amount);
		return account.getBalance();
		
		// TODO Auto-generated method stub
		//return 0;
	}

	@Override
	public double balanceEnirhy(int actno) {
	   return account.getBalance();
		// TODO Auto-generated method stub
		//return 0;
	}

}
