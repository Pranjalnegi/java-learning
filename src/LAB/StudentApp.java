package LAB;
import java.util.concurrent.ThreadLocalRandom;

public class StudentApp {

	public static void main(String[] args) {
		Student stu1=new Student("5463");
		Student stu2=new Student("5463");
		stu1.setdetail("NIBBA");
		stu1.getdetail();
		stu1.enroll(10000);
		stu1.pay(8000);
		stu1.checkBalance();
		stu1.showcourse("engeeeeeeshhh");
		stu1.setCity("HJAK");
		stu1.setPhone("567896789");
		stu1.setState("UK");
		
		
		
		
		
	
	
}
}
class Student{
	private String name;
	private String SSN;
	private String email;
	private static int id=215;
	private String user_id;
	private String Phone;
	private String City;
	private String State;
	private int balance;

	

public Student(String SSN) {
	this.SSN=SSN;
	
	getUserid();
}
public void setdetail(String name) {
	this.name=name;
	email=name+SSN+"@gmail.com";
	System.out.println("THE details are entered successfully:");
}
public void getdetail() {
	System.out.println("THE NAME IS "+name);
	System.out.println("THE email is "+email);
	getUserid();
	
}
private void getUserid() {
	int randomNum =ThreadLocalRandom.current().nextInt(1000, 9001);
	int length= SSN.length();
	user_id=id+randomNum+SSN.substring(length-4,length);
	System.out.println("YOUR GENERATED USER ID IS "+user_id);
}
public void enroll(int initfee) {
	System.out.println("SUCCESSFULLY ENROLLED");
    balance=initfee;
}

public void pay(int amt) {
	balance=balance-amt;
	System.out.println("You have paid"+amt);
	
}
public void checkBalance() {
	System.out.println("YOUR BALANCE IS "+balance);
}


public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	this.Phone = phone;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	this.City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	this.State = state;
}
public void showcourse(String course) {
	System.out.println("YOU CAN CONTACT:"+Phone+"\n Your city is"+City+"\n AND STATE IS "+State);
	
	
}
}





