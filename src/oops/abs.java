package oops;

class oops{
	String name;
	String email;
	String gender;
	String phone;
void walk() {
	System.out.println(name +" of gender" +gender+ " is walking");
}
void run() {
	System.out.println(name +" of gender" +gender+ " is running");
}
void fly() {
	System.out.println(name +" of gender  " +gender+ " is flying");
}
}
public class abs {

	public static void main(String[] args) {
	//INSTANTIATING AN OBJECT
		oops person1=new oops();
		//DEFINING SOME PROPERTIES
		person1.name="RAMAN";
		person1.email="ram@qer";
		person1.gender="MALE";
	
		
		//ABSTRACTION:SHOWING ONLY ESSENTIAL FUNCTIONS
		person1.fly();
		
		oops person2= new oops();
		person2.name="JAKCY";
		person2.gender="FEMALE";
		person2.run();
		
		
		

	}

}
