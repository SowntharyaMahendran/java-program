import java.util.Scanner;


public class AccountMain {
	public static void main(String[] args){
		Account ac=new Account();
		Scanner scan= new Scanner(System.in);
		boolean valid;
		System.out.println("enter the account number");
		ac.accountNo=scan.nextInt();
		System.out.println("enter your name");
		ac.name=scan.next();
		System.out.println("enter the balance");
		ac.balance=scan.nextDouble();
		do{
		System.out.println("how much amount u want to withdarw?");
		double amount=scan.nextDouble();
		String finalbalance= ac.withdraw(amount);
		System.out.println(finalbalance);
		System.out.println("do u want to start again");
		String status=scan.next();
		if(status.equals("yes"))
			
			{
			valid=true;
			}else {
				valid=false;
				System.out.println("Thank you");
			}
		}while(valid);

	}

}
