import java.util.Scanner;


public class CustomerMain {
	public static void main(String[] args){
		Customer cust= new Customer();
		cust.id=1;
		cust.firstName= "Sowntharya";
		cust.middleName="mjs";
		cust.lasName="Mahendran";
		cust.address="chennai";
		cust.gender='f';
		cust.mobileNo="9999999999";
		cust.email="sowntharya@gmail.com";
		cust.amount=10000.98;
		System.out.println("id"+cust.id);
		System.out.println("firstName"+cust.firstName);
		//likewise sop for all data and upcomming is to get input from through keyboard;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter customer id");
		cust.setId(scan.nextInt());
		System.out.println("enter your first name");
		cust.setFirstName(scan.next());
		System.out.println("enter your middile name");
		cust.setMiddleName(scan.next());
		System.out.println("enter your lastname");
		cust.setLasName(scan.next());
		System.out.println("enter address");
		cust.setAddress(scan.next());
		System.out.println("gender");
		cust.setGender(scan.next().charAt(0));
		System.out.println("mobile no.");
		cust.setMobileNo(scan.next());
		System.out.println("enter the email id");
		cust.setEmail(scan.next());
		System.out.println("enter the amount");
		cust.setAmount(scan.nextDouble());
		//read operation
		System.out.println("Id"+cust.getId());
		System.out.println("firstName"+cust.getFirstName());
		System.out.println("middleName"+cust.getMiddleName());
		System.out.println("lastName"+cust.getLasName());
		System.out.println("address"+cust.getAddress());
		System.out.println("gender"+cust.getGender());
		System.out.println("mobileno"+cust.getMobileNo());
		System.out.println("email"+cust.getEmail());
		System.out.println("amount"+cust.getAmount());
				
	}

}
