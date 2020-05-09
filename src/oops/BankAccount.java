package oops;

public class BankAccount {
	String AccountHolder;
	String AccountNo;
	static final String RountingNumber="123456";
	String name;
	double balance=500;
	
BankAccount() {
	System.out.println("Bank account Created");
}
BankAccount(String AccountType) {
	System.out.println("ACCOUNT CREATED FOR ACCOUNT TYPE:"+AccountType);
}
BankAccount(String Branch,double init){
System.out.println("HELLO MR X YOUR BRANCH IS "+Branch);
if (init<1000) {
	System.out.println("SORRY INITIAL DEPOSIT SHOULD BE GREATER THAN 1000");
}
else {
	System.out.println("WELCOME HOMIE YOU HAVE DEPOSITED :"+init);
}
balance=balance+init;
}
void deposit() {}
void withdraw() {}
void CheckBalance() {
	System.out.println("THE ACCOUNT BALANCE IS "+balance);
}
void BranchName() {}

		
}

