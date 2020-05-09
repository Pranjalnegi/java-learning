package oops;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1= new BankAccount();
		acc1.AccountNo="8365275";
		acc1.AccountHolder="PRANJAL NEGI";
		//SINCE ROUTING NO IS STATIC AND FINAL IT CANNOT BE CHANGED
		BankAccount acc2= new BankAccount("SAVINGS");
		acc2.AccountNo=("45905890567");
		acc2.AccountHolder="Nigga";
		
		
		BankAccount acc3=new BankAccount("BILL GATES",20000);
		acc3.AccountNo="CURRENT";
		acc3.CheckBalance();
		
		System.out.println("THE ACCOUNT NUMBEr FOR THIRD ACCOUNT NUMBER is "+acc3.AccountNo);
		System.out.println("THE ACCOUNT HOLDER FOR SECOND ACCOUNT NUMBER is "+acc2.AccountHolder);
		
		
	}

}
