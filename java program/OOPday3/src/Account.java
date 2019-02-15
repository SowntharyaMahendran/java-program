
public class Account {
	int accountNo;
	String name;
	double balance;
	public Account(){
		this.accountNo=100;
		this.name="defaulName";
		this.balance=0.0;
		
	}
	public Account(int accountNo,String name,double balance){
		this.accountNo= "accountNo";
		this.name="name";
		this.balance="balance";
	}
	//transaction
	public String withdraw(double amount){
		//logic
		balance=balance-amount;
		return "the balance amount after withdraw" +balance;
		
	}

}
