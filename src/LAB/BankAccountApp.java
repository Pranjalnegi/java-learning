package LAB;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1=new BankAccount("336547",2000);
		BankAccount acc2=new BankAccount("3965322",5000);
		BankAccount acc3=new BankAccount("3565423",6789);
		acc1.setName("JORDAN");
		acc1.getName();
		acc1.payBill(600.55);
		acc2.setName("GOOODD");
		acc2.Deposit(4000);
		acc3.getBalance();
		acc2.accrew(5);
		System.out.println(acc2.Tostring());
		

	}

}

class BankAccount implements accrewInterest{
	//PROPERTIES OF BANK ACCOUNT
	//ENCAPSULATION USING PRIVATE,ENSURING THAT THE USER DOESNT HAVE ACCES TO THESE VARIABLES OTHER THAN THROUGH PROVIDED FUNCIONS
	private static int id=1000;
	private String accountNumber;//ID+RANDOM 2DIGIT NO+ FIRST 2 DIGITS OF
	private static final String routingNumber="3456789";
	double time;
	private String name;
	private String SSN;
	
	private double balance;
//Constructor	
public BankAccount(String SSN,double initDep) {
	initDep=balance;
	this.SSN=SSN;
	System.out.println("Account created successfully ");
	id++;
	setAccountNumber();
	
	}
private void setAccountNumber() {
	int random= (int) (Math.random()*100);
	accountNumber=id+""+random+ SSN.substring(0,2);
	System.out.println("Your account number is "+accountNumber);
	
}
public void setName(String name) {
	this.name=name;
	System.out.println("Name entered successfully");
}
public void getName() {
	System.out.println("YOUR NAME IS "+name);
}
public void payBill(double debit) {
	balance=balance-debit;
	System.out.println("YOU HAVE DEBITED RS:"+debit);
	getBalance();
}
public void Deposit(double amt) {
	balance=balance+amt;
	System.out.println("YOU HAVE CREDIT RS:"+amt+" IN YOUR ACC NO"+accountNumber);
	getBalance();
}
public void getBalance() {
	System.out.println("YOUR BALANCE FOR ACC NO:" +accountNumber+" IS "+balance);
}
@Override
public void accrew(double time) {
	this.time=time;
	balance=balance+(balance*rate*time)/100;
	System.out.println("THE BALANCE AFTER INTEREST WOULD BE "+balance);
	
}
public String Tostring() {
	return "[Account no:"+accountNumber+"]\n [Name : "+name+"]\n[ Routing Number :"+routingNumber+"]\n [ Balance :"+balance+"\n]";
}
}



