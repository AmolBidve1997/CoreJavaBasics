package day12;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setAccno(1001);
		System.out.println("Account Number is : " + acc.getAccno());
		
		acc.setName("Amol");
		System.out.println("Account holder Name is : " +acc.getName());
		
		acc.setAmount(200.245);
		System.out.println("Amount availbel in account is : " +acc.getAmount());
		

	}

}
